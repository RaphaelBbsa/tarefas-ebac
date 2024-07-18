package Módulos.mod17.ExemploPExplicaroUso;

public class Barco {
    private String nome;

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Barco(String nome) {
        this.nome = nome;
    }
}
