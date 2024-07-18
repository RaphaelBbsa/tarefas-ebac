package Módulos.mod17.ExemploPExplicaroUso;

import Módulos.mod17.ExemploPExplicaroUso.service.RentalService;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

public class ClasseGenericaTeste02 {
    public static void main(String[] args) {
        List<Carro> carroDisponivel = new ArrayList<>();
        List<Barco> barcoDisponivel = new ArrayList<>();
        Carro carro1 = new Carro("BYD");
        Carro carro2 = new Carro("ABS-099");
        carroDisponivel.add(new Carro("ABT - 032")); //melhor forma de adicionar logo!

        carroDisponivel.add(carro1);
        carroDisponivel.add(carro2);

        Barco barco1 = new Barco("Lancha grande");
        Barco barco2 = new Barco("Lancha pequena");

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carroDisponivel);
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcoDisponivel);

        rentalServiceCarro.buscarObjeto();
        rentalServiceCarro.retornarObjetoAlugado(carro1);

       Carro primeiro = pegarprimeiroLista(carroDisponivel);
        System.out.println("Primeiro carro disponível: " + primeiro);


    }

    public static  <T> T pegarprimeiroLista(List<T> lista) {
        System.out.println(lista.get(0));
        return lista.get(0);
    }
}

