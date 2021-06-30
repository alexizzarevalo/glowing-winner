public class Practica {

    public void ejercicio1(){

        int n = 0;
        int pares;
        int sumaPares = 0;
        int sumaImpares = 0;
        int indicePares = 0;
        int indiceImpares = 0;

        for (int i = 1;  i<=n; i++) {
            System.out.print(i + ", ");

            if (i % 2 == 0) {
                indicePares++;
                for (int j = 0;  j<=indicePares; j++) {
                    sumaPares++;
                }

            } else if (i % 2 == 1) {
                for (int j = 0;  j<=n; j++) {
                    indiceImpares++;
                }

            }
        }

        System.out.println("");
        System.out.println("La suma de los impares es: " + indiceImpares);
        pares = sumaPares / (n/indicePares);
        System.out.println("El promedio de los pares es: " + pares);

    }


    public Boolean ejercicio2(){

        int[] n = null;
        int[] m = null;
        int numero = 0;

        for (int i = 0; i < n.length; i++) {

            if(n[i] - numero == m[i]){
                System.out.println(true);
                return true;
            } else {
                System.out.println(false);
                return false;
            }
        }
        return null;
    }

    public void ejercicio3 () {

        int n = 0;

        for (int i = 0;  i<=n; i++) {
            System.out.print(i + 2 + ", ");
            i++;
            for (int j = i;  j<=n; j++) {
                System.out.print(i + 3 + ", ");
                i++;
            }
        }
    }

    public void ejercicio4 () throws IOException {

        char[] palabra;
        palabra = new char[10];
        String alreves = "";

        for (int i = palabra.length-1; i >= 0; i--) {
            alreves += palabra[i];
        }

    }
}
