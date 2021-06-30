public class Practica {

    public static void ejercicio1(int x){
//VARIABLES
          int contador = 0;
        Integer[] numeros = new Integer[x+1];
        Integer[] par = new Integer[x+1];
        double suma = 0; double promedio = 0;


            for (int i = 1; i <= x; i++) {


                if (i != x) {
                    System.out.print(i+", ");
                }else {
                    System.out.println(i);
                }
                if ( i%2 != 0 ) {
                    numeros[i] = i;
                }else {
                    par[i] = i;
                    contador++;
                }
            }
            System.out.println("----------------------------------------------------");


            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] != null) {
                    suma = suma+numeros[i];
                }
            }
            for (int i = 0; i < par.length; i++) {
                if (par[i] != null) {
                    promedio = promedio+par[i];
                }
            }
            System.out.println("LA SUMA ES IGUAL : "+suma );
            System.out.println("PROMEDIO ES : "+promedio/contador);
        }





    public static boolean ejercicio2(Integer[] a1,Integer[] a2, int x)


    {




            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != null && a2[i] != null) {
                    for (int j = 0; j < a2.length; j++) {
                        if (a2[j] != null ) {
                            if (x == a1[i]-a2[j]) {
                                System.out.println("True");
                                return true;
                            }
                        }
                    }
                }
            }

        System.out.println("False");
            return false;
        }

    public static void ejercicio3(int x){
        int co = 0;
        int INICIO = co+2;
        int FINAL = INICIO + 3;
        for (int i = 0; i < x; i+=2) {

            System.out.println(INICIO);
            System.out.println(FINAL);
            co = FINAL;
        }
    }



    public static void ejercicio4(String palabra ){



//Palabra por defecto
        ; String palabraalreves = "";
        //-----------------------------------------------------------------
        System.out.println("practica");
        for (int xy = palabra.length() - 1; xy >= 0; xy--) {
            palabraalreves += palabra.charAt(xy);
        }
        System.out.println("La palabra es  invertida>>        " + palabraalreves);

    }

}
