public class Practica {
    public  void ejercicio1(int n){
        System.out.println("\nEJERCICIO1____________"+"\n");
      int impares=0,contipares=0,totipares=0;
      try {
          for (int i = 1; i <= n; i++)
              if (i % 2 != 0) impares += i;
              else {
                  totipares += i;
                  contipares++;
              }

          System.out.println("Suma impares: " + impares);
          System.out.println("Promedio Pares: " + (totipares / contipares));
      }
      catch (Exception e){System.out.println("Error en los datos ingresados");}

    }
    public boolean ejercicio2(int[]a,int[] b,int c){
        System.out.println("\nEJERCICIO2____________"+"\n");
        try {
            for (int p:b)
                for (int j:a)
                    if (p==(j-c)) {
                        System.out.println(p+" = "+j+" - "+c);
                        return true;

                    }

            return false;



        }
        catch (Exception e){

            System.out.println("Error en los datos ingresados");
        }

        return false;


    }
    public  void ejercicio3(int n){
        System.out.println("\nEJERCICIO3____________"+"\n");
        String g="2 ";
        int j=2;
        try {

        for (int i =0;i<=n;i++)
        {
            if (i%2==0)
            {
                j+=3;
                g+=j+" ";}
            else{
                j+=2;
                g+=j+" ";}

        }
        System.out.println(g);
        }
        catch (Exception e){System.out.println("Error en los datos ingresados");}

    }
    public  void ejercicio4(String g){
        System.out.println("\nEJERCICIO4____________"+"\n");
        try {


        char[] gg = g.toCharArray();
        for (int i=gg.length-1;i>-1;i--)
        {
            System.out.print(gg[i]);
        }
        }
        catch (Exception e){System.out.println("Error en los datos ingresados");}

    }
}
