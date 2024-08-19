package Módulos.mod22.stream;

import java.util.List;

public class AllMatch { //allMatch vai verificar se todos os itens atedem a lógica que eu criei, retorna true ou false
    public static void main(String[] args) {

        List<Pessoa> lista= new Pessoa().populaPessoa();

      boolean resultado =  lista.stream()
              .allMatch(pessoa-> pessoa.getNacionalidade().equals("Americano"));

      Boolean re = true;

      for(Pessoa p : lista){
          if(!p.getNacionalidade().equals("Brasileiro")) {
              re = false;
              break;
          }
      }

        System.out.println(resultado); //veja que deu false, pois nao existe americano no meu grupo


    }
}
