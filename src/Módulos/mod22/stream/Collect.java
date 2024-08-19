package Módulos.mod22.stream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new Pessoa().populaPessoa();
        //note que nesse código, agrupei por idade as pessoas, filtrando somente os brasileiros.

        Map<Integer, List<Pessoa>> agrupaPorIdade = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.groupingBy(Pessoa :: getIdade));

        System.out.println(agrupaPorIdade);


    }
}
