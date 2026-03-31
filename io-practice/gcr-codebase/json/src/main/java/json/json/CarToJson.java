package json.json;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String brand;
    public int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class CarToJson {
	
	 public static void main(String[] args) throws Exception {
		 
		 Car c=new Car("Toyota",2016);
		 
		 ObjectMapper o=new ObjectMapper();
		 
		 String json=o.writeValueAsString(c);
		 
		 System.out.println(json);
		 
	 }

}
