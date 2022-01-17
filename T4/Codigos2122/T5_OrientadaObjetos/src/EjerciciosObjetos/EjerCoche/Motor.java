package EjerciciosObjetos.EjerCoche;

public class Motor {
        //ATRIBUTOS
        private int litrosAceite,CV;

        //CONSTRUCTOR
    public Motor(int caballos,int litros){
        this.CV = caballos;
        this.litrosAceite = litros;
    }

        //GETTER SETTER

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public int getCV() {
        return CV;
    }
}
