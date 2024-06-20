package Módulos.mod15.factoryDevDojo;

public class CurrencyFactory {
    public static Moeda newCurrency(Country country){
        switch (country){
            case USA:
                return new Dollar();
            case BRAZIL:
                return new Real();

            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
