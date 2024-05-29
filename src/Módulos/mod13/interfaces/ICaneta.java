package Módulos.mod13.interfaces;

public interface ICaneta {
    public void escrever(String texto);

    public String getCor();

    default void escreverComumATodas(){
        System.out.println("Teste do default");
    }
}
