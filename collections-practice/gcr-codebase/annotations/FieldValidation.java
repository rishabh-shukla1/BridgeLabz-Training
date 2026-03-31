package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength max = field.getAnnotation(MaxLength.class);

            if (max != null && value.length() > max.value()) {
                throw new IllegalArgumentException(
                    "Username length must be <= " + max.value()
                );
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

public class FieldValidation {
    public static void main(String[] args) {

        User u1 = new User("rishabh");          
        User u2 = new User("this_is_too_long"); 
    }
}
