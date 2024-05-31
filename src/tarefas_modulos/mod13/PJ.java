package tarefas_modulos.mod13;

public class PJ extends Pessoas {
    private String cnpj;

    public PJ(String nome, String cnpj) {
        super(nome); //a classe pessoas é a superclasse de PJ e PF. Quando eu for usar um parâmetro que seja
        this.cnpj = cnpj;
        //pertecente a classe pai, eu devo usar esse super e colocar dentro o parâmetro}
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
    }
}
