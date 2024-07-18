package Módulos.mod17.ExemploPExplicaroUso.service;

import Módulos.mod17.ExemploPExplicaroUso.Barco;
import Módulos.mod17.ExemploPExplicaroUso.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main (String [] args){

        criarArrayComObjeto(new Barco("Lancha grande"));
    }
    private static <T> void criarArrayComObjeto (T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}



