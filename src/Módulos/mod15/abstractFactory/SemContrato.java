package Módulos.mod15.abstractFactory;

public class SemContrato extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Corolla(180, "cheio", "cinza espacial");

            case "B":
                return new Volvo(150, "cheio", "cheio");
            default:
                System.out.println("A opção seleciona não existe.");
                return null;
        }
    }
}
