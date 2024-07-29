package tarefas_modulos.mod19;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
public @interface Tabela {

    String nome();
}
