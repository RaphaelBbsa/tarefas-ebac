package tarefas_modulos.mod13;

public abstract class Pessoas {
    String nome;

    public Pessoas(String nome){
        this.nome = nome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void exibeDados ();{

    }
}
