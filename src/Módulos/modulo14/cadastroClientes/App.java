package Módulos.modulo14.cadastroClientes;

import Módulos.modulo14.cadastroClientes.dao.ClienteMapDAO;
import Módulos.modulo14.cadastroClientes.dao.IClienteDAO;
import Módulos.modulo14.cadastroClientes.domain.Cliente;

import javax.swing.*;

public class App {

  //fazendo esse processo aqui debaixo, eu declaro uma variável que pode armazenar qualquer objeto que implementa minha interface IClienteDAO
    private static IClienteDAO iClienteDAO; //o iClienteDAO é uma variável que armazena objetos de uma classe que implementa minha interface IClienteDAO, no caso vai ser o ClienteMapDAO.

    public static void main(String args[]){
        iClienteDAO= new ClienteMapDAO();

        String inicio = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para excluir, 4 para alterar ou 5 para sair.",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);//o null significa que não estamos especificando onde a janela vai aparecer, logo ela aparece no meio. o INFORMATION_MESSAGE da um ícone de informação pra deixar mais bonitinho

        while(isOpcaoValida(inicio)){
            
            if(isOpcaoSair(inicio)){
                sair();
            } else if (isOpcaoCadastro(inicio)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula, por exemplo: Nome, CPF, Telefone...","Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            }else if (isOpcaoConsulta(inicio)){
                String dados = JOptionPane.showInputDialog(null,"Digite o CPF do cliente!", "Consulta Cliente",JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isOpcaoExcluir(inicio)) {
                String dados = JOptionPane.showInputDialog(null,"Digite o CPF que deseja excluir!","Consulta cliente",JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            }else {
                String dados = JOptionPane.showInputDialog(null,"Digite os dados do cliente separados por vírgula, conforme o exemplo: Nome, CPF, Telefone....",
                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }
        }
        
    }

    private static void atualizar(String dados) {
        String [] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
    iClienteDAO.excluir(Long.parseLong(dados));
    JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isOpcaoExcluir(String inicio) {
        if("3".equals(inicio)){
            return true;
        }
        return false;
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if(cliente != null){
            JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Cliente inexistente", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoConsulta(String inicio) {
        if("2".equals(inicio)){
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String [] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if(isCadastrado){
            JOptionPane.showMessageDialog(null,"Cliente cadastro com sucesso!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Este cliente já se encontra cadastrado!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Você saiu do programa. Até logo!","Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }

    private static boolean isOpcaoSair(String inicio) {
        if("5".equals(inicio)){
            return true;
        }
        return false;
    }


    private static boolean isOpcaoValida(String inicio){
            if ("1".equals(inicio) || "2".equals(inicio)||"3".equals(inicio)||"4".equals(inicio) || "5".equals(inicio)){
                return true;
            }
            return false;
        }

    private static boolean isOpcaoCadastro(String inicio) {
        if ("1".equals(inicio)){
            return true;
        }
        return false;
    }
}

    

    
