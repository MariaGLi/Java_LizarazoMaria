package trabajorefuerzo;

public class Partidos {
    protected String equipoLocal;
    protected String equipoVisitante;
    protected String cestasEqLocal;
    protected String cestasEqVisit;
    protected String partidoFinalizado;
    protected String fechaPartido;

    public Partidos() {
    }

    public Partidos(String equipoLocal, String equipoVisitante, String cestasEqLocal, String cestasEqVisit, String partidoFinalizado, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEqLocal = cestasEqLocal;
        this.cestasEqVisit = cestasEqVisit;
        this.partidoFinalizado = partidoFinalizado;
        this.fechaPartido = fechaPartido;
    } 
}
