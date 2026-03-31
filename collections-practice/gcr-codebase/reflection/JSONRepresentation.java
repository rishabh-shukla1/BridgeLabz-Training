package reflection;

import java.lang.reflect.*;

class Students {
    private int id;
    private String name;
    private int age;

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class JSONRepresentation {

    // Method to convert object to JSON
    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        StringBuilder json = new StringBuilder();
        json.append("{");

        for (int i = 0; i < fields.length; i++) {

            Field f = fields[i];
            f.setAccessible(true);

            json.append("\"").append(f.getName()).append("\":");

            Object value = f.get(obj);

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {

        Students s = new Students(101, "Rishabh", 21);

        String json = toJson(s);
        System.out.println(json);
    }
}

