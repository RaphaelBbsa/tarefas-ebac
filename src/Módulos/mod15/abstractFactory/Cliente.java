package Módulos.mod15.abstractFactory;

public class Cliente {

    private String gradeRequest;
    private boolean hasCompanyContract;

    public Cliente(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean hasCompanyContract (){
        return hasCompanyContract;
    }

    public String getGradeRequest(){
        return gradeRequest;
    }
}
