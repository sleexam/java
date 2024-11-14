interface Vehicle {
    void start();

    static void showType() {
        System.out.println("This is a Vehicle");
    }
}

abstract class Engine {
    abstract void fuelType();

    void engineInfo() {
        System.out.println("This engine is standard");
    }
}

class Car extends Engine implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    void fuelType() {
        System.out.println("Car uses petrol");
    }
}

public class abstractandinterface {
    public static void main(String[] args) {
        Vehicle.showType();

        Car myCar = new Car();
        myCar.start();
        myCar.fuelType();
        myCar.engineInfo();

        System.out.println("Program finished");
    }
}
