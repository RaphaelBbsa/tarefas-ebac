package Módulos.mod20.exemplosLambda;

public class ReferenciaMetodos {
    public static void main(String[] args) {
        MyConsumer myEvent1 = s -> System.out.println(s);
        myEvent1.consumer("Teste 1");

        MyConsumer myevent2 = new MyConsumer() {
            @Override
            public void consumer(Object valor) {
                System.out.println(valor);
            }
        };
//mostrando diferentes formas de implementar a lambda
        MyConsumer myevent3 = (s) -> {
            System.out.println(s);
        };

        myevent2.consumer("Teste 2");
    }
}
