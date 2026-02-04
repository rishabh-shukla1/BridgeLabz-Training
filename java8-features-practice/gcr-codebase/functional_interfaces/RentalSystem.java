package functional_interfaces;

interface Vehicle {
    void rent();
    void returnVehicle();
}

class Car implements Vehicle {
	
	@Override
    public void rent() {
        System.out.println("Car rented");
    }
	
	@Override
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

class Bike implements Vehicle {
	
	@Override
    public void rent() {
        System.out.println("Bike rented");
    }
	@Override
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

class Bus implements Vehicle {
	
	@Override
    public void rent() {
        System.out.println("Bus rented");
    }
	
	@Override
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.rent();
        v2.rent();
    }
}
