package Módulos.mod12.map;

/**
 * Permite chaves e valores null. Não garante dados ordenados
 * Para usar uma classe que implementa o Map, deve sobrescrever o metodo hashcode e equals
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploHashMap {
    public static void main(String args[]){
        listaSimples();
        iterandoValorListaSimples();
        iterandoChavesListaSimples();
        iterandoValorDaChave ();
    }

    private static void iterandoValorDaChave() {
        System.out.println("****iterando o valor da chave****");
        Map<Integer, String> listaChave = new HashMap<>();
        listaChave.put(1, "Raphael");
        listaChave.put(2, "Porto");
        listaChave.put(3, "Barbosa");

        Set<Map.Entry<Integer, String>> entry = listaChave.entrySet(); //entrySet retorna todas as entradas (map.entry) do mapa
        for(Map.Entry<Integer, String> e: entry){ //SetMap cria um conjunto de entradas do mapa. O laço que eu fiz, é tipo um forEach que vai iterar sobre cada entrada desse conjunto
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }
        System.out.println("***Outra forma de iterar***"); //listaChave é um objeto do tipo map, logo o método entrySet retorna o conjunto do que entrou (Map.entry) do mapa
        listaChave.entrySet().forEach(e ->{ //o ferEach é um loop mais simples que percorre toda a lista
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });
        System.out.println("***forEach com stream(n sei oq é stream ainda)***");
        listaChave.keySet().stream().forEach(System.out::println); //Uma stream em Java é uma sequência de elementos que pode ser processada de maneira funcional.

        System.out.println("***metodo 3 ***");
        listaChave.forEach((key, value) ->System.out.println(key + " " + value));

        System.out.println("****ITERATOR****");
        Iterator<Map.Entry<Integer, String>> iterator = listaChave.entrySet().iterator();
        while(iterator.hasNext()){ //Iterator é uma interface que fornece métodos para iterar sobre uma coleção de elementos.
            Map.Entry<Integer, String> entry1= iterator.next(); //hasNext(): Retorna true se houver mais elementos na iteração.
            System.out.println("CHAVE: "+ entry1.getKey()); //next(): Retorna o próximo elemento na iteração.
            System.out.println("VALOR: "+ entry1.getValue()); //remove(): Remove o último elemento retornado pelo iterador (opcional e não usado neste exemplo).
            //usar o foreach é mais simples, mas ele não permite remover elementos durante a iteração
        }
        /* Exemplo do iterator removendo
        System.out.println("****Iterando e removendo usando Iterator****");

        Iterator<Map.Entry<Integer, String>> iterator = listaChave.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry1 = iterator.next();
            if (entry1.getKey() == 2) {
                iterator.remove();
            } else {
                System.out.println("CHAVE: " + entry1.getKey());
                System.out.println("VALOR: " + entry1.getValue());
            }
        }

        System.out.println("Mapa após remoção:");
        listaChave.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
         */

    } //Streams não armazenam dados; em vez disso, operam sobre dados fornecidos por coleções, arrays, ou outras fontes.
     // o sout::println é usado para eu não ter que escrever listaChave.keySet().stream().forEach(e -> System.out.println(e));



    private static void iterandoChavesListaSimples() {
        System.out.println("****** exemploListaSimplesIterandoChaves ******"); //aqui eu pego só os valores das chaves
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    private static void listaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
        System.out.println("");
    }

    private static void iterandoValorListaSimples() {
        System.out.println("****** exemploListaSimplesIterandoValores ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");
        for (String value : lista.values()) {
            System.out.println(value);

    }


}
    }
