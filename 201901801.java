public class Practica {
    
    public void ejercicio1() {
        
        int n = 0;
        double suma = 0;
        int suma2 = 0;
        int cpares = 0;
        int cimpares = 0;

        System.out.print("Ingrese el limite del vector: ");
        try {
           
            if (n > 0) {
                int[] arreglo1 = new int[n];
                for (int i = 0; i < arreglo1.length; i++) {//Llenado del arreglo
                    arreglo1[i] = (i + 1);
                    if (arreglo1[i] % 2 == 0) {
                        cpares++;
                    } else {
                        cimpares++;
                    }
                    System.out.print(arreglo1[i] + " ");

                }
                int[] pares = new int[cpares];
                int[] impares = new int[cimpares];
                for (int i = 0; i < arreglo1.length; i++) {
                    if (arreglo1[i] % 2 == 0) {
                        pares[i] = arreglo1[i];

                    } else {
                        impares[i] = arreglo1[i];

                    }
                }
                for (int i = 0; i < pares.length; i++) {
                    suma += pares[i];

                }
                for (int i = 0; i < impares.length; i++) {
                    suma += impares[i];
                }

                System.out.println("La medio de los numeros pares es: " + (suma / pares.length));
                System.out.println("La suma de los numeros impares es: " + (suma2));

            }

        } catch (Exception e) {
            System.out.println("Ingrese un numero mayor a cero");
        }
    }

    public boolean ejercicio2(int arr1[], int arr2[], int n) {
        int arreglo1[] = arr1;
        int arreglo2[] = arr1;
        int aux = n;
        int arregloaux[] = null;

        for (int i = 0; i < arreglo1.length; i++) {
            
            arregloaux[i] = arreglo1[i] - n;

        }
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arregloaux.length; j++) {
                if (arreglo2[i] == arregloaux[j]) {
                    return true;
                }

            }
            
            
        }
        return false;
    }
    
    public void ejercicio3(int n){

        
        int Suma=0;

        for (int i = 2; i <= n; i++) {

            if (i==2){
                Suma=i;
            }else if (i==3){
                Suma+=3;

            }else if (i==4){
                Suma+=2;

            }else if (i%2==0 && i>=4){

                Suma+=2;

            }else if (i%2!=0 && i>=4){
                Suma+=3;
            }

            System.out.print(Suma + " ");

            if (Suma>n){
                break;
            }

        }
    }
    public String ejercicio4(String text) {
        String texto = text;
        String inversion = "";
        System.out.println("El texto ingresado es: " + texto);
        try {

            for (int i = texto.length() - 1; i >= 0; i--) {
                inversion = inversion + texto.charAt(i);
            }
            System.out.println(inversion);
        } catch (Exception e) {

        }
        return inversion;

    }
}
