
import java.util.Scanner;

public class Practica {
static Scanner sc = new Scanner(System.in);

    public static void ejercicio1() {

        int numeroLimite = 0;
        int sumapar = 0;
        int sumaimpar = 0;
        int sumaCantPromedio = 0;
        int promedio=0;

        System.out.println("Ingrese un numero limite");
        numeroLimite = sc.nextInt();

        for (int i = 1; i < numeroLimite + 1 ; i++) {

            if (i%2 == 0) {

                sumapar = sumapar + i;
                sumaCantPromedio++;

            }else
            {
                sumaimpar = sumaimpar +i;
            }

        }

        promedio = sumapar/sumaCantPromedio;

        System.out.println("Suma impares " + sumaimpar);

        System.out.println("Promedio Pares " + promedio);

    }

    public boolean ejercicio2(int num1[], int num2[], int n) {

        int auxi = 0;

        if (num1 != null && num2 != null) {
            for (int i = 0; i < num1.length; i++) {
                auxi = num1[i] - n;
                for (int j = 0; j < num2.length; j++) {
                    if (num2[j] == auxi) {
                        System.out.println("true");
                        return true;

                    }
                }
            }
        }
        System.out.println("false");
        return false;
    }

    public static void ejercicio3(){
        int numeroLimite = 0;
        int mas2 = 0;
        int mas3 =0;
        System.out.println("Ingrese un numero limite");
        numeroLimite = sc.nextInt();

        for (int i = 0; i < numeroLimite; i++) {

            if (i%2 == 0) {
                mas2 = mas3+2;
                System.out.print("" + mas2 + ", ");

            }else
            {
                mas3 = mas2 + 3;
                System.out.print("" + mas3 + ", ");


            }


        }

    }

    public static void ejercicio4(){
        String texto;
        String cadena ="";
        System.out.println("Ingrese una  texto para invertirla");
       texto = sc.nextLine();

        for (int i =texto.length()-1;i>=0;i--)
            cadena = cadena + cadena.charAt(i);
        System.out.println(cadena);

    }

}
