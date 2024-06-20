package Módulos.mod15.factoryDevDojo;

public class MoedaFactoryTeste {
    public static void main(String [] args){
        Moeda moeda = CurrencyFactory.newCurrency(Country.BRAZIL);

        System.out.println(moeda.getSymbol());
    }
}
