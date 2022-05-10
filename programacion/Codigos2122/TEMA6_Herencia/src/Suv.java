public class Suv extends Coche{

    private boolean traccion;

    public Suv(){}
    public Suv(String matricula,String bastidor,int cv,int cc,boolean traccion) {
        super(matricula, bastidor, cv, cc);
        this.traccion = traccion;
    }

    @Override
    public void calcularVelocidad(int velocidad){
        super.calcularVelocidad(velocidad + ((int)Math.random()*11)+10);
        System.out.println(getVelocidad());
        System.out.println("velocidad calculada");
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Traccion: " + traccion);
    }

    //G Y S
    public boolean isTraccion() {
        return traccion;
    }

    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }
}
