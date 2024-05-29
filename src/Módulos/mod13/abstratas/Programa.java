package Módulos.mod13.abstratas;

public class Programa {
    //vou colocar só o exemplo do assalariado

    public  static void main(String args[]) {
        Assalariado empregado = new Assalariado(); //coloquei a classe assalariado e não a abstrata empregado, pois na hora de colocar o salário pela classe empregado, eu não terei acesso ao SetSalario
        empregado.setCpf("123");
        empregado.setNome("Raphael");
        empregado.setSalario(154d);
        System.out.println(empregado.getNome() + " tem salário de " + empregado.vencimento());

        Horista horista = new Horista();
        horista.setCpf("12");
        horista.setNome("Teste");
        horista.setPreçoHora(100d);
        horista.setTotalHorasTrabalho(12d);
        imprimir(horista); //note que eu criei um método que tem como parametro empregado, so que como horista é herdeiro de empregado, eu consigo utlizar nele tb


    }

    public static void imprimir(Empregado empregado){
        System.out.println(empregado.getNome() + " tem salário " + empregado.vencimento());
    }
}
