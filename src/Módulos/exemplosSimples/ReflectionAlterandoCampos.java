package Módulos.exemplosSimples;

import java.lang.reflect.Field;

public class ReflectionAlterandoCampos {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        try {
            Class<?> classeDoCarro = meuCarro.getClass();

            Field campoCor = classeDoCarro.getField("cor");
            campoCor.set(meuCarro, "Amarelo");

            Field campoVelocidade = classeDoCarro.getField("velocidade");
            campoVelocidade.set(meuCarro, 100);

            System.out.println(meuCarro.getCor());
            System.out.println(meuCarro.getVelocidade());

        } catch (Exception e){
            e.printStackTrace();

        }

    }
}
