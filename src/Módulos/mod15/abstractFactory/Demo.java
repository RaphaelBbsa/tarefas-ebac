package Módulos.mod15.abstractFactory;

public class Demo {

    public static void main(String [] args){
        Cliente cliente = new Cliente ("A",false);
        Factory fabrica = getFactory(cliente);
        Car carro1 = fabrica.create(cliente.getGradeRequest());
        carro1.start();


    }

    private static Factory getFactory(Cliente cliente) {
        if (cliente.hasCompanyContract()){
            return new ContratosFactory();
        }
        return new SemContrato();
    }
}
