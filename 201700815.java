public class Ejercicio1 {
    Scanner entrada = new Scanner(System.in);

    public Ejercicio1(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un número: ");
        int numero = entrada.nextInt();
        int arreglo[] = new int[numero]; //Se crea el arreglo para 10 elementos enteros
        int conteo_pares=0,conteo_impares=0;

        // System.out.println("Llenar el Arreglo:");
        for(int i=0; i<numero; i++){

            arreglo[i]= (i+1);

            if(arreglo[i] % 2==0){  //Si el numero es par
                conteo_pares++;
            }
            else{ //Si el numero es impar
                conteo_impares++;

            }
        }
        //Create arrays for pares and impares
        int par[] = new int[conteo_pares]; //Create arrays to save numbers pares
        int impar[] = new int[conteo_impares]; // and now numeros impares

        conteo_pares=0;
        conteo_impares=0;


        //Almacenamos los numeros pares y impares
        for(int i=0; i<numero; i++){
            if(arreglo[i] %2==0){
                par[conteo_pares] = arreglo[i];
                conteo_pares++;

            }
            else{  //if el numero es impar
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }
        System.out.print("\nArreglo Pares: ");
        for(int i=0;i<conteo_pares;i++){
            System.out.print(par[i]+ " - ");
        }
        System.out.print("Promedio de pares:");

        System.out.print("\nArreglo Impares: ");

        for(int i=0;i<conteo_impares;i++){
            System.out.print(impar[i]+ " - ");

        }
        System.out.print("Suma impares: ");
    }

}
