public class Practica {

    public void ejercicio1(int n){
        int suma =0,suma2=0;
        int cantidad=0;
        if(n>1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    suma2 += i;
                    cantidad++;
                } else {
                    suma += i;
                }
            }
            System.out.println("Ejercicio 1");
            System.out.println("Suma de impares: " + suma);
            System.out.println("Promedio de pares: " + (suma2 / cantidad));
        }else{
            System.out.println("Ejercicio 1");
            System.out.println("Debe ingresar un número mayor que 1");
        }
        System.out.println("------------------------------");
    }
    public boolean ejercicio2(int[] a,int[] b,int n){
        System.out.println("Ejericio 2");
        if (a!=null || b!=null){
        for (int i = 0; i < a.length; i++) {
            int aux = a[i]-n;
            for (int j = 0; j < b.length; j++) {
                if (aux==b[j]){
                    System.out.println("A["+i+"]-"+n+" = B["+j+"]");
                    System.out.println(a[i]+"-"+n+" = "+b[j]);
                    System.out.println(true);
                    return true;
                }
            }
        }
        }
        System.out.println(false);
        return false;
    }
    public void ejercicio3(int n){
        System.out.println("------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("Limite: "+n);
        int num=0;
        if (n>=0){
        while(num<=n){
            num+=2;
            System.out.print(num+",");
            if (num<n){
            num+=3;
            System.out.print(num+",");
            }
        }
        }else{
            System.out.println("Ingrese un número mayor o igual que 0");
        }
    }
    public void ejercicio4(String cadena){
        System.out.println("\n------------------------------");
        System.out.println("Ejercicio 4");
        if(cadena!=null) {
        System.out.println("Cadena de texto: "+cadena);
        System.out.print("Cadena al revés: ");
            char[] hola = cadena.toCharArray();
            for (int i = hola.length - 1; i >= 0; i--) {
                System.out.print(hola[i]);
            }
        }else{
            System.out.println("Ingrese un mensaje");
        }
    }
}
