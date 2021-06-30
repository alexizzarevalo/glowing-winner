public class Practica {

    public void ejercico1(int n) {

    }
    public static boolean ejercicio2(int A[], int B[], int n){
        for (int i = 0; i <1000 ; i++) {
            if(A[i]-2==B[i]){
                return true;
            }
            break;
        }
        return false;
    }
    public void ejercicio3(int n){
        int c,p,d;
        c=1;
        p=2;
        d=2;
        while(c<=n){
            if(p%d==0){
                if(p==d){
                    System.out.print(p+",");
                    c++;
                }
                d=2;
                p++;
            }
            else
                d++;
        }


    }
    public void ejercicio4(String n){
        String sCadenaInvertida ="";
        for (int x=n.length()-1;x>=0;x--)
            sCadenaInvertida = sCadenaInvertida + n.charAt(x);
        System.out.println();
        System.out.println(sCadenaInvertida);
    }

}
