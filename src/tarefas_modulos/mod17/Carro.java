package tarefas_modulos.mod17;

public abstract class Carro {

    private String modelo;
    private String marca;
    private Double anoFabricado;


    public Carro (String marca, String modelo, Double anoFabricado){
        this.marca = marca;
        this.anoFabricado = anoFabricado;
        this.modelo = modelo;
    }

    public void exibirCarro (){
        System.out.println("Carro da concessionária: " + marca + " , modelo: " + modelo + " , "+ anoFabricado);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Double getAnoFabricado() {
        return anoFabricado;
    }
}
