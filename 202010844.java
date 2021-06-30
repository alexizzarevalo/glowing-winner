import java.lang.reflect.Array;
import java.util.Scanner;

public class Practica {
    Scanner scanner= new Scanner(System.in);

    public  void ejercicio1(){
        int numero=0;
        int contador=0;
        int s=0,c=0,pares=0,rec=0,impar=0;
        System.out.println("Indique el rango de números el cual desea.");
        contador= scanner.nextInt();
        for (int i=0; i<contador; i++){
            numero++;
            if (numero%2==0){
                s=s+numero;
                c++;
            }else {
                impar=numero+impar;
            }
        }
        pares=s/c;
        System.out.println("El promedio de pares es: "+pares);
        System.out.println("La suma de numeros impares es : "+impar);
    }

    public boolean ejercicio2(int array1[], int array2[], int numero){
        int valor=0;
        boolean flag= false;
        try{
            for (int i=0; i<array1.length;i++){
                valor=array1[i]-numero;
                for (int j=0; j<array2.length;j++)
                    if(valor==array2[j]){
                        flag=true;
                    }
            }
            System.out.printf("Retorno: "+flag);
        }catch (Exception e){
            System.out.printf("No ingreso valores válidos");
        }
        return flag;
    }

    public void ejercicio3(){
        int valor=0;
        int valor2=2;
        int valor3=3;
        int contador1;
        int contador2;
        int suma=2;
        System.out.println("Ingrese el valor limite");
        valor=scanner.nextInt();

        for (int i=1; i<valor;i++){
            if (suma< valor){
                if(i%2==0){
                    contador1=suma+2;
                }else{
                    contador1=suma+3;
                }

                System.out.printf(""+contador1+",");
            }
        }
        //NO ME SALIO, PERDON :c
    }

    public void ejercicio4(){
        System.out.println("Ingrese la cadena que desee. ");
        String cadena = scanner.nextLine();
        String cadenainvertida = "";
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            cadenainvertida += cadena.charAt(indice);
        }
        System.out.println("La cadena invertida: " + cadenainvertida);
    }
}
