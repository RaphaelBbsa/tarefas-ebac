package Módulos.mod15.test;

import Módulos.mod15.builder.Pessoa; //vantagem de usar o Builder é que as vezes posso ter classes com MUITOS construtores e o código vai embolar e não ficará claro
//tem também a vantagem da imutabilidade, que
public class BuilderTeste01 {

   public static void main (String [] args){
      Pessoa raphael = new Pessoa.PessoaBuilder()
              .nome("João")
              .sobrenome("Porto")
              .email("jojo@gmail")
              .username("jaxX")
              .build();

      System.out.println(raphael);

   }


/**
 * EXEMPLO DO POR QUE A IMUTABILIDADE TEM VANTAGENS
 * public class TesteCarro {
 *     public static void main(String[] args) {
 *         Carro carro = new Carro("Fusca", "Azul");
 *         System.out.println("Modelo: " + carro.getModelo() + ", Cor: " + carro.getCor());
 *
 *         // Não há método setCor, o estado do carro não pode ser alterado
 *         // carro.setCor("Vermelho"); // Isso causaria um erro de compilação
 *
 *         // Para "alterar" o carro, você cria uma nova instância:
 *         Carro novoCarro = new Carro("Fusca", "Vermelho");
 *         System.out.println("Modelo: " + novoCarro.getModelo() + ", Cor: " + novoCarro.getCor());
 *     }
 * }
 */



}
