package Módulos.mod13.agregacao;

public class Sistema { //eu dou o return vendedor e return produto para eles nao ficarem privados somenta na minha função, podendo manipular e reutilizar os objetos criados
    //Isso facilita a organização, manutenção e permite que eu use as instâncias criadas de maneira eficiente no programa.

    public static void main(String args[]){
        Produto produto1 = criarProduto(1921L,"Miçanga",199.99d);
        Produto produto2 = criarProduto(1223L,"Óculos", 78.99d);


        Vendedor jobson = criarVendedor("Jobson Soares", 0.1d);
        Vendedor raphael = criarVendedor("Raphael Porto", 0.1d);

        Comprador compradorAleatorio = criarComprador("Não identificado", 1899d);

        Venda venda = new Venda();
        venda.setVendedor(raphael);
        venda.setComprador(compradorAleatorio);
        venda.add(produto1);
        venda.add(produto2);

        venda.concretizarVenda();




        
    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador(nome, verba); //aqui eu faço com o construtor lá na minha classe, tornando isso mais fácil
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, String nome, Double preco) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setPreco(preco);
        return produto;
    }
}
