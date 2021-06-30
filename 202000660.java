public class Practica {

    public void ejercicio1(int n){
        System.out.println("EJERCICIO 1:");
        int numero=1;

        int sumaImpares=0;

        int sumaPares=0;
        int promedioPares;
        int contadorPares=0;

        for (int i = 0; i < n; i++) {
            //Si el residuo es igual a 0 es par
            if ((numero % 2 )==0){
                contadorPares++;
                sumaPares+=numero;
            }else {
                sumaImpares+=numero;
            }
            numero+=1;
        }

        promedioPares = sumaPares/contadorPares;

        System.out.println("Suma Impares: "+sumaImpares);
        System.out.println("Promedio pares: "+promedioPares);


    }

    public boolean ejercicio2(int[] vector1,int[] vector2, int n){
        System.out.println("EJERCICIO 2:");
        boolean restaConfirmada=false;

        if (vector1.length>0 && vector2.length>0  && n>0){
            for (int j : vector1) {

                int resta = 0;

                resta = j - n;

                for (int k : vector2) {
                    if (resta == k) {
                        restaConfirmada = true;
                        break;
                    }
                }
                if (restaConfirmada){
                    break;
                }
            }
        }else {
            System.out.println(restaConfirmada+" Los arrays no ");
        }
        return restaConfirmada;
    }

    public void ejercicio3(int n){
        System.out.println("EJERCICIO 3:");
        int contador=2;

        boolean sumar2=true;
        boolean sumar3=true;

        System.out.print(" " + contador+",");
        for (int i = 0; i < n + 1; i++) {
            if (contador<(n)){
                if (sumar3) {
                    contador += 3;
                    System.out.print(" " + contador + ",");

                    sumar2 = true;
                    sumar3 = false;
                }else if (sumar2){
                    contador+=2;
                    System.out.print(" "+contador+",");

                    sumar2=false;
                    sumar3=true;
                }

            }else{
                break;
            }

        }
        System.out.println();
    }

    public void ejercicio4(String cadena){
        System.out.println("EJERCICIO 4:");
        char[] caracteres = cadena.toCharArray();
        int tamanio = caracteres.length;
        for (int i = tamanio-1; i >=0; i--) {
            System.out.print(caracteres[i]+" ");
        }

    }
}
