package tarefas_modulos.mod12;

import java.util.*;

public class Main_tarefapt1 {
    public static void main(String args[]) {
        List<Pessoa> pessoas = cadastraPessoa();
        ordenarPessoas(pessoas);
        exibirPessoasOrdenadas(pessoas);

    }

    private static void ordenarPessoas(List<Pessoa> pessoas) {
        Collections.sort(pessoas);
    }

    private static void exibirPessoasOrdenadas(List<Pessoa> pessoas) {
        System.out.println("Pessoas ordenadas: ");

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
        }

    }

    private static List<Pessoa> cadastraPessoa() {
        System.out.println("***Vamos cadastrar pessoas e ordena-las em ordem alfabética***");
        String nome;
        String loop = "Sim";

        Scanner entrada = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        while (loop.equalsIgnoreCase("Sim")) {
            System.out.println("***Bem-vindo a tarefa de cadastrar nomes. Vamos começar!***");
            System.out.println("Digite os nomes que deseja cadastrar separados por vírgula: ");
            nome = entrada.nextLine();
            String[] partes = nome.split(",");
            Pessoa pessoa = new Pessoa(nome);
            pessoas.add(pessoa);

            entrada.close();
            Collections.sort(pessoas);
            return (pessoas);
        }

        return (pessoas);
    }
}

