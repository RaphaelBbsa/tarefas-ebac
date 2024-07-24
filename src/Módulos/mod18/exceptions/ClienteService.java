package Módulos.mod18.exceptions;

public class ClienteService {

    public  void consultarCliente (String codigo) throws ClienteNaoEncontradoException {

        boolean isCadastrado = false;

        if(!isCadastrado){
            throw new ClienteNaoEncontradoException("Cliente não encontrado.");
        }
    }
}
//Comparando usar o try catch e não usar. --> Sem try-catch: A exceção é propagada para o chamador do método e deve ser tratada em algum ponto superior da pilha de chamadas ou a aplicação pode falhar.
//
//Com try-catch: A exceção é tratada imediatamente no ponto onde o método é chamado, permitindo que o programa continue executando mesmo que ocorra um erro.