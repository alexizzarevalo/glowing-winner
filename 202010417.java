public class Practica {

    public static String ejercicio1(int n){
        System.out.println("-----------------");
        System.out.println();
        int numerospares=0;
        int numerosimpares=0;
        for (int i=0; i<=n;i++){

            int verificar=i%2;
            if (verificar==0){

                numerospares++;

            }else {
                numerosimpares = i + numerosimpares;
            }

        }



        return "Suma impares: "+numerosimpares+"\n"+"Promedio pares: "+numerospares;
    }
    public static boolean ejercicio2(int Arreglo1[],int Arreglo2[],int numero){

        int operacion=0;
        for (int i =0; i<Arreglo1.length; i++){

            for(int j=0;j<Arreglo2.length;j++){

                operacion=Arreglo1[i]-numero;
                if (operacion==Arreglo2[j])
                    return true;


            }

        }


        return false;
    }
    public static String ejercicio3(int n){
        String progresion="";
        int acumulador=0;
        int tres=3;
        int dos=2;
        int contador=0;
        System.out.print("2, ");
        for (int i =3;i<n;i++){

            i=i+2;
            System.out.print(i+",");
            contador++;


            if (contador==1){
                i=i+2;
                System.out.print(i+",");
                contador=0;

            }


        }

        return progresion;
    }
    public static String ejercicio4(String cadena){
        String palabra="";
        for (int i=cadena.length()-1;i>=0;i--){

            palabra+=cadena.charAt(i);

        }

        return palabra;
    }
}
