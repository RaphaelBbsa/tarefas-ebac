package Módulos.mod15.abstractFactory;

public abstract class Car {

    private int Cavalos;
    private String gasosa;
    private String cor;


    public Car(int Cavalos, String gasosa, String cor){
        this.Cavalos = Cavalos;
        this.gasosa = gasosa;
        this.cor = cor;
    }

    public void start (){
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + gasosa + " engine has been started. The horse power is "+ Cavalos);

    }

    public void clean (){
        System.out.println("Car has been cleaned.");
    }

    public void mechanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything is good!");
    }

}
