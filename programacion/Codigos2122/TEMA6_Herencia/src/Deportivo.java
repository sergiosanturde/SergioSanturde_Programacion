public class Deportivo extends Coche{

    private int par;

    //todo lo que tiene coche


    public Deportivo(){}

    public Deportivo(String matricula,String bastidor,int cv,int cc,int par){
        super(matricula,bastidor,cv,cc);
        this.par = par;
    }

    @Override
    public void calcularVelocidad(int velocidad){
        super.calcularVelocidad(velocidad + ((int)Math.random()*11)+30);
        System.out.println(getVelocidad());
        System.out.println("velocidad calculada");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Par: " + par);
    }

    //G Y S

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
