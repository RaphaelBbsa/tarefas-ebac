package Módulos.mod15.factoryqDefatoEntendi;

public class CarroLuxoFactory extends CarroFactory{
    @Override
    public Roda montarRoda() {
        return new RodaLigaLeve();
    }

    @Override
    public Som montarSom() {
        return new CDplayer();
    }
}
