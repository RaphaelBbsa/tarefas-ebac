package Módulos.mod12.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaDeAula {
    public static void main(String args[]){
        Map<Integer, List<Aluno>> listaDaSala = new HashMap<>();
        List <Aluno> alunosSala1 = criarTurma("Sala 1", 10);
        List <Aluno> alunosSala2 = criarTurma("Sala 2", 20);
        listaDaSala.put(1, alunosSala1);
        listaDaSala.put(2, alunosSala2);

        for(Aluno aluno: alunosSala1){
            System.out.println(aluno);
        }
    }

    private static List<Aluno> criarTurma(String sala, int count) {
        List<Aluno> alunos = new ArrayList<>();
        for(int i = 0; i < count; i++){
            Aluno aluno = new Aluno("Aluno" + i, "Curso 1" + sala);
            alunos.add(aluno);
        }
        return alunos;
    }
}
