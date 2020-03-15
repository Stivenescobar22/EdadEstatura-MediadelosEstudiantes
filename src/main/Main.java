package main;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la cantidad de estudiantes:");
        int valor = teclado.nextInt();

        int i = 0;
        int j = 0;
        int[] edad = new int[valor];
        float[] estatura =  new float[valor];
        int edadmedia = 0;
        float estaturamedia = 0;
        int cantidad = 0;
        int cantidadest = 0;


        for(i = 0; i < valor; i++){

            System.out.println("estudiante #" + (i + 1) + ":");
            System.out.println("ingresa la edad:");
            edad[i]  = teclado.nextInt();
            System.out.println("ingrese estatura (cm):");
            estatura[i] = teclado.nextFloat();
            System.out.println("");

            edadmedia = edadmedia + edad[i];
            estaturamedia = estaturamedia + estatura[i];

            if(edad[i] == 18){
                cantidad = cantidad + 1;
            }

            if(estatura[i] > 175){

                cantidadest = cantidadest + 1;

            }


        }



        System.out.println("suma edades" + edadmedia);

        System.out.println("la edad media es: " + edadmedia / valor);
        System.out.println("la estatura media es: " + estaturamedia / valor);
        System.out.println("cantidad de estudiantes de 18 años: " + cantidad);
        System.out.println("cantidad de estudiantes que miden mas de 175cm: " + cantidadest);





    }
}
