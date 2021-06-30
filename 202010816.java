public class Practica {

    public void ejercicio1(int n){
        int sumaimpares = 0;
        int promediopares = 0;
        int contadornumpares = 0;
        Integer[] numeros = new Integer[n+1];
        Integer[] pares = new Integer[n+1];
        System.out.println("Ejercicio 1");
        System.out.print("Rango: ");
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
                contadornumpares++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != null) {
                sumaimpares = sumaimpares+numeros[i];
            }
        }
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] != null) {
                promediopares = promediopares+pares[i];
            }
        }
        System.out.println("Suma impares: "+sumaimpares);
        System.out.println("Promedio pares: "+promediopares/contadornumpares);
        System.out.println("");
    }

    public boolean ejercicio2(Integer[] primerarreglo,Integer[] segundoarreglo, int n){
        System.out.println("Ejercicio 2");
        for (int i = 0; i < primerarreglo.length; i++) {
            if (primerarreglo[i] != null && segundoarreglo[i] != null) {
                for (int j = 0; j < segundoarreglo.length; j++) {
                    if (segundoarreglo[j] != null ) {
                        if (n == primerarreglo[i]-segundoarreglo[j]) {
                            System.out.println("True");
                            System.out.println("");
                            return true;
                        }
                    }
                }
            }
        }
        System.out.println("False");
        System.out.println("");
        return false;
    }

    public  void ejercicio3(int n){
        System.out.println("Ejercicio 3");
        int ultimonum = 0;
        for (int i = 0; i < n; i+=2) {
            int primernumero = ultimonum+2;
            int segundonumero = primernumero + 3;
            System.out.print(primernumero + ",");
            System.out.print(segundonumero + ",");
            ultimonum = segundonumero;
        }
        System.out.println("");
    }

    public void ejercicio4(String cadena){
        System.out.println("");
        System.out.println("Ejercicio 4");
        String cadenainvertida = "";
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            cadenainvertida += cadena.charAt(indice);
        }
        System.out.println("La cadena original es: " + cadena);
        System.out.println("La cadena invertida es: " + cadenainvertida);
    }

    }
