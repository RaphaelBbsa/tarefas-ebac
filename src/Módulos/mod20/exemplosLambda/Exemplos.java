package Módulos.mod20.exemplosLambda;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
//uma coisa que notei, é que a a variável ex1 não armazena o valor do resultado, ela é apenas uma referência
//para a aplicação da lógica da expressao lambda. Logo, eu tenho que criar uma variável para armazenar esse valor
//ex1 é uma função

public class Exemplos {
    public static void main (String [] args){
//exemplo com lambda
        IntBinaryOperator ex1 = (int a, int b) -> {
            return a + b;
        };

       int ex2 = ex1.applyAsInt(1,3);
        System.out.println(ex2);

        //como eu faria sem lambda, lembrando que eu não poderia i

        IntBinaryOperator ex3 = new OperatorBinaryClass();
        int result1 = ex3.applyAsInt(1,11);
        System.out.println(result1);

        BiFunction <Double, Double, Double> biFunction = (Double a, Double b) -> {
            return a + b;
        };
        Double resultBi = biFunction.apply(10d,20d);

        //exemplo com String

        BiFunction <Double, Double, String > exemplo4 = (Double a, Double b) -> {
            Double re = a + b;
            return String.valueOf(re);
        };
        String retornoex4 = exemplo4.apply(15d,30d);
        System.out.println(retornoex4);

        //exemplo mais complexo
       Long returnLong = calcular(15L,9L,(Long v1, Long v2) ->{
            return v1 + v2;
        });
        System.out.println(returnLong);

        }
    private static Long calcular (Long t, Long u, BiFunction<Long,Long,Long> function){
        return function.apply(t, u);
    }

//a
}
