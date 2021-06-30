public class Practica {
    Scanner sn = new Scanner(System.in);
    public  void ejercicio1 (){

        int[] A;
        int[] B;
        int[] C;
        int n;
        int aux= 0; int aux1 = 0;

        System.out.println("Ingrese la cantidad de números que desea ingresar: ");
        n = sn.nextInt();

        A = new int[n];
        B = new int[n];
        C = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el elemento " + (i+1) +": ");
            A[i] = sn.nextInt();
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0){
                B[i] = A[i];
            }else {
                C[i] = A[i];
            }
        }

        for (int i = 0; i < B.length; i++) {
            aux = aux + B[i];
        }

        for (int i = 0; i < C.length; i++) {
            aux1 = aux1 + C[i];
        }

        System.out.println("Suma impares: " + aux1);
        System.out.println("Promedio pares: " + (aux/n));

    }//Fin ejercicio 1

    public  void ejercicio2 (int[] arreglo1, int[] arreglo2, int n){
        System.out.println("ingrese el tamaño del arreglo 1");
        int n1 = sn.nextInt();
        arreglo1 = new int [n1];

        System.out.println("ingrese el tamaño del arreglo 2");
        int n2 = sn.nextInt();
        arreglo2 = new int [n2];

        System.out.println("Ingrese un número:");
        n = sn.nextInt();

        System.out.println("Ingrese los elementos del arreglo1");
        for (int i = 0; i < n1; i++) {
            arreglo1[i] = sn.nextInt();
        }

        System.out.println("Ingrese los elementos del arreglo2");
        for (int i = 0; i < n2; i++) {
            arreglo2[i] = sn.nextInt();
        }

        if(n1 < n2) {
            for (int i = 0; i < n2; i++) {
                if (arreglo2[i] == arreglo1[i] - n) {
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }

            }
        }

        if(n2 < n1) {
            for (int i = 0; i < n1; i++) {
                if (arreglo2[i] == arreglo1[i] - n) {
                    System.out.println("True");

                }else{
                    System.out.println("False");
                }

            }
        }
    }

    public void ejercicio3 (){
        System.out.println("Ingrese un numnero");
        int n = sn.nextInt();
        int cont = 2;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                cont = cont + 3;
                System.out.print(cont+",");
            }else{
                cont = cont + 2;
                System.out.println(cont+",");
            }
        }
    }

    public void ejercicio4 (String cadena){
        System.out.println("Ingrese un texto cualquiera: ");
        cadena = sn.nextLine();
        int n = 0;
        int cont = 0;
        n = cadena.length();
        String[] Arreglo;
        String[] Arreglo2;
        Arreglo = new String[n];
        Arreglo2 = new String[n];

        for (int i = 0; i < n; i++) {
               Arreglo[i] = cadena.substring(i, (i + 1));
        }

        for (int i = n; i < 0; i--) {
            System.out.print(Arreglo[i]);
        }
    }

}
