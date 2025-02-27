package trabajorefuerzo;

public class PartidosPlayOff extends Partidos {
    private String fase;

    public PartidosPlayOff() {
    }

    public PartidosPlayOff(String fase) {
        this.fase = fase;
    }

    public PartidosPlayOff(String fase, String equipoLocal, String equipoVisitante, int cestasEqLocal, int cestasEqVisit, boolean partidoFinalizado, String fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEqLocal, cestasEqVisit, partidoFinalizado, fechaPartido);
        this.fase = fase;
    }
    
}
