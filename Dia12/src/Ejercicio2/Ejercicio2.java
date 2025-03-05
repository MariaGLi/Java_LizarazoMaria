package Ejercicio2;
/**
 *
 * @author María Lizarazo
 */

public class Ejercicio2 {

    public void transferenciaRealizada(Transferencia transferencia) {
        if (this.esTransferenciaImportante(transferencia)) {
            String auditor = this.obtenerDireccionMailAuditor();
            String mensaje = this.componerMensajeAviso(transferencia);
            ConexionMail conexionMail = null;
            try {
                conexionMail = this.abrirConexionMail();
                conexionMail.enviar(new Mail().to(auditor).withBody(mensaje));
            } finally {
                if (conexionMail != null) {
                    conexionMail.cerrar();
                }
            }
        }
    }

    private boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }

    private String obtenerDireccionMailAuditor() {
        return "mail-auditor";
    }

    private String componerMensajeAviso(Transferencia transferencia) {
        return "aviso-transferencia-importante";
    }

    private ConexionMail abrirConexionMail() {
        return ConexionMail.getInstance();
    }
}