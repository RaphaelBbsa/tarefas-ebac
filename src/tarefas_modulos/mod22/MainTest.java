package tarefas_modulos.mod22;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

        @Test
        public void testFiltrandoJogadoras (){

        //tentei declarar como private, mas não deixa pq não faz sentido eu declarar como private uma variável criada em um método, apenas em classe que isso faz sentido ou interface
         int tamanhoListMulheres = Main.getListaMulheres().size();

            Assert.assertEquals(2, tamanhoListMulheres);



    }
}
