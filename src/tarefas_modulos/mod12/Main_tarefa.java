package tarefas_modulos.mod12;
//part1 ler no console nome de pessoas e colocar em ordem alfabética
//part2

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main_tarefa {
    public static void main(String args[]) {
        cadastroDePessoa();
    }

    private static void cadastroDePessoa() {
        String nome;
        String sexo;
        String loop = "Sim";


        Scanner entrada = new Scanner(System.in);
        Map<String, String> pessoas = new HashMap<>();

        while (loop.equalsIgnoreCase("Sim")) {
            System.out.println("***Bem-vindo ao nosso banco de dados. Abaixo, escolha o que deseja fazer***");
            System.out.println("1-Cadastrar");
            System.out.println("2-Mostrar todos registros");
            System.out.println("3-Sair");
            int resp = entrada.nextInt();
            entrada.nextLine();

            if (resp == 1) {
                System.out.println("Digite o nome completo: ");
                nome = entrada.next();
                System.out.println("Agora digite o sexo, sendo M ou F!");
                sexo = entrada.next();

                Pessoa pessoa = new Pessoa(nome, sexo);
                pessoas.put(sexo, nome);
            } else if (resp == 2) {
                if (pessoas.isEmpty()) {
                    System.out.println("Nenhum registro feito atualmente!");
                } else {
                    System.out.println("Registros cadastrados: ");
                    Set<Map.Entry<String, String>> entry = pessoas.entrySet();
                    for (Map.Entry<String, String> e : entry) {
                        System.out.println("Sexo: " + e.getKey() + " Nome: " + e.getValue());
                    }
                }
            } else if (resp == 3) {
                System.out.println("Saindo do programa!");
                break;
            } else {
                System.out.println("Opção não existente. Tente novamente");
            }
            System.out.println("Deseja continuar cadastrando ou consultar algum nome?");
            loop = entrada.next();
        }
    }
}


