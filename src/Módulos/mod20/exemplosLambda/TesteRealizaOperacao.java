package Módulos.mod20.exemplosLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class TesteRealizaOperacao {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);
        System.out.println("***MULTIPLICACAO***");
        realizaOperacao(lista, (n) -> n * 5);

        realizaOperacao(lista, (n)-> n + 3);


    }

    public static void realizaOperacao (List <Integer> lista, IntFunction<Integer> function){
        lista.forEach(n ->{
            n = function.apply(n);
            System.out.println(n + " ");
        });
    }
}
