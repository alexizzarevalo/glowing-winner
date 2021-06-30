public class Practica {

    public static void Practica(){

    }

    public void ejercicio1(int n){
        System.out.println("-----------------------Ejercicio 1-----------------------");

        //Definición de variables
        int contadorP, sumaI, sumaP;
        contadorP=0;
        sumaI=0;
        sumaP=0;
        System.out.println("Ingrese un número");


        //El if no permite la entrada de un número menor a 0
        if(n!=0){
            for (int i=1; i<=n; i++){
                int num = i;
                //Si el resto del número es 0, se agrega 1 al contador y además se suma dicho número al total.
                if(num % 2 == 0){
                    contadorP++;
                    sumaP = sumaP+i;
                }
                else{
                    //Si el número posee un resto no igual a 0, se suma al total de los impares.
                    sumaI=sumaI+i;
                }
            }
            int promedioP = sumaP/contadorP;
            System.out.println("la suma de los números impares es: "+ sumaI +"\n El promedio de los números pares es: " + promedioP );
        }
        else   {
            System.out.println("No puede ingresar un valor igual o menor a 0");
        }
        System.out.println("");
    }

    public boolean ejercicio2(int[] arreglo, int[] arreglo2, int n){
        System.out.println("-----------------------Ejercicio 2-----------------------");

        boolean retorno=true;
        System.out.println("Ingrese un número: ");

        int resta = arreglo[0]-n;
        for (int i=0; i < arreglo2.length ; i++){
                if(resta==arreglo2[i]){
                    retorno= true;
                    break;
                }
                else{
                    retorno = false;
                }
        }
        System.out.println("");
        System.out.println(retorno);
        return retorno;
    }

    public static void ejercicio3(int n){
        System.out.println("-----------------------Ejercicio 3-----------------------");
          String par="siguiente";

        System.out.println("Ingrese un número");

//for que suma los números dependiendo de la condición que se cumpla
        for(int i=0;i<n;i=i) {
            if(par=="siguiente") {
                    i=i+2;
                    par=" ";
            }
            else{
                    i=i+3;
                    par="siguiente";
            }
        System.out.print(i +", ");
        }
        System.out.println("");
    }

    public void ejercicio4(String txt){
        System.out.println("\n-----------------------Ejercicio 4-----------------------");
        System.out.println("Ingrese una cadena de texto: ");
        String alreves="";
        for (int i=txt.length()-1; i>=0; i--){
            alreves = alreves + txt.charAt(i);
        }
        System.out.println(alreves);
        System.out.println("");
    }

}
