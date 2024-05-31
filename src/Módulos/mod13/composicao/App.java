package Módulos.mod13.composicao;

public class App {
    public static void main(String args[]){
        BancoDoPorto bancoInter = new BancoDoPorto();

        bancoInter.setCodigo(10L);
        bancoInter.setNome("Inter");

        ContaCorrente ccRaphaelPorto = new ContaCorrente();

        ccRaphaelPorto.setBanco(bancoInter);
        ccRaphaelPorto.setSaldo(10d);

        bancoInter.adiciona(ccRaphaelPorto);

        System.out.println("Contas no banco Inter:");
        for(ContaCorrente contas : bancoInter.getContasCorrentes()){
            System.out.println(contas); //aa
        }

    }
}
