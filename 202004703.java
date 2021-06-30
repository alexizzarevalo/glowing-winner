public class Practica {
    public int ejercicio1(int n){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if(n/2 == 0){
                suma = suma + n;
                i--;
            }else(n/2 > 0){

            }

        }

    }

    public Boolean ejercicio2(int[] A1, int[] A2, int num){
        for (int i = 0; i < A1.length; i++) {

            if(A1[i] - num == A2[i]){
                System.out.println(true);
                return true;
            } else {
                System.out.println(false);
                return false;
            }
        }
        return null;
    }

    public void ejercicio3(int n){
        int constante = 0;

        while(constante < n) {
            constante = constante + 2;
            System.out.print(constante + ", ");
            constante = constante + 3;
            System.out.print(constante + ", ");
        }
    }

    public void ejercicio4(String cadena){
        char[] cadenaPI = cadena.toCharArray();
        String invertida = "";

        for (int i = cadenaPI.length-1; i >=0 ; i--) {
            invertida += cadenaPI[i];
        }System.out.println(invertida);
    }
}
