
public class Practica {

    public  void ejercicio1(){
        System.out.println("EJERCICIO_1");
        int r=0;
        int rr=0;
        int contador=0;
        int promedio=0;
        System.out.print(">>Ingrese el numero de límite: ");
        int numero2;
        Scanner numeros = new Scanner(System.in);
        numero2 = numeros.nextInt();
        for(int i =1; i <=numero2; i++) {
            if (i % 2 == 0){
                contador++;
                int par = i;
                 r= r+par;
                 promedio=r/contador;

            }else if(i%1 ==0){
                int impar = i;
                 rr=rr + impar;
            }

        }
        System.out.println("la Suma de impares es: "+rr);
        System.out.println("El promedio de pares es:" +promedio);
        System.out.println("La Suma de Pares es: " +r);

    }
        public boolean ejercicio2(int ar1[], int ar2[], int numero) {
            System.out.println("EJERCICIO_2");
            int aux = 0;
            if (ar1 != null && ar2 != null) {
                for (int i = 0; i < ar1.length; i++) {
                    aux = ar1[i] - numero;
                    for (int j = 0; j < ar2.length; j++) {
                        if (ar2[j] == aux) {
                        //    System.out.println("true");
                            return true;

                        }
                    }
                }
            }
           // System.out.println("false");
            return false;
        }
    public int ejercicio3(int n){
        System.out.println("EJERCICIO_3");

        int aux = 0;
        for (int i = 0; aux < n; i++) {
            if(i%2 == 0){
                aux = aux +2;
                if(aux <= n){
                    System.out.print((aux)+", ");
                }
            }else{
                aux = aux +3;
                if(aux <= n){
                    System.out.print((aux)+", ");
                }
            }
        }
        return 0;
    }
    public String ejercicio4(String cadena){
        System.out.println("EJERCICIO_4");

        String retorno = "";
        for (int x=cadena.length()-1;x>=0;x--)
            retorno = retorno + cadena.charAt(x);
        System.out.println(retorno);
        return retorno;
    }
}
