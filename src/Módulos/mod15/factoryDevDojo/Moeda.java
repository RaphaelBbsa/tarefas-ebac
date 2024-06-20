package Módulos.mod15.factoryDevDojo;

public interface Moeda {
    String getSymbol();
}

class Real implements Moeda{
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class Dollar implements Moeda{
    @Override
    public String getSymbol() {
        return "$";
    }
}