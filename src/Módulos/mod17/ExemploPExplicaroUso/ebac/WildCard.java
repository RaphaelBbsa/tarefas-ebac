package Módulos.mod17.ExemploPExplicaroUso.ebac;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCard{

    public static void main(String[] args) {

        List<String> lista = criarListGenérica("Rapha");
        imprimir(lista);

    }

    public static <T> List <T> criarListGenérica (T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(t);
        return lista;
    }

    public static void imprimir (List <?> lista){ //nesse método aqui eu posso receber qualquer tipo de lista sem dar pau
        for(Object list : lista){ //toda as classes herdam de object, nesse caso tenho que declarar o object
            System.out.println("Recebendo qualquer tipo de lista " + list);
        }
    }
}
