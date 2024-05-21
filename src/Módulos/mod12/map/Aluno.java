package Módulos.mod12.map;
import java.util.Objects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private String curso;

    //Abaixo segue o construtor que serve para inicializar os atributos em uma única linha e ai eu não preciso chamar o método set.
    public Aluno(String nome, String curso){
        this.nome = nome;
        this.curso= curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    @Override
    public int compareTo(Aluno o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(curso, aluno.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curso);
    }
}

