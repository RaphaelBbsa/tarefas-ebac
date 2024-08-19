package Módulos.mod22.stream;

import java.util.List;

public class Count { //aqui eu pego quantas pessoas começam com B na minha lista e uso o método count pra contar
    public static void main(String[] args) {

         List<Pessoa> pessoas = new Pessoa().populaPessoa();

         long count = pessoas.stream()
                 .filter(pessoa -> pessoa.getNome().startsWith("B"))
                 .count();

        System.out.println(count);




    }
}
