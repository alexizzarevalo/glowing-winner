import java.util.Scanner;

/**
 *
 * @author alexis
 */
public class Practica {

    public void ejercicio1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número limite:");
        int limite = s.nextInt();
        int sumaPares = 0;
        int sumaImpares = 0;
        int contPares = 0;
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                sumaPares = sumaPares + i;
                ++contPares;
            } else {
                sumaImpares = sumaImpares + i;
            }
        }
        System.out.println("Suma impares: " + sumaImpares);
        System.out.println("Promedio pares: " + (sumaPares / contPares));
    }

    public boolean ejercicio2(int[] arr1, int[] arr2, int n) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j] - n) {
                    return true;
                }
            }
        }
        return false;
    }

    public void ejercicio3() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número limite:");
        int limite = s.nextInt();
        int SumaNum = 0;
        int Numero = 2;
        int Cont = 1;
        while (Numero < limite) {
            System.out.print(Numero + ", ");
            SumaNum = SumaNum + Numero;
            if (Cont % 2 == 0) {
                Numero = Numero + 2;
            } else {
                Numero = Numero + 3;
            }
            ++Cont;
        }
    }

    public void ejercicio4() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String Cadena = s.nextLine();
        char[] Letras = Cadena.toCharArray();
        for (int i = Letras.length - 1; i >= 0; i--) {
            System.out.print(Letras[i]);
        }
    }

}
