package Módulos.mod13.agregacao;

public class Comprador {

    private String nome;

    private Double verba;

    public Comprador(String nome, Double verba) {
        this.nome = nome;
        this.verba= verba;
    }

    public Double getVerba() {
        return verba;
    }

    public void setVerba(Double verba) {
        this.verba = verba;
    }

    public void comprar(){
        System.out.println("Comprar");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
