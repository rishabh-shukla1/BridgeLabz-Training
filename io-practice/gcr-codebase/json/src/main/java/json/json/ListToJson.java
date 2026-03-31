package json.json;

import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;


class Cars {
    public String brand;
    public int year;

   
    public Cars(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class ListToJson {
    public static void main(String[] args) throws Exception {

       
        List<Cars> c = new ArrayList<>();
        c.add(new Cars("BMW", 2020));
        c.add(new Cars("Audi", 2021));
        c.add(new Cars("Toyota", 2019));

       
        ObjectMapper mapper = new ObjectMapper();

      
        String json = mapper.writeValueAsString(c);

      
        System.out.println(json);
    }
}