package trabajorefuerzo;

public class PartidosLiga extends Partidos {
    private int jornada;

    public PartidosLiga() {
    }

    public PartidosLiga(int jornada) {
        this.jornada = jornada;
    }

    public PartidosLiga(int jornada, String equipoLocal, String equipoVisitante, int cestasEqLocal, int cestasEqVisit, boolean partidoFinalizado, String fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEqLocal, cestasEqVisit, partidoFinalizado, fechaPartido);
        this.jornada = jornada;
    }

    /*@Override
    public void mostrarPartLiga() {
        System.out.println(jornada + equipoLocal); 
    }*/
    
}
