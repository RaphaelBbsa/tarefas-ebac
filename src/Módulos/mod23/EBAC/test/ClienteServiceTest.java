package Módulos.mod23.EBAC.test;

import Módulos.mod23.EBAC.dao.ClienteDAO;
import Módulos.mod23.EBAC.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ClienteServiceTest {
    @Test
    public void salvarTest() {
        // Criando o mock de ClienteDAO com Mockito
        ClienteDAO clienteDAOMock = Mockito.mock(ClienteDAO.class);

        // Configurando o mock para que o método salvar retorne "Sucesso"
        Mockito.when(clienteDAOMock.salvar()).thenReturn("Sucesso");

        // Usando o mock no serviço
        ClienteService service = new ClienteService(clienteDAOMock);
        String retorno = service.salvar();

        // Verificando se o retorno é "Sucesso"
        Assert.assertEquals("Sucesso", retorno);

        // Verificando se o método salvar foi chamado
        Mockito.verify(clienteDAOMock, Mockito.times(1)).salvar();
    }
}
