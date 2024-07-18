package tarefas_modulos.mod17;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new BYD("BYD", "Tiger",2023d,"elétrico"));
        carros.add(new Chevrolet("Chevrolet","Tracker",2018d,"combustão"));
        carros.add(new Honda("Honda","Civic",2019d,"combustão"));
        carros.add(new Toyota("Toyota","Corolla",2024d,"hibrído"));

        imprimirCarros(carros);
        }


        public static void imprimirCarros (List<? extends Carro> listaCarros){ //note que aqui minha lista
        //recebe qualquer tipo de carro, pois Carro é a classe pai, logo as filhas podem ser declaradas nessa lista
        for (Carro x : listaCarros) x.exibirCarro();
        }
}
