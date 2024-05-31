package Módulos.mod13.composicao;

public class ContaCorrente {
    private Double saldo;

    private Double chequeEspecial;

    private BancoDoPorto banco;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public BancoDoPorto getBanco() {
        return banco;
    }

    public void setBanco(BancoDoPorto banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                ", chequeEspecial=" + chequeEspecial +
                ", banco=" + banco.getNome() +
                '}';
    }
}
