package annotations;
import java.lang.annotation.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class Users {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    private String password; 

    public Users(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }
}

class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);

                JsonField jf = field.getAnnotation(JsonField.class);

                try {
                    Object value = field.get(obj);
                    json.append("\"")
                        .append(jf.name())
                        .append("\":\"")
                        .append(value)
                        .append("\",");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

  
        if (json.charAt(json.length() - 1) == ',') {
            json.deleteCharAt(json.length() - 1);
        }

        json.append("}");
        return json.toString();
    }
}

public class SerializationAnnotation{
    public static void main(String[] args) {

        Users user = new Users("rishabh", 22, "secret123");

        String json = JsonSerializer.toJson(user);

        System.out.println(json);
    }
}
