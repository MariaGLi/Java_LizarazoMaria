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

    public String mostrarPartidoLiga(){
       return "La jornada: " + jornada + " el equipo local " + equipoLocal + " el equipo visitante " + equipoVisitante +". Las cestas del equipo local son: " + cestasEqLocal + ". Las cestas del equipo visitante son: " + cestasEqVisit + " y la fecha del partido fue: ";
    }
    
}
