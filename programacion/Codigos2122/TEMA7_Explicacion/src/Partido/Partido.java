package Partido;

public class Partido {

    private boolean jugado;
    private int golesLocal,golesVisitante;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(boolean jugado, int golesLocal, int golesVisitante) {
        this.jugado = jugado;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    //
    public void agregarGolesLocal(){
        golesLocal += (int)(Math.random()*3);
    }
    public void agregarGolesVisitante(){
        golesVisitante += (int)((Math.random())*3);
    }
    public void mostrarResultado(){
        System.out.println(equipoVisitante.getNombre() + golesVisitante);
        System.out.println(equipoLocal.getNombre() + golesLocal);
    }


    //
    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    class Equipo{
        int puntos;
        String nombre;

        public Equipo(int puntos, String nombre) {
            this.puntos = puntos;
            this.nombre = nombre;
            if (nombre.equalsIgnoreCase("Barcelona")){
                setEquipoLocal(this);
            }else if (nombre.equalsIgnoreCase("Madrid")){
                setEquipoVisitante(this);
            }
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
