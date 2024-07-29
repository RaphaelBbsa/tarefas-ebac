package Módulos.exemplosSimples;

import java.lang.reflect.Field;

public class Reflection {

    public static void main(String[] args) {
        Carro meuexemplo = new Carro();

        Class<?> classedoCarro = meuexemplo.getClass();

        Field [] camposDaClasse = classedoCarro.getFields();

        for (Field campo: camposDaClasse){
            System.out.println("Campos da classe: " + campo.getName());
        }
        System.out.println(classedoCarro);
    }
}
//tentei pegar o campo do carro e eles não aparecem no console. Isso ocorre pq ele só consegue pegar os campos publicos.
//se for privado, ele não irá mostrar