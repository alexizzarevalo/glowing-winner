public class Practica {

//    ejercicio4
    public void reverseString(char[] s) {
        int len = s.length;
        int izq = 0;
        int der = s.length - 1;
        while(izq < der) {
            char n = s[izq];
            s[izq] = s[der];
            s[der] = n;
            izq++;
            der--;
        }
    }

    public static void main(String[] args) {

//        ejercicio1
        Scanner teclado = new Scanner(System.in);
        int n;
        int i = 1;
        int suma1 = 0;
        int suma2 = 0;
        int pares = 0;
        int promedio = 0;

        System.out.print("Escriba un número n del rango: ");
        n = teclado.nextInt();
        while (i <= n) {
            if (i % 2 != 0) {
                suma1 = suma1 + i;
            } else {
                if (i % 2 == 0) {
                    suma2 = suma2 + i;
                    pares = pares + 1;
                }
            }
            i++;
        }
        System.out.println("Suma impares: " + suma1);
        System.out.println("Promedio pares " + suma2 / pares);

//        ejercicio3
        int x = 2;
        int k;
        int ant = 3;
        int m;

        System.out.print("Ingrese un número n del rango: ");
        k = teclado.nextInt();

        while (true) {
            System.out.print(x + ", ");
            m = x;
            x = x + ant;
            ant = m;

            if (x > k) {
                break;
            }
        }
    }
