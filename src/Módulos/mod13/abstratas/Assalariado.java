package Módulos.mod13.abstratas;

public class Assalariado extends Empregado{
    @Override
    public Double vencimento() {
        return salario;
    }

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
