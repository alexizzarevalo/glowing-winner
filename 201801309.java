public class Practica {
    
    public void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        int n;
        int suma=0;
        int promedio=0;
        int impares=0;
        System.out.println("Rango de numeros de 1 a n");
        System.out.print("Ingrese un numero: ");
        n = teclado.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%2==0){
                suma=suma+i;
            }else{
                impares=impares+i;
            }
            promedio=suma/n;
        }
        System.out.println("El promedio de los numeros pares es: "+promedio);
        System.out.println("La suma de los numeros impares es: "+impares);
    }

    public void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        int x=0, y=0, n, z=0;
        int A[] = new int[]{1,2,3,4,5};
        int B[] = new int[]{4,1,6,8};
        System.out.print("Ingrese un numero: ");
        n = teclado.nextInt();
        int tamanioA = A.length;
        for(int i=0;i<tamanioA;i++){
            int buscar = A[i] - n;
        }
    }

    public void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        int serie=2;
        int n;
        boolean sumar=true;
        System.out.print("Ingresar un numero limite: ");
        n = teclado.nextInt();
        int i=0;
        int elementos[];
        elementos = new int[n];
        elementos[0]=2;
    }

    public void ejercicio4(){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        String invercion="";
        System.out.print("Ingrese el texto a revertir: ");
        cadena = teclado.nextLine();
        for(int i = cadena.length()-1;i>=0;i--){
            invercion+=cadena.charAt(i);
        }
        System.out.println("Texto invertido: "+invercion);
    }
}
