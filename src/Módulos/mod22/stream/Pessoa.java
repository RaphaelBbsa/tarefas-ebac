package Módulos.mod22.stream;

import java.util.List;

public class Pessoa {
    private String id;

    private String nome;

    private String nacionalidade;

    private int idade;

    public Pessoa (){

    }

    public Pessoa (String id, String nome, String nacionalidade, int idade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List populaPessoa (){
        Pessoa pessoa1 = new Pessoa("p1","Beatriz","Brasileiro",25);
        Pessoa pessoa2 = new Pessoa("p2","Luan","Belga",30);
        Pessoa pessoa3 = new Pessoa("p3","Rapha","Brasileiro",32);
        Pessoa pessoa4 = new Pessoa("p4","Marco","Belga",18);
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
    };

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}
