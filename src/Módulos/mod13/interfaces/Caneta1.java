package Módulos.mod13.interfaces;

public class Caneta1 implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName()); //getsimplename pega o nome da classe
    }

    @Override
    public String getCor() {
        return "Preta";
    }
}
