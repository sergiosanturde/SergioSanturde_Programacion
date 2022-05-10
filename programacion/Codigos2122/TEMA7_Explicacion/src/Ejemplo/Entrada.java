package Ejemplo;

public class Entrada {

    public static void main(String[] args) {
        ClaseC claseC = new ClaseC();
        ClaseB claseB = new ClaseB();
        ClaseA claseA1 = new ClaseA() {
            @Override
            public void mostrarMensaje() {
                System.out.println("mensaje diferente");
            }

            @Override
            public void mostrarMensajeAbstracto() {
                System.out.println("Mensaje abstracto de la clasaA");
            }
        };
        ClaseA claseA2 = new ClaseA() {

            @Override
            public void mostrarMensajeAbstracto() {
                System.out.println("Mensaje abs dif");
            }
        };
        claseC.registrarMensaje(claseA1);
        claseC.registrarMensaje(claseA2);
        claseC.registrarMensaje(new ClaseA() {
            @Override
            public void mostrarMensajeAbstracto() {
                System.out.println("mensaje anonimo");
            }
        });
        claseC.registrarMensaje(claseA1);
    }
}
