package Módulos.mod12.Arrays;
import java.util.Scanner;

//não posso usar o metodo convert dentro da Main

public class BubbleSortDinamico {
    public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);


        System.out.println("***Digite os números para eu organizar***: ");
        String numeros = entrada.next();
        String [] vetStr = numeros.split(",");
        int [] vet = convert(vetStr);
        int aux = 0;
        int i = 0;

        System.out.println("***Vetor sem ordem***");
        for (i=0; i<vet.length; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();



}
    private static int[] convert(String [] vetStr){
        int [] numeros = new int[vetStr.length];
        for(int i = 0; i < vetStr.length; i++){
            numeros[i] = Integer.parseInt(vetStr[i]);
        }
        return numeros;
    }
    }
