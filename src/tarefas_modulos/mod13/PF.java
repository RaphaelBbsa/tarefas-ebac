package tarefas_modulos.mod13;

 public class PF extends Pessoas {

    private String cpf;

    public PF(String nome, String cpf){
        super(nome);
        this.cpf = cpf;

    }

     @Override
     public void exibeDados() {
         System.out.println("Nome: " + nome);
         System.out.println("CPF: "+ cpf);
     }
 }
