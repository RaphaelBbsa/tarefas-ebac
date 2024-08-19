package Módulos.mod22.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Map basicamente pega a stream e faz as instruções que eu dou. O collect é usado pra reunir os elementos finais
//Ele utiliza um  collector para especificar como os elementos devem ser agrupados.
public class ExemploComMap {
    public static void main(String [] args){

    List<Integer> numeros = Arrays.asList(1,2,3,4,5);

    List<String> palavras = Arrays.asList("gato", "lula", "ladrao" );


    List<Integer> dobrandoNumeros = numeros.stream()
            .map(numero -> numero * 2)
            .collect(Collectors.toList());

    String palavrasJuntas = palavras.stream().map(String :: toUpperCase).collect(Collectors.joining(", "));

        System.out.println(dobrandoNumeros);
        System.out.println(palavrasJuntas);



    }
}
