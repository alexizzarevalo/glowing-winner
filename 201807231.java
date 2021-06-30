public class Practica {
    Scanner sc = new Scanner(System.in);
    public void ejercicio1(){
        System.out.println("Ingrese el rango: ");
        int rango = sc.nextInt();
        int suma = 0;
        int promedio = 0;
        double contador = 0;
        for (int i = 1; i <= rango ; i=i+2) {
            suma = suma+i;
        }
        for (int i = 2; i <= rango; i=i+2) {
            promedio = promedio+i;
            contador++;
        }
        System.out.println("La suma de los impares es: "+suma);
        System.out.println("El promedio de los pares es: "+promedio/contador);
    }
    public boolean ejercicio2(int[] A,int[] B,int numero){
        int contador = 0;
        for (int i = 0; i < A.length; i++) {
            int n = A[i]-numero;
            for (int j = 0; j < B.length; j++) {
                if(B[j] == n){
                    contador++;
                }
            }
        }
        if(contador>0){
            return true;
        }
        else {
            return false;
        }
    }
    public void ejercicio3(){
        System.out.println("Ingrese el limite: ");
        int numero = 2;
        int limite = sc.nextInt();
        System.out.print(numero);
        while (numero < limite){
            for (int i = 1; i <=3 ; i++) {
                if(i == 1 ){
                    numero = numero+3;
                    System.out.print(" - " + numero);
                    if(numero >= limite){
                        break;
                    }
                }
                else if( i == 2){
                    numero = numero+2;
                    System.out.print(" - "+numero);
                    if(numero >= limite){
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
    public void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String word = scanner.nextLine();
        String invertida = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            invertida = invertida + word.charAt(i);
        }
        System.out.println(invertida);
    }
}
