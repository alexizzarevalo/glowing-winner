public class Practica {
    public void ejercicio1(){
        int n = 0;
        System.out.println("");
        System.out.println("Ingrese el rango limite");
        System.out.print(">");
        try{
            Scanner sc = new Scanner(System.in);
             n = Integer.parseInt(sc.nextLine());
            int suma = 0;
            int sumaimpares = 0;
            int contadorImpares = 0;
            for (int i = 0; i <=n; i++) {
                if(i%2 == 0){
                    suma +=i;
                }
                else{
                    contadorImpares++;
                    sumaimpares +=i;
                }
            }
            double promedio = sumaimpares/contadorImpares;
            System.out.println("Suma de Pares: "+suma);
            System.out.println("Promedio Impares: "+promedio);
        }catch (Exception e){
            System.out.println("Ha ingresado algo mal a la consola");
            ejercicio1();
        }

    }
    public boolean ejercicio2(int arregloA[], int [] arregloB, int n){
        boolean decision = false;
        for (int i = 0; i < arregloB.length; i++) {
            for (int j = 0; j < arregloA.length; j++) {
                if(arregloB[i] == arregloA[j] - n){
                    decision = true;

                }
            }
        }
        return decision;
    }
    public void ejercicio3(){
        int n = 0;
        System.out.println("");
        System.out.println("Ingrese el rango limite");
        System.out.print(">");
        try{
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            int suma = 0;
            while(suma < n){
                suma+=2;
                if(suma>n){
                    break;
                }
                System.out.print(suma+" ");
                suma+=3;
                if(suma>n){
                    break;
                }
                System.out.print(suma+" ");

            }
        }catch (Exception e){
            System.out.println("Ha ingresado algo mal a la consola");
            ejercicio3();
        }

    }
    public void ejercicio4(){
        int n = 0;
        System.out.println("");
        System.out.println("Ingrese el su palabra");
        System.out.print(">");
        try{
            Scanner sc = new Scanner(System.in);
            String [] cadena = sc.nextLine().split("");
            for (int i = cadena.length-1; i >= 0; i--) {
                System.out.print(cadena[i]);
            }
        }catch (Exception e){
            System.out.println("Ha ingresado algo mal a la consola");
            ejercicio4();
        }

    }
}
