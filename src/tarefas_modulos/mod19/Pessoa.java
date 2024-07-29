package tarefas_modulos.mod19;

import tarefas_modulos.mod19.Tabela;

@Tabela(nome = "tabela_pessoas")
public class Pessoa {

    private String nome;
    private Long idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }
}
