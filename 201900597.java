import java.util.Scanner;

public class Practica {

    Scanner entrada = new Scanner(System.in);
    public static int numero = 0;
    public static int num = 0;
    public static int numpar = 0;
    public static int prom = 0;
    public static int contador = 0;

    public Practica() {
        System.out.println("Seleccione una opcion");
        System.out.println("1-> Ejercicio 1 \n2-> Ejercicio 2 \n3-> Ejercicio 3 \n4-> Ejercicio 4");
        String opcion = entrada.nextLine();
        switch (opcion) {
            case "1":
                ejercicio1();
                break;
            case "2":
                ejercicio2();
                break;
            case "3":
                ejercicio3();
                break;
            case "4":
                ejercicio4();
                break;

            default:
                System.out.println("Seleccione una de las opciones");
                break;

        }
    }
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------

    private void ejercicio1() {

        System.out.println("Ingrese un numero con valor 'N'");
        numero = Integer.parseInt(entrada.nextLine());
        if (numero < 0) {
            System.out.println("Ingrese un numero mayor 0");
        } else {
            while (numero != 0) {

                if (numero % 2 == 0) {
                    numpar = numpar + 1;
                    prom = numpar;
                    System.out.println("El promedio es: " + prom);

                } else {
                    num = num + numero;
                    System.out.println(num);
                }

                numero = numero - 1;
            }
        }
    }
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------

    private boolean ejercicio2() {
        int A[] = {10, 15, 13, 1, 58, 7};
        int B[] = {5, 7, 9, 12, 13, 11};
        System.out.println("Ingrese un numero con valor 'N'");
        numero = Integer.parseInt(entrada.nextLine());
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] - numero == B[j]) {
                    System.out.println("TRUE");
                    return true;
                }
            }
        }
        System.out.println("FALSE");
        return false;
    }
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------

    private void ejercicio3() {
        System.out.println("Ingrese un numero con valor 'N'");
        numero = Integer.parseInt(entrada.nextLine());
        if (numero < 0) {
            System.out.println("Ingrese un numero mayor 0");
        } else {
            while (numero > num) {
                if (contador % 2 == 0) {
                    num = num + 2;
                    System.out.print(num + ", ");
                } else {
                    num = num + 3;
                    System.out.print(num + ", ");
                }
                contador++;
            }
//            System.out.println(num);
        }
    }
//-----------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------

    private void ejercicio4() {
        String cadenaInver = "";
        System.out.println("Ingrese un texto");
        String texto = entrada.nextLine();
        int letras = texto.length();
        for (int i = letras - 1; i >= 0; i--) {
            cadenaInver = cadenaInver + texto.charAt(i);
        }
        System.out.println(cadenaInver);
    }

}
