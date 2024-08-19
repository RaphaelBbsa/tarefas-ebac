package tarefas_modulos.mod22;

public class Atletas {
    private String nome;

    private String Modalidade;

    private String sexo;

    private String Nacionalidade;

    public Atletas (String nome, String Modadalidade, String sexo, String Nacionalidade){
        this.nome = nome;
        this.Modalidade = Modadalidade;
        this.sexo = sexo;
        this.Nacionalidade = Nacionalidade;
    }

    public String getModalidade() {
        return Modalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    @Override
    public String toString() {
        return "Atletas{" +
                "nome='" + nome + '\'' +
                ", Modalidade='" + Modalidade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", Nacionalidade='" + Nacionalidade + '\'' +
                '}';
    }
}
