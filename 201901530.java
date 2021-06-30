public class Practica {

    //ejercicio 1

    public void ejercicio1(int nlimite) {
        System.out.println();
        System.out.println("--ejercicio 1 --");

        int sumaimpares = 0;
        int promediopares = 0;

        int cantidadn = 0;
        //arreglos
        Integer[] arreglon = new Integer[nlimite+1];
        Integer[] arreglopares = new Integer[nlimite+1];

        for (int i = 1; i <= nlimite; i++) {
            if (i != nlimite) {
                System.out.print(i+", ");
            }else {
                System.out.println(i);
            }
            if ( i%2 != 0 ) {
                arreglon[i] = i;
            }else {
                arreglopares[i] = i;
                cantidadn++;
            }
        }
        System.out.println("");
        for (int i = 0; i < arreglon.length; i++) {
            if (arreglon[i] != null) {
                sumaimpares += arreglon[i];
            }
        }

        //contador de cuantos numeros hay
        for (int i = 0; i < arreglopares.length; i++) {
            if (arreglopares[i] != null) {
                promediopares += arreglopares[i];
            }
        }
        System.out.println("RESULTADOS");
        System.out.println("SUMA ARRGELO DE LOS IMPARES: "+sumaimpares);
        System.out.println("PROMERDIO DEL ARREGLO PAR: "+promediopares/cantidadn);

    }

    //ejercicio 2

    public boolean ejercicio2(Integer[] Verificacion1,Integer[] resultados, int n){
        System.out.println();
        System.out.println("----Ejercicio 2----");

        for (int i = 0; i < Verificacion1.length; i++) {

            if (Verificacion1[i] != null && resultados[i] != null) {

                for (int j = 0; j < resultados.length; j++) {

                    if (resultados[j] != null ) {

                        if (n == resultados[i]-resultados[j]) {
                            System.out.println("true");
                            return true;
                        }
                    }
                }
            }
        }
        System.out.println("false");
        return false;

    }



    //ejercicio 3
    public void ejercicio3(int numero){

        System.out.println();
        System.out.println("---Ejercicio 3---");
        int suce1,suce2;
        System.out.println("la sucecion aritmetica del limite: " + numero);

        suce1=2;
        suce2=3;

       System.out.print(suce1 + " , ");
        for(int i=0;i<numero;i+=2){
            i = suce2;
            suce2 = suce1 + i;
            System.out.print(suce2 + " , ");
        }
        System.out.println();
    }


    //ejecicicio 4

    public void ejercicio4(String cadena){
        System.out.println();
        System.out.println("---Ejercicio 4---");
        String invertircadena = "";
        for (int i = cadena.length()-1; i >= 0; i--) {
            invertircadena += cadena.charAt(i);
            
        }
        System.out.println("Cadena normal:  " + cadena);
        System.out.println("La cadena invertida es:  " + invertircadena);

    }
}
