package functional_interfaces;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
	
	
	@Override
    public void turnOff() {
        System.out.println("Light OFF");
    }

	@Override
	public void turnOn() {
		
		System.out.println("Light ON");
		
	}
}

class AC implements SmartDevice {
	@Override
    public void turnOn() {
        System.out.println("AC ON");
    }
	@Override
    public void turnOff() {
        System.out.println("AC OFF");
    }
}

class TV implements SmartDevice {
	
	@Override
    public void turnOn() {
        System.out.println("TV ON");
    }
	
	@Override
    public void turnOff() {
        System.out.println("TV OFF");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();
        SmartDevice d3 = new TV();

        d1.turnOn();
        d2.turnOn();
        d3.turnOn();
    }
}

