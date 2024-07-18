package Módulos.mod17.ExemploPExplicaroUso.service;

import Módulos.mod17.ExemploPExplicaroUso.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
    private List<Carro> carrosDisponiveis = new ArrayList<>();
//eu poderia criar a lista com new ArrayList<>(List.of(New Carro "Nome do carro.. etc". Ela é uma lista
    //imutável, nao posso alterar. Serve mais para pequenas listas.
    public CarroService (){
        carrosDisponiveis.add(new Carro("BMW"));
        carrosDisponiveis.add(new Carro("Mercedes"));
    }
    public Carro BuscarCarroDisponivel(){
        System.out.println("Buscando carro disponível...");
        Carro carro1 = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+ carro1);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro1;
    }
    public void retornarCarroAlugado(Carro carro1){
        System.out.println("Devolvendo carro " + carro1);
        carrosDisponiveis.add(carro1);
        System.out.println("Carros disponiveis "+ carrosDisponiveis);
    }


}
