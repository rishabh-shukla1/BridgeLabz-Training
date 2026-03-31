package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}


class UserContext 
{
    static String currentRole = "USER";
}

class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    @RoleAllowed("ADMIN")
    public void viewAllUsers() {
        System.out.println("All users displayed.");
    }

    public void normalTask() {
        System.out.println("Normal task executed.");
    }
}

public class RoleAllowedAnnotation {
    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();
        Method[] methods = AdminService.class.getDeclaredMethods();

        for (Method m : methods) {

            if (m.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed role = m.getAnnotation(RoleAllowed.class);

                if (UserContext.currentRole.equals(role.value()))
                {
                    m.invoke(service);
                } 
                else 
                {
                    System.out.println("Access Denied! Cannot execute: " + m.getName());
                    
                }

            } 
            else {
               
                m.invoke(service);
            }
        }
    }
}
