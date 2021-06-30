import java.util.Scanner;


public class Practica {

    static Scanner lector = new Scanner(System.in);

    public void ejercicio1(){
        int rango, sumatoria = 0, contador = 0;
        System.out.print("ingrese el rango: ");
        rango = lector.nextInt();
        for (int i=1; i<=rango; i++){
            if (i%2==0){
                sumatoria += i;
                System.out.println(i);
                contador= contador+1;
            }
        }
        System.out.println("Suma de impares: " + sumatoria);
        double promedio = sumatoria / contador;
        System.out.print("Promedio Pares: " + promedio);
    }

    public void ejercicio2(){
        int [] A = {5,7,9,10};
        int [] B = {1,9,3,2,4,6};
        int n;
        System.out.println();
        System.out.print("ingrese un numero: ");
        n = lector.nextInt();
        for (int i=0; i<A.length; i++){
         for (int j=0; j<B.length; j++){
            if (A[i]-n == B[j]){
                System.out.println(true);
            }
          }
        }
    }

    public void ejercicio3(){
    int n=0, num =0;
    double progresion =0;

        System.out.println();
        System.out.print("Ingrese un valor: ");
        num = lector.nextInt();
       while (progresion<num){
            n = n+1;
            if (n%2==0){
                progresion = 2.5*n;
                System.out.print(progresion + " ");
            }else{
                progresion = 2.5*n-0.5;
                System.out.print(progresion + " ");
            }
        }
    }

    public void ejercicio4() {
        String Texto, resultado= "";
        System.out.println();
        System.out.print("Ingrese una cadena de caracteres: ");
        Texto = lector.nextLine();
        for (int i = Texto.length()-1; i >= 0; i--) {
            resultado+= Texto.charAt(i);
        }
        System.out.println(resultado);
    }
}
