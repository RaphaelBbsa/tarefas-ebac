package Módulos.mod17.ExemploPExplicaroUso.service;
import java.util.List;

public class RentalService <T>{
    private List <T> objetoDisponivel;

    public RentalService(List <T> objetoDisponivel){
        this.objetoDisponivel = objetoDisponivel;
    }

    public T buscarObjeto (){ //O método buscarObjeto retorna um valor do tipo genérico T. O tipo T é definido quando a
        // classe RentalService é instanciada com um tipo específico, como RentalService<Car> ou RentalService<Bike>.
        System.out.println("Buscando o objeto deseajdo");
        T t = objetoDisponivel.remove(0);
        System.out.println("Alugando o/a " + t + "para você!");
        System.out.println("Objetos que ainda estão disponíveis: ");
        System.out.println(objetoDisponivel);
        return t;
    }

    public void retornarObjetoAlugado (T t){ //O método retornarObjetoAlugado não retorna nenhum valor, então seu tipo de retorno é void.
        System.out.println("Você alugou: " + t);
        System.out.println("Devolvendo o que foi alugado para locadora");
        objetoDisponivel.add(t);
        System.out.println("Lista dos disponíveis: " + objetoDisponivel);
    }
}
