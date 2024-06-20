package Módulos.mod15.factoryqDefatoEntendi;

public class CarroPopularFactory extends CarroFactory{
    @Override
    public Roda montarRoda() {
        return new RodaSimples();
    }

    @Override
    public Som montarSom() {
        return new TocaFitas();
    }
}
