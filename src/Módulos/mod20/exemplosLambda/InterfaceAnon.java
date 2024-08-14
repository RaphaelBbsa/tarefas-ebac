package Módulos.mod20.exemplosLambda;

public class InterfaceAnon {
//aqui estamos tratando de interfaces anonimas. Pelo o que entendi, isso é quando instaciamos uma interface.
    //também é uma maneira de implementar a interface sem ter que criar uma classe que implementa ela

    public static void main(String[] args) {
        MyConsumer anonima = new MyConsumer() {
            @Override
            public void consumer(Object valor) {
                System.out.println(valor);
            }

        };
        anonima.consumer("TESTE****");

        MyConsumer anonimaLambda = (Object valor ) -> {
            System.out.println(valor);
        };
        anonimaLambda.consumer("Olaaa");
        recebeInterface((Object valor) -> System.out.println(valor));

    }
    private static void recebeInterface(MyConsumer a){
        a.consumer(" 12");
    }

}
