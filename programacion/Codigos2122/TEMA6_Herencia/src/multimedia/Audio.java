package multimedia;

import java.io.StringReader;

public class Audio extends Elemento{

    private int duration;
    private String soporte;

    public Audio(String id, String titulo, String autor, String tamanio, String formato, int duration, String soporte) {
        super(id, titulo, autor, tamanio, formato);
        this.duration = duration;
        this.soporte = soporte;
    }
    public void metodoAudio(){

    }



    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion: "+duration);
        System.out.println("Soporte: "+soporte);
    }


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
