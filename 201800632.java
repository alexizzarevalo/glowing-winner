public class Practica {
    int[] arregloA = {5,7,9,10};
    int[] arregloB = {1,9,6,2,4,6};

    public Practica() {
        String prueba1 = "prueba de ejercicio4";
        ejercicio1(32);
        boolean variable = ejercicio2(arregloA, arregloB, 0);
        System.out.println(variable);
        ejercicio3(10);
        ejercicio4(prueba1);

    }

    void ejercicio1(int n) {        
        int sumatoria;
        int promedioRaw = 0;
        int[] numeros;
        numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = i+1;
        }
        sumatoria = 0;
        for (int i = 1; i < n; i++) {    
            if(i % 2 == 0){                
            sumatoria += numeros[i];            
            }else{            
            promedioRaw += numeros[i];            
            }
        }
        int promedio = (promedioRaw)/n;
        int sumatoriaCalibrada = sumatoria + 1;
        System.out.println("Sumatoria impares: " + sumatoriaCalibrada + " Promedio pares: " + promedio);
        
    }

    boolean ejercicio2(int[] arregloA, int[] arregloB, int n) {
        boolean aux = false;
        for (int i = 0; i < arregloA.length; i++) {
            for (int j = 0; j < arregloB.length; j++) {
                if (arregloA[i] - n == arregloB[j]) {
                    aux = true;
                }
            }
        }        
        return aux;
    }

    void ejercicio3(int n) {        
        int dos = 0;        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                dos += 2;
            }else{
            dos+= 3;
            }
            System.out.print(dos + " ");
        }
        
    }

    void ejercicio4(String cadena) {
        String[] palabras = cadena.split("");   
        for (int i = 0; i < palabras.length/2; i++) {
            String temp = palabras[i];
            palabras[i] = palabras[palabras.length -1 - i];
            palabras[palabras.length -1 - i] =  temp;
        }
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
  
    }
    
}
