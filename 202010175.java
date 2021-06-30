public class Practica {

    public void ejercicio1(int n){
        int sumaPar=0, sumaImpar=0;
        int contadorSuma=0;
        System.out.println("------EJERCICIO #1------");
        if(n>0){
            for (int i = 1; i <= n; i++) {
                if(i%2==0){
                    sumaPar+=i;
                    contadorSuma++;
                }else{
                    sumaImpar+=i;
                }
            }
            System.out.println("-RESULTADO-\n>La suma de los impares es: "+sumaImpar+"\n>El promedio de las sumas es: "+sumaPar/contadorSuma);

        }else{
            System.out.println("Ha ingresado un número no válido.");
        }

    }

    public boolean ejercicio2(int arreglo1[], int arreglo2[], int num){
        System.out.println("\n------EJERCICIO #2------");
        if(arreglo2!=null && arreglo1!=null){
            for (int i = 0; i < arreglo2.length; i++) {
                    for (int j = 0; j < arreglo1.length; j++) {
                        if(arreglo1[j]-num==arreglo2[i]){
                            return true;
                        }
                    }
            }
        }
        return false;
    }

    public void ejercicio3(int n){
        System.out.println("\n------EJERCICIO #3------");
        System.out.println("-RESULTADO-");
        int progresion=0;
        if(n>=0){
            for (int i = 0; i < n; i++) {
                if(i%2==0){
                    progresion+=2;
                    if(i==0){
                        System.out.print(progresion);
                    }else {
                        System.out.print(", " +progresion);
                    }
                }else{
                    progresion+=3;
                    System.out.print(", " +progresion);
                }
            }
        }else{
            System.out.println("Ha ingresado un número no válido.");
        }


    }

    public void ejercicio4(String cadena){
        System.out.println("\n\n------EJERCICIO #4------");
        System.out.println("-RESULTADO-");
        if(!cadena.equals("")){
            String separado[] = cadena.split("");
            for (int i = separado.length-1; i >=0; i--) {
                System.out.print(separado[i]);
            }
        }else{
            System.out.println("Ha ingresado una cadena no válida.");
        }
    }
}
