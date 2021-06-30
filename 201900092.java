public class Practica {

    public static void ejercicio1(){
        System.out.println("---Ejercicio #1---");
        Scanner leer = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        int suma1 = 0;
        int sumaCantPromedio = 0;
        int promedio=0;

        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();

        for (int i = 1; i < numero + 1 ; i++) {

            if (i%2 == 0) {

                suma = suma + i;
                sumaCantPromedio++;

            }else
            {
                suma1 = suma1 +i;
            }

        }
        promedio = suma/sumaCantPromedio;

        System.out.println("Suma impares " + suma1);

        System.out.println("Promedio Pares " + promedio);


    }

    public static boolean  ejercici2(int [] arreglo1,int [] arreglo2){
        System.out.println("---Ejercicio #2---");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero inicial");
        int num = leer.nextInt();
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
            if (arreglo2[j] == arreglo1[i] - num) {
                System.out.println("True");
                return true;
            }
            }
        }
        System.out.println("False");
        return false;
    }
    public static void ejercicio3(){
        System.out.println("---Ejercicio #3---");
        Scanner src = new Scanner(System.in);


        int numero;
        int suma2 = 0;
        int suma3 =0;
        System.out.println("Ingrese un numero");
        numero = src.nextInt();

        for (int i = 0; i < numero; i++) {
            if (i%2 == 0) {
                suma2 = suma3+2;
                System.out.print("" + suma2+ ", ");
            }else
            {
                suma3 = suma2 + 3;
                System.out.print("" + suma3+ ", ");
            }


        }

    }
    public static void ejercicio4(){
        System.out.println("---Ejercicio #4---");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine();
        String cadena2 ="";
        for (int i =cadena.length()-1;i>=0;i--)
            cadena2 = cadena2 + cadena.charAt(i);
         System.out.println("cadena invertida: "+cadena2);

    }

}
