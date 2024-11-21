package Módulos.mod23.EBAC.service;

import Módulos.mod23.EBAC.dao.ClienteDAO;

public class ClienteService {

    private ClienteDAO clienteDAO;


    public ClienteService(ClienteDAO clienteDAOMock){

        clienteDAO = new ClienteDAO();
    }

    public String salvar (){
        clienteDAO.salvar();
        return "Salvo com sucesso.";
    }
}
