package Módulos.mod18.anotations;
@FirstAnotation(value = "Rodrigo", bairros = "Teste", Numeros = 10)
public class ClassWithAnotattion {
    @FirstAnotation(value ="Teste", bairros = "Testes", Numeros = 100)
    private String nome;

    @FirstAnotation(value = "Esse aqui  é p construtor", bairros = "Veja", Numeros = 20)
    public ClassWithAnotattion(){

    }
}
