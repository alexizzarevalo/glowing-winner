public class Practica {
    public static Scanner escaner = new Scanner(System.in);

    public void ejercicio1(){
        System.out.println("Ejercicio 1: 202010312");
        int n, numero=0,sumapar=0,contadorPar=0,promediopares,sumaimpar=0;
        System.out.println("Indique el numero n");
        n= escaner.nextInt();
        for (int i=0; i<n; i++){
            numero++;
            if (numero%2==0){
                sumapar=sumapar+numero;
                contadorPar++;
            }else {
                sumaimpar=numero+sumaimpar;
            }
        }
        promediopares=sumapar/contadorPar;
        System.out.println("El promedio de pares es: "+promediopares);
        System.out.println("La suma de numeros impares es : "+sumaimpar);
    }

    public boolean  ejercicio2(int arreglo1[], int arreglo2[], int numero){
        int n=0;
        boolean Respuesta= false;
        try{
            System.out.println("Ejercicio 2: 202010312");
            for (int i=0; i<arreglo1.length;i++){
                n=arreglo1[i]-numero;
                for (int j=0; j<arreglo2.length;j++)
                    if(n==arreglo2[j]){
                        Respuesta=true;
                    }
            }
            System.out.printf("Retorna: "+ Respuesta);
        }catch (Exception e){
            System.out.printf("Ocurrio un error.");
        }
        return Respuesta;
    }

    public void ejercicio3(){
        int a, anterior = 3, temp, x = 2;
        System.out.println("Ejercicio 3: 202010312");
        System.out.println("Ingrese el numero n");
        a = escaner.nextInt();
        System.out.println("El numero ingresado fue: " + a);
while (true){
    System.out.println(x);
    temp = x;
    x= x + 3;
    anterior = temp;
    if (x>a)
        break;
}
    }
    public void ejercicio4(){
        System.out.println("Ejercico 4: 202010312");
        System.out.println("Ingrese la palabra a invertir");
        String palabra = escaner.nextLine();
        String palabrainvertida = "";
        for (int letra = palabra.length() - 1; letra >= 0; letra--) {
            palabrainvertida += palabra.charAt(letra);
        }
        System.out.println("La palabra invertida es: " + palabrainvertida);
    }
}
