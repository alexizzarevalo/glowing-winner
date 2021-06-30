public class Practica {

    public void ejercicio1() {
        int num;
        int sumaimpar  = 0;
        int sumapar = 0;
        int contador = 0;
        Scanner panum = new Scanner(System.in);
        System.out.println("Introduzca un número n:");
        num = panum.nextInt();
        for (int i = 1; i <= num; i += 2) {
            //Suma 2 a 1, asegurandoce que todos son impares
            sumaimpar += i;
            //Suma el nuevo valor impar al valor impar inicial
        }
        for (int i = 2; i <= num; i += 2) {
            //Suma 2 a 2, asegurandice que todos son pares
            sumapar += i;
            //Suma el nuevo valor par al valor par inicial
            contador++;
            //Aumenta el contador cada vez que suma un número par
            //para que luego lo divida entre la cantidad de números
            //y así sacar el promedio
        }
        System.out.println("La suma de los números impares es: " + sumaimpar );
        System.out.println("El promedio de los números pares es: " + sumapar / contador);
    }

    public boolean ejercicio2(int[] a, int[] b, int numero) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            //Recorre la matriz a
            int n = a[i] - numero;
            //Le resta un número a cualquier número en cualquier posición
            //en la matriz a
            for (int j = 0; j < b.length; j++) {
                //Recorre la matriz b
                if (b[j] == n) {
                    contador++;
                    //El contador incremente si algún  número de la matriz b
                    //es igual a la resta previamente hecha
                }
            }
        }
        if (contador > 0) {
            return true;
            //Si el contador aumentó retorna true
        } else {
            return false;
            //Si el contador no aumentó retorna false
        }
    }
    
    public void ejercicio3() {
        int num;            
        int primero = 2;
        Scanner limite = new Scanner(System.in);
        System.out.println("Introduzca un número n:");
        num = limite.nextInt();
        System.out.print(primero);
        //Imprime el número 2 ya que siempre va a empezar por el 2
        while (primero < num) {
            //Mientras el 2 sea menor al número límite realizará el for
            for (int i = 0; i <= 3; i++) {
                if (i == 1) {
                    primero += 3;
                    //Le suma 3 al valor 2 que es por el cual empieza toda la progresión
                    System.out.print(" , " + primero);
                    if (primero >= num) {
                        //Evita que el número sea mayor que el límite ingresado
                        break;
                    }
                } else if (i == 2) {
                    //Le suma 2 al valor previamente sumado para seguir con la progresión
                    primero += 2;
                    System.out.print(" , " + primero);
                    if (primero >= num) {
                        //Evita que el número sea mayor que el límite ingresado
                        break;
                    }
                }
            }
        }
        System.out.println();
    }

    public void ejercicio4() {
        String palabra;
        String invertida = "";
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese una palabra para invertir: ");
        palabra = lector.nextLine();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            //Invierte el orden de caracteres de la palabra original
            invertida += palabra.charAt(i);
        }
        System.out.println("La palabra invertida es: " + invertida);
    }

}
