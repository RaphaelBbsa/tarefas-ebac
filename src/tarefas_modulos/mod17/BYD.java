package tarefas_modulos.mod17;

public class BYD extends Carro{

    private String tipo;

    public BYD(String marca, String modelo, Double anoFabricado, String tipo) {
        super("BYD", modelo, anoFabricado);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
