public class Practica {


    public void ejercicio1() {
        Scanner escanerTeclado = new Scanner(System.in);

        long n = 0;
        try {
            while (n <= 1) {
                System.out.print("Ingrese un numero n mayor a 1: ");
                n = escanerTeclado.nextLong();
            }
        } catch (Exception e) {
            System.out.println("Numero no valido, "+e);
            escanerTeclado.next();
            ejercicio1();
        }
        System.out.println();

        if(n > 1) {
            long numero = 1;
            long sumaImpar = 0;

            long sumaPar = 0;
            long contadorPar = 0;
            double promedioPar = 0;
            while (numero<=n) {
                if (numero % 2 == 0) {
                    sumaPar += numero;
                    contadorPar++;
                } else {
                    sumaImpar += numero;
                }
                numero++;
            }
            promedioPar = Double.parseDouble(String.valueOf(sumaPar / contadorPar)) ;
            //Imprimir respuesta
            System.out.println("Suma impares: " + sumaImpar);
            System.out.println("Promedio pares: " + promedioPar);
        }
    }

    public boolean ejercicio2(int[] arregloA, int[] arregloB, int numeroRestarA) {

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] -= numeroRestarA;
        }
        for (int i = 0; i < arregloA.length; i++) {
            for (int j = 0; j < arregloB.length; j++) {
                if (arregloA[i] == arregloB[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void ejercicio3() {
        Scanner escanerTeclado = new Scanner(System.in);
        long n = 0;
        try {
            while (n <= 2) {
                System.out.print("Ingrese un numero n mayor a 2: ");
                n = escanerTeclado.nextLong();
            }
        } catch (Exception e) {
            System.out.println("Numero no valido, "+e);
            escanerTeclado.next();
            ejercicio3();
        }
        System.out.println();

        if(n>2) {
            long inicio = 2;
            long inicio2 = 5;
            while (inicio <= n) {
                System.out.print(inicio + ", " + inicio2 + ", ");
                inicio += 5;
                inicio2 += 5;
            }
        }
    }

    public void ejercicio4(String texto) {
        char[] contenido = texto.toCharArray();
        System.out.println("Palabra \""+texto+"\" invertida es: ");
        for (int i = contenido.length -1 ; i >=  0 ; i--) {
            System.out.print(contenido[i]);
        }
    }
}
