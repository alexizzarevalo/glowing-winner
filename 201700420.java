import java.util.Scanner;


public class Practica {
        int n;
        String c;
        boolean men = true;
       public Practica (){
           
       }
       
    public void Ejecutable(){
         int menu;         
         while(men==true){
                System.out.println("===Seleccione lo que desea hacer===");
                System.out.println("1.Ejercicio 1");
                System.out.println("2.Ejercicio 2");
                System.out.println("3.Ejercicio 3");
                System.out.println("4.Ejercicio 4");
                System.out.println("5.Salir");
                Scanner m =new Scanner (System.in);
                menu = m.nextInt();
                
                 switch(menu){
                          case 1:
                          ejercicio1();
                          System.out.println("");
                          break;
                          case 2:
                          ejercicio2();
                          System.out.println("");
                          break;
                          case 3:
                          ejercicio3();
                          System.out.println("");
                          break;
                          case 4:
                          ejercicio4();
                          System.out.println("");
                          break;
                          case 5:
                          men = false;    
                          break;
                          
                }
                
        }
       
}   
     
    public void ejercicio1(){
         int par = 0;
         int impar = 0;
         int s = 0;
         
         Scanner num =new Scanner (System.in);
         System.out.println("Ingrese un numero");  
         n = num.nextInt();
         
         
         for(int i = 1; i <= n; i++){
             System.out.println(i);
             if(i%2 == 0){
                  par = par+i;
                  s++;
             }
             else{
                  impar = impar+i;
             }
         }
         System.out.println("El promedio de pares es: "+par/s);
         System.out.println("La suma de impares es: "+impar);
        
    }
    public void ejercicio2(){
        System.out.println("No me dio tiempo :c");                   
        
    }
    public void ejercicio3(){
         Scanner lim=new Scanner (System.in);
         System.out.println("Ingrese un numero");  
         n = lim.nextInt();
         boolean check = true;
         
         for(int i = 0; i <= n;){
            if(check==true){
                  i = i+2;
                  check = false;
            }
            else{
                  i = i+3;
                  check = true;
            }
             System.out.print(i+", ");
         }
          
    }
    public void ejercicio4(){
         Scanner cadena =new Scanner (System.in);
         System.out.println("Ingrese su texto");  
         c = cadena.nextLine();
         char t;
         
         for (int i = c.length()-1; i >= 0 ; i--){
                 t = c.charAt(i);
                 System.out.print(t);
         }
         
    }
}
