public class Practica {
    public void ejercicio1(int numero){
//        • Dado un rango de números de 1 a n, calcule la suma de los números impares y el promedio de
//        los números pares

        System.out.println("Programa que muestra los numeros desde 1 a n y calcula");
        System.out.println("La sumatoria de los numeros impares y el promedio de los numeros pares");
        int a=1,contador=0;
        int sumimpar=0;
        int sumpar=0;
        try{
            while( a<= numero){
                if (a%2==0){
                    sumpar=sumpar+a;
                    contador++;
                }else {
                    sumimpar = sumimpar + a;
                }
                a=a+1;
            }
            double promedio=0;
            promedio=sumimpar/contador;
            System.out.println("La sumatoria de los numeros impares es de: "+sumimpar);
            System.out.println("El promedio de los numeros pares es de: "+promedio);
        }catch (Exception e){
           System.out.println("El numero ingresado en el parametro de la funcion llamada debe de ser un numero entero");
        }
    }

    public void ejercicio2(int [] A,int[] B,int numero){
        Boolean valor=false;
        for (int a=0;a<A.length;a++){
            for (int b=0;b<B.length;b++){
                if ((A[a] - numero) == B[b]) {
                    valor = true;
                    break;
                }
            }
        }
        System.out.print(""+valor);
    }

    public void ejercicio3(int numero){
        int a=2;
    while(a <= numero){

        if (a%2==0){

            System.out.print(a+",");
            a=a+3;
            System.out.print(a+",");
            a=a+2;
        }else{

            System.out.print(a+",");
            a=a+3;
            System.out.print(a+",");
            a=a+2;
        }

    }
    }

    public void ejercicio4(String texto){
    // • Haga una función que reciba una cadena de texto y la imprima al revés.

        String textoinvertido="";
        for (int a = texto.length()-1; a >= 0; a=a-1) {
            textoinvertido = textoinvertido + texto.charAt(a);
        }
        System.out.println(textoinvertido);
    }

}
