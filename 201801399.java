public class Practica {

    public void ejercicio1(){

        int n = 10;
        int ini = 1;
        int sumapar = 0;
        int promedio = 0;

        while (ini < n) {

            if (ini % 2 == 0) {

                //suma de todos los pares
                sumapar = sumapar + n;

            } else {

                int contador = 1;

                promedio = (ini + contador) / n;
                contador++;

            }
            ini = ini +1;
        }
        System.out.println("Suma de numero pares es: " + sumapar);
        System.out.println("Promedio de numeros impares es: " + promedio);

    }

    public void ejercicio2(){

        //verificar si la casilla del array 1 restado 2 da alguna casilla del array 2

    }

    public void ejercicio3(){

        //impresion de progresion aritmetica

    }

    public void ejercicio4(){

        //cadena de texto impresa al revés
        String palabra = "n, u, m, e, r, o";
        String[] array = palabra.split(",");
        for (int i = 0; i < array.length; i++)    {
            System.out.print(array[i]);
        }

    }

}
