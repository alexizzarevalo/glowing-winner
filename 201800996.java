import java.util.Scanner;

public class Practica {
    //variables ejercicio 1
    int rango;
    int Suma=0;
    int Promedio=0;
    Scanner sc = new Scanner(System.in);
    //variables ejercicio 2
    int Verificar=0;
    //varialbes ejercicio 3
    int num = 2;
    int lim;
    Scanner sc2 = new Scanner(System.in);

    //variables ejercicio 4
    String palabra;
    String Palabrainvertida ="";
    Scanner sc1 = new Scanner(System.in);

    public void ejercicio1(){

      System.out.println("ingrese el numero del rango de valores");
      rango = sc.nextInt();
        for (int i = 0; i <= rango; i++) {
            System.out.println(i);

        }

        for (int i = 1; i <= rango; i=i+2) {
        Suma = Suma + i;
        }
        System.out.println("la Suma de los impares es:"+Suma);
        for (int i = 0; i <= rango; i=i+2) {

         Suma = Suma + i;
        Promedio = Suma/rango;

        }
        System.out.println("promedio pares:"+Promedio);
    }

    public boolean ejercicio2(int[] A,int[] B, int  Num){
        for (int i = 0; i < A.length; i++) {
            int n= A[i]-Num;
            for (int j = 0; j < B.length; j++) {
                if (B[j]==n){
                    Verificar++;
                }
            }

        }
        if (Verificar>0){
            return true;
        }
        else {
            return false;
        }
    }

    public void ejercicio3(){
        System.out.println("ingrese valor limite");
        lim = sc2.nextInt();
        System.out.println(num);
        while (num<lim){
            for (int i = 1; i <=3 ; i++) {
             if (i==1){
                 num=num+3;
                 System.out.println(num);
                 if (num>=lim){
                     break;
             }
             }
            else if (i==2){
                num = num +2;
                System.out.println(num);
                if (num >= lim){
                    break;
            }
             }

        }
        }

        System.out.println();
    }

    public void ejercicio4(){

        System.out.println("ingrese la palabra a invertir");
        palabra = sc1.nextLine();
        for (int i = palabra.length()-1; i >= 0 ; i--) {
         Palabrainvertida += palabra.charAt(i);
        }
        System.out.println("la palabra al revez es:"+Palabrainvertida);
    }
}
