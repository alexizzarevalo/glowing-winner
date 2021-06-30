 public class Practica {


    public static void ejercicio1(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el numero n: ");
        int numero = entrada.nextInt();
        int arreglo[] = new int[numero];
        int pares=0,impares=0;

        for(int i=0; i<numero; i++){

            arreglo[i]= (i+1);

            if(arreglo[i] % 2==0){  //Si el numero es par
                pares++;
            }
            else{ //Si el numero es impar
                impares++;

            }
        }
        int par[] = new int[pares];
        int impar[] = new int[impares];

        pares=0;
        impares=0;

        for(int i=0; i<numero; i++){
            if(arreglo[i] %2==0){
                par[pares] = arreglo[i];
                pares++;

            }
            else{
                impar[impares] = arreglo[i];
                impares++;
            }
        }

        System.out.print("Arreglo Pares: "+"  ");
        for(int i=0;i<pares;i++){
            System.out.print(par[i]+ " - ");
        }



    }

    public static void ejercicio4(){
        Scanner tex = new Scanner(System.in);

        System.out.println("ingrese la palabra a invertir");
        String palabra;
        String palabrainv = " ";

        palabra = tex.next();

        for (int i =palabra.length()-1; i >= 0; i--) {
            palabrainv = palabrainv +palabra.charAt(i);
        }

        System.out.println("Palabra inv: "+ palabrainv);

    }

}
