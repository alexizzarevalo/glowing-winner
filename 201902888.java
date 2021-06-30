public class Practica {
   // 201902888 IVAN ALESSANDRO HILARIO CHACON

   public  void ejercicio1(int n) {
        int arregloNum[] = new int[500000];
        int arreglosum[] = new int[500000];
        int arregloprom[] = new int[500000];
        int sumaImpares = 0;
        int sumapares=0;
        int promPares = 0;
        int posicion = 0;
        int posicion2 = 0;
        int n2=n/2;
        for (int i = 0; i < 500000; i++) {
            if (i < n) {

                arregloNum[i] = i + 1;
            }
        }
        // IMPRIMIENDO LOS NUMEROS AL RANGO
        System.out.println("NUMEROS");
        for (int i = 0; i < 500000; i++) {
            if (arregloNum[i] != 0) {
                System.out.print(arregloNum[i] + ",");
            }
        }
        
        for (int i = 0; i < 500000; i = i + 2) {
            if (arregloNum[i] != 0) {
                arreglosum[i] = arregloNum[i];
            }

        }


        for (posicion = 0; posicion < arregloNum.length; posicion = posicion + 2) {
            sumaImpares += arregloNum[posicion];
        }
        
        System.out.println("");
        System.out.println("SUMA IMPARES: " + sumaImpares);
        
        for (int i = 1; i < 500000; i = i + 2) {
            if (arregloNum[i] != 0) {
                arregloprom[i] = arregloNum[i];
            }
        }

        
        for (posicion2 = 1; posicion2 < arregloNum.length; posicion2 = posicion2 + 2) {
            sumapares += arregloNum[posicion2];
        }
        promPares=sumapares/n2;
        System.out.println("PROMEDIO PARES: " + promPares);

    }
    
   public boolean ejercicio2(int arr1[], int arr2[], int n) {
        int array[] = arr1;
        int array1[] = arr2;
        int aux = n;
        int array3[] = null;

        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i] - n;

        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                if (array1[i] == array3[j]) {
                    return true;
                }

            }


        }
        return false;
    }
    
   public void ejercicio3(int n){

        int numeroAnterior=0;
        int suma_Numero=0;

        for (int i = 2; i <= n; i++) {

            if (i==2){
                suma_Numero=i;
            }else if (i==3){
                suma_Numero+=3;

            }else if (i==4){
                suma_Numero+=2;

            }else if (i%2==0 && i>=4){

                suma_Numero+=2;

            }else if (i%2!=0 && i>=4){
                suma_Numero+=3;
            }

            System.out.print(suma_Numero + " ");

            if (suma_Numero>n){
                break;
            }

        }
    }
    
    public void  ejercicio4(String cadena1){
           char letras;
           for (int i = cadena1.length()-1; i>=0  ; i--) {
            letras = cadena1.charAt(i);
            System.out.print(letras);
        }    
   }
}
