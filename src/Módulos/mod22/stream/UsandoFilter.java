package Módulos.mod22.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class UsandoFilter {
    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().populaPessoa();
        Stream <Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"));

        //deixar algumas diversas formas de iterar na stream

        //stream.forEach(pessoa -> System.out. :: println);
        stream.forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() +  " || Nacionalidade: " + pessoa.getNacionalidade()));

        Predicate <Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Brasileiro");
        Stream <Pessoa> stream2 = lista.stream().filter(pred);

        stream2.forEach(System.out::println);
    }
}

//se eu fosse usar o predicate sem lambda seria assim
/// Suponha que a classe Pessoa e o método populaPessoa estejam definidos corretamente
//        List<Pessoa> lista = Pessoa.populaPessoa();
//
//        // Criando o Predicate sem usar expressão lambda
//        Predicate<Pessoa> pred = new Predicate<Pessoa>() {
//            @Override
//            public boolean test(Pessoa pessoa) {
//                return pessoa.getNacionalidade().equals("Brasileiro");
//            }
//        };