package Módulos.mod13.agregacao;

public class Produto {

    private Long codigo;

    private Double preco;

    private String nome;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void vendido(){
        System.out.println("Vendido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void fazerVenda(){

    }

    public void CancelarVenda(){
        System.out.println("Venda cancelada!");
    }
}
