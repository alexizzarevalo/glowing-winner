
import java.util.Scanner;

public class Practica {

    public void ejercicio1(){


        System.out.println("Ingrese rango");

        int rango;

        int sum = 0;
        int prom = 0;

        Scanner e1 = new Scanner(System.in);
        rango = e1.nextInt();

        for (int i = 0; i < rango; i++) {
            System.out.println(i);

        }

        for (int i = 0; i <= rango; i=i+2) {
            sum = sum +1;

        }

        System.out.println("la Suma de los impares es:" + sum);
        for (int i = 0; i < rango; i=i+2) {

            sum = sum + 1;
            prom = sum/rango;

        }

        System.out.println("El promedio de pares es:" + prom);




    }

    public void ejercicio2(){



    }

    public void ejercicio3(){

        System.out.println("Ingrese un limite");
        Scanner e1 = new Scanner(System.in);
        int num = 2;
        int lim = e1.nextInt();

        System.out.print(num + ",");
        while (num < lim){
            for (int i = 0; i <= 3; i++) {
                if (i == 1){
                    num = num+3;
                    System.out.print(num + "," );
                    if(num >= lim){
                        break;
                    }
                }
                else if(i == 2){
                    num = num+2;
                    System.out.print(num + ",");
                    if(num >= lim){
                        break;
                    }
                }

            }
        }

        System.out.println();


    }

    public void ejercicio4(){

        System.out.println("ingrese un texto");
        Scanner e1 = new Scanner(System.in);
        String cadena;
        cadena = e1.next();

        char letras = cadena.charAt(0);

        char letras1[] = new char[letras];

        for (int i = 0; i < letras; i++) {

            letras1[i] = letras;

        }

    }

}
