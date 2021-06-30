public class Practica {
    public static void main(String[] args) {

    }
    public static void ejercicio1(int n){
        int suma = 0;
        int promedio = 0;
        int contadorpares = 0;
        Integer[] numeros = new Integer[n+1];
        Integer[] pares = new Integer[n+1];
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                System.out.print(i+", ");
            }else {
                System.out.println(i);
            }
                if ( i%2 != 0 ) {
                    numeros[i] = i;
                }else {
                    pares[i] = i;
                    contadorpares++;
                }
        }
        System.out.println("");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != null) {
                suma = suma+numeros[i];
            }
        }
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] != null) {
                promedio = promedio+pares[i];
            }
        }
        System.out.println("Suma de impares: "+suma);
        System.out.println("Promedio de pares: "+promedio/contadorpares);
    }
    public static boolean ejercicio2(Integer[] arreglo1,Integer[] arreglo2, int n){
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != null && arreglo2[i] != null) {
                for (int j = 0; j < arreglo2.length; j++) {
                    if (arreglo2[j] != null ) {
                        if (n == arreglo1[i]-arreglo2[j]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void ejercicio3(int n){
        int contador = 0;
        for (int i = 0; i < n; i+=2) {
            int numero1 = contador+2;
            int numero2 = numero1 + 3;
            System.out.print(numero1+", ");
            System.out.print(numero2+", ");
            contador = numero2;
        }
    }
    public static String ejercicio4(String Texto){

        String TextoInvertido = "";
        for (int i = Texto.length() - 1; i >= 0; i--) {
            TextoInvertido += Texto.charAt(i);
        }
        return TextoInvertido;
    }

}
