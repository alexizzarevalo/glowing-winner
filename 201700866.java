public class Practica {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
    }

    private static void ejercicio1() {
        System.out.println("EJERCICIO 1");

        int cont=0;
        int cont1=0;
        double prom=0;
        int arreglo1[]=vector1;

        for (int i=0;i<arreglo1.length;i++){

            if (arreglo1[i]  % 2 == 0 )
            {
                System.out.println( "ES PAR" );
                cont=cont+arreglo1[i];

            }
            else
            {
                System.out.println( "ES IMPAR" );
                cont1=cont1+arreglo1[i];


            }
        }
        prom=cont1/arreglo1.length;
        System.out.println("la suma es "+ cont);
        System.out.println("la el promedio es es "+ prom);
    }

    private static void ejercicio2() {
        System.out.println("EJERCICIO 2");
    }

    private static void ejercicio3() {
        System.out.println("EJERCICIO 3");
    }

    private static void ejercicio4() {
        System.out.println("EJERCICIO 4");
        Scanner sn = new Scanner(System.in);
        String palabra;
        String palabrainvertida="";
        System.out.print("Ingresa una palabra y se mostrará a la inversa: ");
        palabra=sn.nextLine();

        for (int i = palabra.length()-1; i>=0; i--){
            palabrainvertida += palabra.charAt(i);
        }

        System.out.println("La palabra invertida es:\n"+ palabrainvertida);
    }

}
