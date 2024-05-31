package tarefas_modulos.mod13;

import java.util.ArrayList;

public class Programa {
    public static void main(String args[]){

        ArrayList<PF> pessoasFisicas = new ArrayList<>();
        pessoasFisicas.add(new PF("Raphael Porto", "123.421.123-60"));
        pessoasFisicas.add(new PF("Borges", "123.421.112-10"));
        pessoasFisicas.add(new PF("Digão Millenium", "123.109.123-02"));

        for(PF pf : pessoasFisicas){
            pf.exibeDados();
        }

        ArrayList<PJ> pessoasJuridicas = new ArrayList<>();
        pessoasJuridicas.add(new PJ("Luan Abreu", "12321232132/213-00"));
        pessoasJuridicas.add(new PJ("Narciso Costa", "12321232132/213-00"));

        for (PJ pj: pessoasJuridicas){
            pj.exibeDados();
        }
    }
}
