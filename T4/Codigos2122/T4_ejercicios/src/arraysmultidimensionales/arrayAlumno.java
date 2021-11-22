package arraysmultidimensionales;

public class arrayAlumno {

    public static void main(String[] args) {
        Object[][] alumnos = new Object[3][5];


        
        alumnos[0][0] = "Sergio";
        alumnos[0][1] = 6;
        alumnos[0][2] = 5;
        alumnos[0][3] = 7;
        alumnos[0][4] = false;

        alumnos[1][0] = "Pedro";
        alumnos[1][1] = 4;
        alumnos[1][2] = 7;
        alumnos[1][3] = 9;
        alumnos[1][4] = true;

        alumnos[2][0] = "Jose";
        alumnos[2][1] = 7;
        alumnos[2][2] = 1;
        alumnos[2][3] = 2;
        alumnos[2][4] = true;


        for (int i = 0; i < alumnos.length; i++) {

            int suspenso=0;
            int suma = 0;

            for (int j = 1; j < alumnos[i].length-1; j++) {
                suma += (int)alumnos[i][j];
                if ((int)alumnos[i][j] < 5){
                    suspenso++;
                }
            }
            double media  = suma /3;
        }
    }
}
