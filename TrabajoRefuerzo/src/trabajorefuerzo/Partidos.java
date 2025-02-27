package trabajorefuerzo;

public class Partidos {
    protected String equipoLocal;
    protected String equipoVisitante;
    protected int cestasEqLocal;
    protected int cestasEqVisit;
    protected boolean partidoFinalizado;
    protected String fechaPartido;

    public Partidos() {
    }

    public Partidos(String equipoLocal, String equipoVisitante, int cestasEqLocal, int cestasEqVisit, boolean partidoFinalizado, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEqLocal = cestasEqLocal;
        this.cestasEqVisit = cestasEqVisit;
        this.partidoFinalizado = partidoFinalizado;
        this.fechaPartido = fechaPartido;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getCestasEqLocal() {
        return cestasEqLocal;
    }

    public void setCestasEqLocal(int cestasEqLocal) {
        this.cestasEqLocal = cestasEqLocal;
    }

    public int getCestasEqVisit() {
        return cestasEqVisit;
    }

    public void setCestasEqVisit(int cestasEqVisit) {
        this.cestasEqVisit = cestasEqVisit;
    }

    public boolean isPartidoFinalizado() {
        return partidoFinalizado;
    }

    public void setPartidoFinalizado(boolean partidoFinalizado) {
        this.partidoFinalizado = partidoFinalizado;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    
    
}
