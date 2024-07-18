package tarefas_modulos.mod17;

public class Toyota extends Carro{
private String tipo;

    public Toyota(String marca, String modelo, Double anoFabricado,String tipo) {
        super(marca, modelo, anoFabricado);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
