package tarefas_modulos.mod18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//utilizado para deixar a anotacao disponivel no tempo de execucao
@Target(ElementType.TYPE) //utilizado para se aplicar em classes, interfaces, enums etc

public @interface Tabela {

    String nome ();
}
