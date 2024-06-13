package Módulos.mod15.singleton;

public class Demonstracao1 { //note que no singleton mesmo com 3 objetos diferentes, ele retorna o mesmo valor para mim
    //eu só consigo alterar esse valor usando thread

    public static void main(String args []){
        Singleton exemplo1 = Singleton.getInstance();
        Singleton exemplo2 = Singleton.getInstance();
        Singleton exemplo3 = Singleton.getInstance();
        System.out.println(exemplo1);
        System.out.println(exemplo3);
        System.out.println(exemplo2);
    }
}
