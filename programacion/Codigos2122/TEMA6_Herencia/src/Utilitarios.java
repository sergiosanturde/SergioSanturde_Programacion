public class Utilitarios extends Coche{

    private int plazas;

    public Utilitarios(){}

    public Utilitarios(String matricula,String bastidor,int cv,int cc,int plazas) {
        super(matricula, bastidor, cv, cc);
        this.plazas = plazas;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Plazas: " + plazas);
    }
    //G Y S
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
