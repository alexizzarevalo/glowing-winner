public class Practica {
    
    public void ejercicio1(int numero){
        
        int contador=0;
        int paroimpar;
        int resultadopares=0;
        int resultadoimpares=0;
        
        for (int i = 1; i <= numero; i++) {
            paroimpar= i%2;
            if (paroimpar==1) {
                resultadoimpares=resultadoimpares+i;
            }
            if (paroimpar==0) {
                resultadopares=resultadopares+i;
                contador++;
            }
        }
        System.out.println("Suma impares:"+ resultadoimpares);
        System.out.println("Promedio pares:"+ (resultadopares/contador));
    
    }
    
    
    
    
    public void ejercicio2(int[] Uno, int[] Dos, int numero){
        int resta;
        boolean comprobado=true;
        if(Uno.length==0 || Dos.length==0){
            System.out.println("Array Con Valores Invalidos");
        }
        else{
        for (int i = 0; i < Uno.length; i++) {
          resta = Uno[i]-numero;
            for (int j = 0; j < Dos.length; j++) {
                
                if (resta==Dos[j]) {
                    comprobado=true;
                    j=Dos.length+2;
                    i=Uno.length+2;
                }
                else{
                comprobado=false;
                }
            }
        }
        System.out.println(comprobado);
       
    }}
    public void ejercicio3(int limite){
        int i = 1;
        int j=0;
        int [] arraysecuencia=new int[(limite/2)+1];
        int secuencia=0;
        
        while(limite>secuencia){
            
            
                if (i%2==1) {
                    secuencia=secuencia+2;
                    arraysecuencia[j]=secuencia;
                }
                if (i%2==0) {
                    secuencia=secuencia+3;
                    arraysecuencia[j]=secuencia;
                }
                j++;
                i++;
                
            }
        for (int k = 0; k < arraysecuencia.length; k++) {
            if (arraysecuencia[k]>limite ||arraysecuencia[k]==0 ) {
                
            }
            else{    
            System.out.print(arraysecuencia[k]+" ");
            }
        }
        
    }
    public void ejercicio4(String cadena){
        char [] cadenaArray = cadena.toCharArray();
        for (int i = cadenaArray.length-1; i >= 0; i--) {
            System.out.print(cadenaArray[i]);
        }
        System.out.println("");
        
    }
    

	

    
}
