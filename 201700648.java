public class Practica {

    public void ejercicio1(int n) {
        System.out.println("");
        System.out.println("ejercicio1");
        int arregloNum[] = new int[500000];
        int arreglosum[] = new int[500000];
        int arregloprom[] = new int[500000];
        int sumaImpares = 0;
        int sumapares = 0;
        int promPares = 0;
        int posicion = 0;
        int posicion2 = 0;
        int n2 = n / 2;
        for (int i = 0; i < 500000; i++) {
            if (i < n) {

                arregloNum[i] = i + 1;
            }
        }
        for (int i = 0; i < 500000; i++) {//imprime todos los numeros

            if (arregloNum[i] != 0) {

                System.out.print(arregloNum[i] + ",");

            }

        }
        for (int i = 0; i < 500000; i = i + 2) {//llena matriz solo con impares
            if (arregloNum[i] != 0) {

                arreglosum[i] = arregloNum[i];

            }

        }

//        System.out.println("");
//        for (int j = 0; j < 500000; j++) {
//            if (arregloNum[j]!=0) {
//                
//            
//                    if (arregloNum[j] != 0) {
//
//                        System.out.print(arreglosum[j] + ",");
//
//                    }
//
//                }
//        }
        for (posicion = 0; posicion < arregloNum.length; posicion = posicion + 2) {// suma los impares
            sumaImpares += arregloNum[posicion];
        }

        System.out.println("");
        System.out.println("Suma Impares: " + sumaImpares);

        for (int i = 1; i < 500000; i = i + 2) {//llena matriz solo con impares
            if (arregloNum[i] != 0) {

                arregloprom[i] = arregloNum[i];

            }

        }
//                System.out.println("");
//        for (int j = 0; j < 500000; j++) {
//            if (arregloprom[j]!=0) {
//                
//            
//                    if (arregloprom[j] != 0) {
//
//                        System.out.print(arregloprom[j] + ",");
//
//                    }
//
//                }
//        }

        for (posicion2 = 1; posicion2 < arregloNum.length; posicion2 = posicion2 + 2) {// suma los impares
            sumapares += arregloNum[posicion2];
        }
        promPares = sumapares / n2;
        System.out.println("Promedio pares: " + promPares);

    }

    public void ejercicio3(int n) {
        System.out.println("ejercicio3");

        int numA = 0;
        int sum = 0;

        for (int i = 2; i <= n; i++) {

            if (i == 2) {
                sum = i;
            }
            if (i == 3) {
                sum += 3;

            }
            if (i == 4) {
                sum += 2;

            }
            if (i % 2 == 0 && i >= 4) {

                sum += 2;

            }
            if (i % 2 != 0 && i >= 4) {
                sum += 3;
            }

            System.out.print(sum + " ");

            if (sum > n) {
                break;
            }

        }
    }

    public void ejercicio4(String cadena1) {
        System.out.println("");
        System.out.println("ejercicio 4");
        char l;
        for (int i = cadena1.length() - 1; i >= 0; i--) {
            l = cadena1.charAt(i);
            System.out.print(l);

        }
        System.out.println("");
    }
}
