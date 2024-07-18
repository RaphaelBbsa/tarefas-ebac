package Módulos.mod17.ExemploPExplicaroUso;

public class Carro {
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
