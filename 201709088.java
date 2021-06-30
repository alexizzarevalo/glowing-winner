public class Practica {

    public static void ejercicio1(int n) {
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
        System.out.println("Sumando  Impares:  " + contador_Imares);
        System.out.println("Promediando Pares:  "+ contadorPromedio);


    }
    public static boolean ejercicio2(int A[],int B[] , int n){

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if ((A[i]-n)==B[j]) {
                    System.out.println("->"+(A[i]-n));
                    System.out.println("Es igual a "+B[j]);
                    return true;
                }
            }

        }

        return false;

    }
    public static void ejercicio4(){
        Scanner sc = new Scanner (System.in);
        String cadena = sc.nextLine();


        for (int i = cadena.length()-1; i>=0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println("");
    }
}
