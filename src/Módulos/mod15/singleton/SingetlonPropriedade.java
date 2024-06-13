package Módulos.mod15.singleton;

public class SingetlonPropriedade {

    private static SingetlonPropriedade exemplo;

    private String valor;

    private SingetlonPropriedade(String valor){

        this.valor = valor;
    }

    public static SingetlonPropriedade getInstance(String valor){
        if (exemplo == null){
            exemplo = new SingetlonPropriedade(valor);
        }
        System.out.println("AAA" + exemplo);
        return exemplo;
    }

    public String getValor() {
        return valor;
    }
}
