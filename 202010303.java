public class Practica {


    public void ejercicio1(int n) {
        System.out.println("\t EJERCICIO 1");
        int sumaimpares = 0;
        int sumapares = 0;
        int contadorpares = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                contadorpares++;
                sumapares += i;
            } else {
                sumaimpares += i;
            }
        }
        System.out.println("La suma de impares es: " + sumaimpares);
        try {
            double promedio = sumapares / contadorpares;
            System.out.println("El promedio de pares es: " + promedio);
            System.out.println();
        } catch (Exception e) {

        }


    }

    public boolean ejercicio2(int[] Arreglo1, int[] Arreglo2, int n) {
        System.out.println("\t EJERCICIO 2");
        try {
            if (!(Arreglo1 == null || Arreglo2 == null)) {

                for (int i = 0; i < Arreglo1.length; i++) {
                    for (int j = 0; j < Arreglo2.length; j++) {
                        int resta = Integer.parseInt(String.valueOf(Arreglo1[i])) - n;
                        int temp = Integer.parseInt(String.valueOf(Arreglo2[j]));
                        if (resta == temp) {

                            return true;
                        }
                    }
                }

            } else {
                System.out.println("Alguno de los arreglos es nulo");
            }
        } catch (Exception e) {

        }
        System.out.println();

        return false;

    }

    public void ejercicio3(int n2) {
        System.out.println("\t EJERCICIO 3");
        if (n2 > 2) {

            int i = 1;
            int n = 2;
            while (n <= n2) {
                System.out.print(n + ",");
                if (i % 2 == 0) {
                    n += 2;
                } else {
                    n += 3;
                }
                i++;
            }
            System.out.println();

        } else {
            System.out.println("El numero debe ser mayor o igual a 2");
        }
        System.out.println();
    }

    public void ejercicio4(String cadena) {
        System.out.println("\t EJERCICIO 4");
        if (cadena != null) {

            int limite = cadena.length();
            String invertida = "";
            for (int i = limite - 1; i >= 0; i--) {
                char a = cadena.charAt(i);
                invertida += a;
            }

            System.out.println("La cadena \"" + cadena + "\" invertida es: \"" + invertida + "\"");
        }else{
            System.out.println("La cadena es nula");
        }
        System.out.println();

    }
}
