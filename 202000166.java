public class Practica {

    public void ejercicio1(int n) {
        long sumaP = 0, suma = 0;
        long promedio;
        long cant = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                //número par (promedio)
                sumaP += i;
                cant++;
            } else {
                //número impar (suma)
                suma += i;
            }
        }
        promedio = sumaP / cant;
        System.out.println("Promedio: " + promedio);
        System.out.println("Suma: " + suma);
    }

    public boolean ejercicio2(int[] ar1, int[] ar2, int n) {
        boolean xd = false;
        for (int i = 0; i < ar1.length; i++) {
            int resta = ar1[i] - n;
            for (int j = 0; j < ar2.length; j++) {
                if (ar2[j] == resta) {
                    xd = true;
                }
            }
        }
        return xd;
    }

    boolean p = false;
    int sucesion = 2;

    public void ejercicio3(int n) {
        do {
            if (p == true) {//2 en 2
                sucesion += 2;
                System.out.print(sucesion + ", ");
                p = false;
            } else { //3 en 3
                sucesion += 3;
                System.out.print(sucesion + ", ");
                p = true;
            }
        } while (sucesion < n);

        System.out.println("");
    }

    public void ejercicio4(String t) {
        String inv = "";
        for (int indice = t.length() - 1; indice >= 0; indice--) {
            // aquí vamos a inverter cada letra
            inv += t.charAt(indice);
        }
        System.out.println(t);
        System.out.println(inv);
    }

}
