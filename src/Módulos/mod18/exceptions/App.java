package Módulos.mod18.exceptions;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        ClienteService service = new ClienteService();
        String opcao = JOptionPane.showInputDialog(null,"Digite o código do cliente: ","Busca",JOptionPane.INFORMATION_MESSAGE);

        try{
            service.consultarCliente(opcao);
        }catch (ClienteNaoEncontradoException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Não encontrado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

//O método printStackTrace é uma ferramenta essencial para depuração em Java, pois fornece uma visão detalhada de onde e como as exceções ocorrem em um programa.
// Ele ajuda os desenvolvedores a entender melhor o fluxo de execução e a identificar pontos problemáticos no código.
