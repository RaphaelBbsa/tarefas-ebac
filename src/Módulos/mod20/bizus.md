Alguns bizus para relembrar depois.

Um método default em Java é um método que pode ser definido em uma interface com a keyword default. Isso permite que a interface forneça uma implementação padrão para o método. Dessa forma, se uma classe que implementa a interface não fornecer a sua própria implementação para o método, a implementação padrão fornecida pela interface será usada.

Aqui está um exemplo de como declarar um método default em uma interface:

public interface MyInterface {
default void metodoDefault() {
System.out.println("Este é um método default.");
}

    void metodoAbstrato();
}

E aqui está como uma classe pode implementar esta interface:

public class MyClass implements MyInterface {
// Se não fornecermos uma implementação para metodoDefault,
// a implementação padrão será utilizada.

    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato.");
    }
}


Neste caso, MyClass herda a implementação padrão de metodoDefault da interface MyInterface, mas precisa fornecer uma implementação para metodoAbstrato, pois este é abstrato.

default Consumer<T> andThen(Consumer<? super T> after) {
Objects.requireNonNull(after);
return (T t) -> {
accept(t);
after.accept(t);
};
}
}

    accept(T t): Método abstrato que realiza a operação em um argumento do tipo T.
    andThen(Consumer<? super T> after): Método default que combina dois Consumers.

Parâmetro Consumer<? super T> after

O parâmetro after é do tipo Consumer<? super T>, que significa que ele pode ser qualquer Consumer que aceite um tipo T ou um supertipo de T.

import java.util.function.BiFunction;

public class BiFunctionExample {
public static void main(String[] args) {
BiFunction<Double, Double, String> doubleToString = (a, b) -> "A: " + a + ", B: " + b;
String result = doubleToString.apply(5.5, 3.3);
System.out.println(result); // Output: A: 5.5, B: 3.3
}
}

Neste exemplo, a conversão de Double para String acontece implicitamente durante a concatenação. Aqui está o detalhamento do processo:

Concatenação de Strings: A expressão lambda (a, b) -> "A: " + a + ", B: " + b utiliza o operador + para concatenar a string "A: " com o valor a e depois com a string ", B: " e o valor b.

Conversão Implícita: Quando você concatena um valor Double com uma String usando o operador +, o Double é automaticamente convertido para String. Isso é feito pelo método toString() da classe Double.