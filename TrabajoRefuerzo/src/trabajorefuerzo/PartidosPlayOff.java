package trabajorefuerzo;

public class PartidosPlayOff extends Partidos {
    private String octavos;
    private String cuartos;
    private String finalWin;

    public PartidosPlayOff() {
    }

    public PartidosPlayOff(String octavos, String cuartos, String finalWin) {
        this.octavos = octavos;
        this.cuartos = cuartos;
        this.finalWin = finalWin;
    }

    public PartidosPlayOff(String octavos, String cuartos, String finalWin, String equipoLocal, String equipoVisitante, String cestasEqLocal, String cestasEqVisit, String finalPartido, String fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEqLocal, cestasEqVisit, finalPartido, fechaPartido);
        this.octavos = octavos;
        this.cuartos = cuartos;
        this.finalWin = finalWin;
    }
    
}
