public class Practica {
    /*int A[]={5,7,9,10};
    int B[]={1,9,3,2,4,6};
    int n =2;*/
    public Practica() {
       // ejercicio1();
        //ejercicio2(A, B, n);
        System.out.println("");
        //ejercicio3();
        
    }

    public void ejercicio1(int n) {
        int suma=0;
        int sumap=0;
        int contador=0;
        double prome=0;
        for (int i = 1; i <=n; i++) {
            if ((i % 2) != 0) {
               suma=suma+i;
               
            }
            if (i%2==0) {
                
              
                sumap=sumap+i;
               contador++;
            }
        }
      
        if (contador!=0) {
              prome=sumap/(contador);
        }
        System.out.println("**********************Ejercicio 1***********************");
        System.out.println("Suma impares:" +suma);
        System.out.println("Promedio pares:"+ prome);
    }
    public boolean ejercicio2(int []a, int []b, int n){
        System.out.println("**********************Ejercicio 2***********************");
        
        boolean verdad=false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ((a[i]-n)==b[j]) {
                    verdad=true;
                }
            }
        }
        return verdad;
    }
    
    
    public void ejercicio3(int n){
        System.out.println("**********************Ejercicio 3***********************");
        //int n=25;
        int suma=0;
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                suma=suma+2;
                  System.out.print(" "+ suma+ " ");
                  if (n<=suma) {
                    break;
                }
            }
            if (i%2!=0) {
                suma=suma+3;
                  System.out.print(" "+suma+ " ");
                   if (n<=suma) {
                    break;
                }
            }
        }
      
    }
    
    public void ejercicio4(String cadena){
        
        String reves = "";
        
        
        
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
           
            reves += cadena.charAt(indice);
        }
      
        System.out.println("Mensaje al reves: " + reves);
    }
}
