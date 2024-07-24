package Módulos.mod18.anotations;


import java.lang.annotation.*;

/*
A anotação @Retention define por quanto tempo a anotação estará disponível.
Valor RetentionPolicy.RUNTIME: A anotação estará disponível em tempo de execução. Isso significa que você pode acessar a anotação usando reflexão durante a execução do programa.
SOURCE: A anotação é descartada pelo compilador e não é incluída no bytecode.
CLASS: A anotação é armazenada no bytecode, mas não está disponível em tempo de execução.
    Descrição: A anotação @Target especifica os tipos de elementos aos quais a anotação pode ser aplicada.
    Valor ElementType.FIELD: A anotação pode ser aplicada apenas a campos (variáveis de instância) de uma classe.

Outros valores possíveis para ElementType incluem:

    TYPE: Classes, interfaces (incluindo anotações) ou enums.
    METHOD: Métodos.
    PARAMETER: Parâmetros de método.
    CONSTRUCTOR: Construtores.
    LOCAL_VARIABLE: Variáveis locais.
    ANNOTATION_TYPE: Outras anotações.
    PACKAGE: Pacotes.
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface FirstAnotation {

    String value(); //esses "Métodos" não sao de fato metodos. Sao membros da anotação que recebem seu valor na classe por exemplo.

    String [] bairros();

    long Numeros ();

}
