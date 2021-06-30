public class Practica {

public void ej1(int n){
            int promedio=0;
            int cont=0;
            int suma=0;
            int numero=0;
            int[] numeros= new int[n];

    for (int i=0; i<numeros.length; i++) {
        numero=numero+1;
        numeros[i]=numero;
    }

    for (int i=0; i<numeros.length; i++) {


        if(numeros[i] % 2 == 0){
            promedio=promedio+numeros[i];
            cont++;
        }else{
            suma=suma+numeros[i];
        }
    }
    System.out.println("promedio pares: "+promedio/cont);
    System.out.println("suma impares: "+suma);
}


public boolean ej2(int[]arreglo1,int[]arreglo2,int numero){
    for (int i=0; i<arreglo1.length ; i++) {
        for (int j=0; j< arreglo2.length ; j++) {
            if (arreglo1[i]-numero==arreglo2[j]){
                return true;
            }
        }

    }
    return false;
}


public void ej4(String texto){
    String invertida="";
    for (int i = texto.length()-1; i>=0; i--){
        invertida += texto.charAt(i);
    }

    System.out.println("invertida: "+invertida);
}

public void ej3(int n){
            int inicio=2;
            boolean supero=false;
            int cont=1;
            while (!supero){
                    System.out.print(inicio+",");
                    if(cont % 2==0){
                        inicio=inicio+2;
                        cont++;
                    }else{
                        inicio=inicio+3;
                        cont++;
                    }
                    if(inicio>n){
                        supero=true;
                    }

            }


}


}
