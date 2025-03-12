package Ejercicio2;
/**
 *
 * @author María Lizarazo
 */
public class AuditTransfMonet {
// Este metodo nos permitira recibir la transferencia y realizar allí mismo la auditoria del mismo.
    public boolean transferenciaRealizada(Transferencia transferencia) {
// El if nos verificará si la transferencia es importante o no.
        if (ComprobarTransferencia.esTransferenciaImportante(transferencia)) {
// Mediante el llamado de la clase EnvioSMS obtendremos la dirección del auditor y el mensaje de aviso.
            String auditor = EnvioSMS.obtenerDireccionMailAuditor();
            String mensaje = EnvioSMS.componerMensajeAviso(transferencia);
// Finalmente se enviará el mensaje de comprobación.
            EnviarComprobacion.enviarMensaje(auditor, mensaje);
        }
        return false;
    }
}

// Se separa el metodo esTransferenciaImportante, se crea una clase ComprobarTransferencia
// y se añade ahí para que sea dependiente de sí misma.
class ComprobarTransferencia {
    public static boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }
}

// Se separan los metodos obtenerDireccionMailAuditor y componerMensajeAviso, se crea una clase
// EnvioSMS y se añaden ahí para que sean dependientes de sí mismas.
class EnvioSMS {
    public static String obtenerDireccionMailAuditor() {
        return "mail-auditor";
    }

    public static String componerMensajeAviso(Transferencia transferencia) {
        return "aviso-transferencia-importante";
    }
}

// Se separa el metodo abrirConexionMail, se crea una clase ConectarEmail
// y se añade ahí para que sea dependiente de sí misma.
class ConectarEmail {
    public static ConexionMail abrirConexionMail() {
        return ConexionMail.getInstance();
    }
}

// Se hace la separación del metodo enviarMensaje y el Try-Finally, se crea la clase EnviarComprobacion
// y se añade todo dentro de esta única clase.
class EnviarComprobacion {
    public static void enviarMensaje(String Destinario, String mensaje) {
        ConexionMail conexionMail = null;

        try {
            conexionMail = ConectarEmail.abrirConexionMail();
            conexionMail.enviar(new Mail().to(Destinario).withBody(mensaje));
        } finally {
            if (conexionMail != null) {
                conexionMail.cerrar();
            }
        }
    }
}