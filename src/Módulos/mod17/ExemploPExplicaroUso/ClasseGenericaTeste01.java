package Módulos.mod17.ExemploPExplicaroUso;

import Módulos.mod17.ExemploPExplicaroUso.service.CarroService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarroService carroService = new CarroService();
        Carro carro = carroService.BuscarCarroDisponivel();
        System.out.println("Usei por 1 mês");
        carroService.retornarCarroAlugado(carro);
    }
}
//ao executar isso, eu vejo que tudo que fiz para o carro, teria que fazer para o Barco, alterando 1 por 1.
//agora vamos ver como isso fica usando classes genéricas.
