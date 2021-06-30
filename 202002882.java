public class Practica {

    public void ejercicio1() {
        int n;
        int sumaImpares = 0, cantidadPares = 0, sumaPares = 0;
        double promPares;

        System.out.println("Ingrese un Numero");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n > 0) {
            for (int i = 0; i <= n + 1; i++) {
                if (i % 2 == 0) {
                    sumaPares = sumaPares + i;
                    cantidadPares++;
                } else {
                    sumaImpares = sumaImpares + i;
                }
            }
            promPares = sumaPares / cantidadPares;
            System.out.println("El promedio de los pares es: " + promPares);
            System.out.println("La suma de los impares es: " + sumaImpares);
        } else {
            System.out.println("El Numero no puede ser menor a 0");
        }

    }

    public boolean ejercicio2(int[] A, int[] B, int n) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] - n == B[j]) {
                    return true;
                }
            }
        }

        return false;

    }

    public void ejercicio3() {
        int n;
        System.out.println("Ingrese un Numero");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int n2 = 0;

        for (int i = 0; i < n--; i++) {
            n2 = n2 + 2;
            System.out.print(n2 + ", ");
            n2 = n2 + 3;
            System.out.print(n2 + ", ");
        }
    }

    public void ejercicio4() {
        String cadena;
        String reves = "";

        System.out.println("Ingrese el mensaje");
        Scanner scanner = new Scanner(System.in);

        cadena = scanner.nextLine();

        for (int indice = cadena.length() - 1; indice >= 0; indice--) {

            reves += cadena.charAt(indice);
        }

        System.out.println("Mensaje al reves: " + reves);

    }
