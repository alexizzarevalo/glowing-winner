import java.util.Scanner;

public class Practica {
    public static void ejerciciouno(){
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el rango de 1 a: ");
        try {
            int Rango = Leer.nextInt();
            int pares=0, inpares=0, contP=0;
            for (int i = 0; i <Rango ; i++) {
                int valor=i+1;
                if((valor)%2==0){
                    pares=pares+valor;contP++;
                }else{
                    inpares=inpares+valor;

                }
            }
            System.out.println("Suma de inpares: "+inpares);
            int promedio=pares/contP;
            System.out.println("Promedio de pares: "+promedio);
            System.out.println("----------------------------------------");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Boolean ejerciciodos(int[] arreglo1, int[] arreglo2,int numero){
        try{
            for (int i = 0; i < arreglo1.length; i++) {
                for (int j = 0; j < arreglo2.length; j++) {
                    int v1=arreglo1[i];
                    int v2=arreglo2[j];
                    if((v1-numero)==v2){
                        return true;
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public static String ejerciciotres(int n){
        String cadena="";
        Double valor=0.;
        for (int i = 1; i < n; i++) {
            valor =(0.25)*((10*i)+-1);
            int V=Integer.parseInt(String.valueOf(Math.round(valor)));
            if (V>n){
                break;
            }else{
                cadena=cadena+V+", ";
            }
        }
        return cadena;
    }
    public static String ejerciciocuatro(String texto){
     String cadena="";
     String[] arreglo= new String[texto.length()];
        for (int i = 0; i <texto.length() ; i++) {
            try {
                arreglo[i] = String.valueOf(texto.charAt(texto.length() - i - 1));
                cadena = cadena + arreglo[i];
            }catch (Exception e){

            }
        }
     return cadena;
    }
}
