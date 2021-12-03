package arrayList;

public class ejercicioPalindromo {
    public static void main(String[] args) {

        String palindromo = "Alli ve sevilla";
        boolean palindromoComprobacion = false;

        palindromo =  palindromo.replace(" ","").toLowerCase();


        for (int i = 0; i < palindromo.length()/2; i++) {
            if (palindromo.charAt(i) == palindromo.charAt(palindromo.length() -1-i)) {
                palindromoComprobacion = true;
            }else{
                palindromoComprobacion = false;
                break;
            }
        }
        if (palindromoComprobacion==true){
            System.out.println("La palabra es palindromo");
        }else{
            System.out.println("La palabra no es palindroma");
        }
    }
}
