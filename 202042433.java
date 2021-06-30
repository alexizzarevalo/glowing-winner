public class Practica {

    public void ejercicio1(int n){
        int sum = 1;
        int promedio = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
        }
        for (int i = 1; i < n; i++) {
            if(i % 2 == 0){
                sum += nums[i];
            }else{
                promedio += nums[i];
            }
        }
        int promed = (promedio)/n;

        System.out.println("EJERCICIO 1.  " +"Sumatoria: " + sum + "  Promedio: " + promed);

    }



    public void ejercicio3(int num){
        System.out.println("EJERCICIO 3.");
        int i=2;
        while(i <= num){

            if (i%2==0){

                System.out.print(i +",");
                i=i+3;
                System.out.print(i + ",");
                i=i+2;
            } else
            {

                System.out.print(i + ",");
                i=i+3;
                System.out.print(i + ",");
                i=i+2;

            }

        }
    }


    public void ejercicio4(String text){
        String invText="";
        for (int a = text.length()-1; a >= 0; a=a-1) {
            invText = invText + text.charAt(a);
        }
        System.out.println("EJERCICIO 4.  "+"Cadena invertida: " + invText);
    }


}
