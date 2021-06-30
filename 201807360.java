public class Practica {
    
    public void ejercicio1(int num){
        int suma = 0, promedio =0, contador = 0;
        try {
            for (int i = 1; i <= num; i++) {
                if(i%2 == 0){
                    contador++;
                    promedio += i;
                }else if(i%2 != 0){
                    suma += i;
                }
            }
        
            System.out.println("La suma de los impares es: " + suma + "\tEl Promedio de los pares es: " + (promedio/contador));
        } catch (Exception e) {
            System.out.println("No ingreso un numero");
        }
    }
    
    public void ejercicio2(int[] a, int[] b, int num){
        try {
            if(a.length != 0 && b.length != 0){    
            for (int i = 0; i < a.length; i++) {
                int sum = a[i] - num;
                boolean estado = false;
                int aux =0;
                for (int j = 0; j < b.length; j++) {
                    aux = j;
                    if(sum == b[i]){
                        estado = true;
                        System.out.println("["+a[i]+"] - "+ num +" = ["+b[j]+"] // true");
                        break;
                    }
                }
                if(estado == false){
                    System.out.println("["+a[i]+"] - "+ num +" != ["+aux+"] // false");
                }
            }
        }else{
            System.out.println("Uno de los arreglos esta vacio.");
        }
        } catch (Exception e) {
            System.out.println("Un dato no era un numero.");
        }
    }
    
    public void ejercicio3(int num){
        int contador = 2;
        boolean estado = true, estado_1 = true;
        while(contador < num){
            if(num > contador){
                System.out.print(contador +", ");
            }
            if(estado == true){
                contador+= 3;
                estado = false;
            }else if(estado == false){
                contador += 2;
                estado = true;
            }
        }
    }
    
    public void ejercicio4(String text){
       System.out.println(" ");
       for (int i = text.length(); i > 0; i--) {
           
            System.out.print(text.substring(i-1 , i));
        }
        System.out.println(" ");
    }
}
