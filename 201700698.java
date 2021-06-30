/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica {

    public static void ejercicio1(int n) {
        System.out.println("Ejercicio 1");
        int contador = 1;
        int contador_pares=1;
        int contador_Imares=1;
        int contadorPromedio=1;

        while (contador != n) {

            if (contador==1) {

                contador++;
            }else
            if ((contador % 2) != 0) {

                contador_Imares+=contador_Imares;
                contador++;

            } else if ((contador % 2) == 0 ) {


                contador_pares+=contador_pares;
                contadorPromedio ++;

                contador++;
            }


        }
        System.out.println("Suma Impares:  " + contador_Imares);
        System.out.println("Promedio Pares:  "+ contadorPromedio);


    }
    public static boolean ejercicio2(int A[],int B[] , int n){

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if ((A[i]-n)==B[j]) {
                    System.out.println("->"+(A[i]-n));
                    System.out.println("es igual a "+B[j]);
                    return true;
                }
            }

        }

        return false;

    }
    public static void ejercicio3(){
        System.out.println("Ingrese n");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int contador=0;
        int s=1;
        int c=1;
        while (contador != n) {

            if (c<3) {
                s=s+2;
                System.out.print((s+","));

                c++;
            } if (c==3) {
                s=s+3;
                System.out.print(s+",");
                c=1;
            }




            contador++;
        }


    }
    public static void ejercicio4(){
        Scanner sc = new Scanner (System.in);
        String Cadena = sc.nextLine();


        for (int i = Cadena.length()-1; i>=0; i--) {
            System.out.print(Cadena.charAt(i));
        }
        System.out.println("");
    }
}
