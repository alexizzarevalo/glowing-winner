public class Practica {

    public void ejercicio1(int n){

        int sumaImpares=0;
        int totalPares=0;
        int sumaPromedio=0;

        for (int i = 1; i <= n; i++) {
            if (i%2==0){
                sumaPromedio+=i;
                totalPares++;
            }else {
                sumaImpares+=i;
            }
        }

        double calculoPromedio=sumaPromedio/totalPares;

        System.out.println("Suma impares: " + sumaImpares);
        System.out.println("Promedio pares: " + calculoPromedio);

    }

    public boolean ejercicio2(int [] arreglo1, int [] arreglo2, int n){

        for (int i = 0; i < arreglo1.length; i++) {
            int comprobacionResta=arreglo1[i]-n;

            for (int j = 0; j < arreglo2.length; j++) {

                if (comprobacionResta==arreglo2[j]){
                    return true;
                }
                else{
                    continue;
                }
            }
        }

        return false;

    }

    public void ejercicio3(int n){

        int numeroAnterior=0;
        int sumaNumero=0;

        for (int i = 2; i <= n; i++) {

            if (i==2){
                sumaNumero=i;
            }else if (i==3){
                sumaNumero+=3;

            }else if (i==4){
                sumaNumero+=2;

            }else if (i%2==0 && i>=4){

                sumaNumero+=2;

            }else if (i%2!=0 && i>=4){
                sumaNumero+=3;
            }

            System.out.print(sumaNumero + " ");

            if (sumaNumero>n){
                break;
            }

        }
    }

    public void ejercicio4  (String palabra){

        for (int i = (palabra.length()-1); i >= 0 ; i--) {

            System.out.print(palabra.charAt(i));
        }

    }
}
