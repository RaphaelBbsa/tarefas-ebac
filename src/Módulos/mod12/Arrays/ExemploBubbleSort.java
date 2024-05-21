package Módulos.mod12.Arrays;

import java.util.Scanner;

public class ExemploBubbleSort {

    public static void main(String args[]){
        int [] vet = {10,3,4,2,8};
        int aux = 0;
        int i = 0;
        int j = 0;

        System.out.println("***Vetor sem ordenação***");
        for(i = 0; i < vet.length; i++){
            System.out.printf("[" + vet[i] + "]");
        }
        System.out.println();
        System.out.println("***Vetor com ordenação***");

        for(i=0; i< vet.length; i++){
            for( j=0; j< vet.length-1; j++){
                if (vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j]=vet[j+1];
                    vet[j+1] = aux; //aqui nesse código basicamente, caso a condição seja verdadeira ex: 8 > 3, eu vou passar o 8 para a posição do 3 e o vice-versa
                }
            }
        }
        for(i=0; i <vet.length; i++){
            System.out.printf("[" + vet[i] + "]");
        }


        }



    }


