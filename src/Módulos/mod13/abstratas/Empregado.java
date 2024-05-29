package Módulos.mod13.abstratas;

public abstract class Empregado { //coloco o abstract pq empregado é uma classe pai
    private String nome;

    private String cpf;

    private String sobrenome;

    public abstract Double vencimento ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
