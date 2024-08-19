package Módulos.mod22.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorted {

    //sorted orga
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        List <Pessoa> sorteada = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Belga"))
                .sorted(Comparator.comparing(Pessoa::getNome)).collect(Collectors.toList());

        List <Pessoa> stream1 = lista.stream()
                .sorted(Comparator.comparing(Pessoa:: getIdade))
                        .collect(Collectors.toList());

        System.out.println(sorteada);
        System.out.println(stream1); //aqui sorteia da menor pro maior

    }
}
