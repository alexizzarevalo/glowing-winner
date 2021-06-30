public class Practica {
//Ejercicio 3
        public int ejercicio1(int numero, int sumaimpar, int promediopares){

                int x = 1;
                int y = 0;
                for(int i= 1; i<=numero;i++){

                        if (x==1){
                        x++;
                        sumaimpar = sumaimpar + i;
                        } else{
                        x--;
                        y++;
                        promediopares = promediopares + i;
                        }
                }
                if(promediopares != 0) {
                        promediopares = promediopares / y;
                }
System.out.println("suma impares : " + sumaimpar);
System.out.println("Promedio Pares : " + promediopares);
return numero;
}
 //Ejercicion 2
        public boolean ejercicio2(String[] arr1, String[] arr2,int numero2,boolean flg){

                for(int i=0; i<arr1.length;i++){
                        int valor = Integer.parseInt(arr1[i]);
                        valor = valor - numero2;
                        for(int b=0; b<arr2.length;b++){
                                if( Integer.parseInt(arr2[b]) == valor ){
                                        flg = true;
                                        break;
                                }
                        }
                }
                System.out.println("Existen resultados " + flg);
                return flg;
        }
  
  
  
  //Ejercicio 3
        public int ejercicio3(int numero3){
                int x= 1;
                for(int i=1; i<numero3;i++){
                        if (x==1){
                             i = i+1;
                             x = x + 1;
                        } else{
                             i = i+2;
                             x = 1;
                        }

                                System.out.println("Valor..: " + i);
                }

                return numero3;
        }


}
