package functional_interfaces;

interface Vehicles {
    void displaySpeed();


    default void displayBattery() {
        System.out.println("Battery: Not applicable");
    }
}

class Cars implements Vehicles {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}

class ElectricCar implements Vehicles {
    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }

 
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicles v1 = new Cars();
        Vehicles v2 = new ElectricCar();

        v1.displaySpeed();
        v1.displayBattery();

        v2.displaySpeed();
        v2.displayBattery();
    }
}
