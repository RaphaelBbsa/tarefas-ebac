package Módulos.mod13.composicao;
import java.util.HashSet;
import java.util.Set;

public class BancoDoPorto {
    private Set<ContaCorrente> contasCorrentes;

    public Set<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    }

    public void setContasCorrentes(Set<ContaCorrente> contasCorrentes) {
        this.contasCorrentes = contasCorrentes;
    }

    public Set<ContaPoupanca> getContaPoupancas() {
        return contaPoupancas;
    }

    public void setContaPoupancas(Set<ContaPoupanca> contaPoupancas) {
        this.contaPoupancas = contaPoupancas;
    }

    private Set<ContaPoupanca> contaPoupancas;

    private Long codigo;

    private String nome;

    public BancoDoPorto() {
        this.contasCorrentes= new HashSet<>();
        this.contaPoupancas = new HashSet<>();

    }
    public void adiciona(ContaCorrente cc){
        this.contasCorrentes.add(cc);
    }
    public void adiciona(ContaPoupanca cp){
        this.contaPoupancas.add(cp);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "BancoDoPorto{" +
                "contasCorrentes=" + contasCorrentes +
                ", contaPoupancas=" + contaPoupancas +
                ", codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
