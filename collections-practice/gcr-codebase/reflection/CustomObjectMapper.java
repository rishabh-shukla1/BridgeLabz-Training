package reflection;

import java.lang.reflect.*;
import java.util.*;

class ObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {

            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);

            field.set(obj, fieldValue);
        }

        return obj;
    }
}

class Student {
    private int id;
    private String name;

    public void display() {
        System.out.println(id + " " + name);
    }
}

public class CustomObjectMapper {

    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("id", 102);
        map.put("name", "Rishabh");

        Student s = ObjectMapper.toObject(Student.class, map);
        s.display();
    }
}
