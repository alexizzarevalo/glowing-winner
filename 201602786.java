
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jema
 */

public class Main {
  

    public static void main(String[] args) throws Exception {

        //1
        ejercicio1(15);
        
        //2
        int[] arr1 = {5,7,9,10};
        int[] arr2 = {1,9,3,2,4,6};
        if(ejercicio2(arr1,arr2,2)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
        
        //3
        ejercicio3(25);
        
        //4
        ejercicio4("texto alreves");
    }
    
    public static void ejercicio1(int n){
        System.out.println("Ejercicio 1");
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        for(int i = 1; i <= n; i++){
            if(i%2==0){
                sumaPares+=i;
                contadorPares++;
            }else{
                sumaImpares+=i;
            }
        }
        System.out.println("Suma de impares "+sumaImpares);
        System.out.println("Suma de impares "+ (sumaPares/contadorPares));
        System.out.println();

    }
    
    public static Boolean ejercicio2(int[] arr1, int[] arr2, int n){
        System.out.println("Ejercicio 2");

        int rest;
        for(int i = 0; i <arr1.length; i++){
            rest = arr1[i]-n;
            for(int j = 0; j<arr2.length;j++){
                if(rest == arr2[j]){
                    return true;
                }
            }
        }
        System.out.println();

        return false;

    }
    
    public static void ejercicio3(int limite){
        System.out.println("Ejercicio 3");

        int base = 2;
        int base2 = 3;
        List<Integer> lista = new ArrayList<>();
        
        for(int i = 1; i<limite;i++){
            int lastElement = 0;
            int sizeList = lista.size();
            if(sizeList>=1){
                lastElement = lista.get(lista.size() - 1);
                if(lastElement >= limite){
                    break;
                }
            }
            if(i%2==0){
                lista.add(lastElement+3);
            }else{
                lista.add(lastElement+2);
            }
        }
        
        for (int number : lista) {
            System.out.print(number);
        }
        System.out.println();
        
    }
    
    public static void ejercicio4(String texto){
        System.out.println("Ejercicio 4");

        for (int i = (texto.length() - 1); i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }   
    }
   
    
}


