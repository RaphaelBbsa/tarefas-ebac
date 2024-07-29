package tarefas_modulos.mod19;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa ();

        Class <?> classePessoa = pessoa.getClass();

        if (classePessoa.isAnnotationPresent(Tabela.class)) {
            // Obter a instância da anotação Tabela
            Tabela tabelaAnnotation = classePessoa.getAnnotation(Tabela.class);

            // Imprimir o nome da tabela
            System.out.println("Nome da tabela: " + tabelaAnnotation.nome());
        } else {
            System.out.println("A anotação Tabela não está presente na classe Pessoa.");
        }
    }
}
