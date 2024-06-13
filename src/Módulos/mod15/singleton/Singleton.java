package Módulos.mod15.singleton;

public class Singleton {

    private static Singleton exemplo;

    private Singleton (){

    }

    public static Singleton getInstance(){
        if (exemplo == null){
            exemplo = new Singleton();
        }
        System.out.println("AAA" + exemplo);
        return exemplo;
    }


}
