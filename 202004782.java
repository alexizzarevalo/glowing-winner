import java.util.Scanner;
public class Practica {

    public void ejercicio1(){
        Scanner lectura = new Scanner (System.in);
        int num;
        do{
            System.out.println("Ingrese un valor: ");
            num = lectura.nextInt();
        }while(num<=0);
        System.out.println("La suma del numero impar "+num+ "es"+sumaImpares(num));

    }
    public static int sumaImpares(int n){
        if (n==1)
            return 1;
        else
            return n + sumaImpares(n-2);
    }

    public void ejercicio3(){
        Scanner lectura = new Scanner (System.in);
        int progre;
        progre = lectura.nextInt();
          int suma;
        suma = lectura.nextInt();
        for (int i = 0; i < progre; i++) {
            if (i%2==0) {
                suma=suma+2;
                System.out.print(" "+ suma+ " ");
                if (progre<=suma) {
                    break;
                }
            }
            if (i%2!=0) {
                suma=suma+3;
                System.out.print(" "+suma+ " ");
                if (progre<=suma) {
                    break;
                }
            }
        }
    }

    public void ejercicio4(){
        String palabra;
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese una palabra: ");
        palabra = lector.nextLine();
        System.out.println(invertirpalabra(palabra, palabra.length()-1));
    }
    public static String invertirpalabra(String palabra, int longitud){

        if (longitud == 0){
            return palabra.charAt(longitud)+"";
        }else{
            return palabra.charAt(longitud)+ (invertirpalabra(palabra , longitud-1));
        }
    }


}
