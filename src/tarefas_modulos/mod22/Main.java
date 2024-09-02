package tarefas_modulos.mod22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


       private static List<Atletas> atletas = Arrays.asList(new Atletas("Raphael","Futebol","Masculino","Brasileiro"),
                        new Atletas("Lara","Futebol","Feminino","Brasileira"),
                        new Atletas("Joana","Tenis","Feminino","Eslováquia"),
                        new Atletas("Sérgio","Atletismo","Masculino","Romeno"));
    public static void main(String[] args) {

        Stream<Atletas> listaAtletas = atletas.stream();

        List<Atletas> listaMulheres = getListaMulheres();
        listaAtletas.forEach(System.out::println);


        List <Atletas> ListMulher = atletas.stream()
                .filter(at -> at.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        System.out.println("Lista com apenas mulheres: ");
        System.out.println(ListMulher);



        //sem o forEach

       // for(Atletas a : atletas){
          //  System.out.println(a);
        }
    public static List<Atletas> getListaMulheres (){
        return  atletas.stream()
                .filter(at -> at.getSexo().equals("Feminino"))
                .collect(Collectors.toList());
    }

    }

