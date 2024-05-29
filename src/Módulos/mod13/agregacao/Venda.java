package Módulos.mod13.agregacao;

import java.util.HashSet;
import java.util.Set;

public class Venda { //usando uma HashSet pois meus produtos não se repetem!

    private Comprador comprador;

    private Vendedor vendedor;

    private Set<Produto> produtos;

    public Venda(){ //isso aqui é o meu construtor da classe Venda
        this.produtos = new HashSet<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public void add(Produto produto){ //criei o metodo add manualmente para adiconar na minha HashSet
        this.produtos.add(produto);
    }
}
