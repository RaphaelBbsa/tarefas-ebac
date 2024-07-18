package tarefas_modulos.mod17;

public class Chevrolet extends Carro{
    private String tipo;

    public Chevrolet (String marca, String modelo, Double anoFabricado, String tipo){
        super("Chevrolet", modelo, anoFabricado);
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;
    }
}
