package Módulos.mod15.abstractFactory;

    public abstract class Factory {

        public Car create (String requestedGrade){
            Car car = retrieveCar(requestedGrade);
            car = prepareCar(car);
            return car;
        }

        private Car prepareCar (Car car){
            car.clean();
            car.mechanicCheck();
            return car;
        }
        abstract Car retrieveCar(String requestedGrade);
    }


