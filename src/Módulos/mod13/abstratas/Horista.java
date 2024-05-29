package Módulos.mod13.abstratas;

public class Horista extends Empregado{
    private Double preçoHora;

    private Double totalHorasTrabalho;



    @Override
    public Double vencimento() {
        return preçoHora*totalHorasTrabalho;
    }

    public Double getPreçoHora() {
        return preçoHora;
    }

    public void setPreçoHora(Double preçoHora) {
        this.preçoHora = preçoHora;
    }

    public Double getTotalHorasTrabalho() {
        return totalHorasTrabalho;
    }

    public void setTotalHorasTrabalho(Double totalHorasTrabalho) {
        this.totalHorasTrabalho = totalHorasTrabalho;
    }
}
