import java.util.Scanner;

public class Practica {

    public static Scanner lector = new Scanner(System.in);


    public void ejercicio1() {
        int num = 0;
        int rango = 0;
        int sum = 0;
        int cont = 0;
        int par = 0;
        int impar = 0;


        System.out.println("Ingrese el numero del rango");
        rango = lector.nextInt();

        for (int i = 0; i < rango; i++) {
            num++;

            if (num % 2 == 0) {
                sum = sum + num;
                cont++;

            } else {
                impar = num + impar;
            }
        }
        par = sum / cont;

        System.out.println("Suma de números impares : " + impar);
        System.out.println("Promedio de números pares : " + par);


    }

    public boolean ejercicio2(int arreglo1[], int arreglo2[], int number) {
        int num = 0;
        boolean val = false;

        for (int i = 0; i < arreglo1.length; i++) {
            num = arreglo2[i] - number;
            for (int j = 0; j < arreglo2.length; j++)
                if (num == arreglo2[j]) {
                    val = true;
                }
        }
        System.out.println("Boolean : " + val);

        return val;
    }

    public void ejercicio3() {
        int cont = 0;
        int num = 0;

        System.out.println("Ingrese un numero");
        num = lector.nextInt();
        for (cont = 1; cont < num; cont++) {
            System.out.print((cont * 2) + " ");
        }

    }


    public void ejercicio4() {
        String texto = "Introduccion a la programacion y computacion 1";
        String alreves = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            alreves += texto.charAt(i);

        }
        System.out.println("Texto al Revés: " + alreves);

    }
}
