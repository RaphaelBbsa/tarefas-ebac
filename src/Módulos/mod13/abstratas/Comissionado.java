package Módulos.mod13.abstratas;

public class Comissionado extends Empregado{
    @Override
    public Double vencimento() {
        return totalDeVendas*totalComissao;
    }

    private Double totalDeVendas;
    private Double totalComissao;

}
