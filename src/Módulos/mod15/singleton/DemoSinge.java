package Módulos.mod15.singleton;

public class DemoSinge {

    public static void main(String args []){
        SingetlonPropriedade exemplo1 = SingetlonPropriedade.getInstance("TESTE");
        SingetlonPropriedade exemplo2 = SingetlonPropriedade.getInstance("TESTE1");

        System.out.println(exemplo1.getValor());


    }
}
