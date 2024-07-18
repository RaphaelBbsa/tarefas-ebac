package tarefas_modulos.mod17;

public class Honda extends Carro{
    private String tipo;
    public Honda(String marca, String modelo, Double anoFabricado, String tipo){
       super("Honda", modelo, anoFabricado);
       this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
