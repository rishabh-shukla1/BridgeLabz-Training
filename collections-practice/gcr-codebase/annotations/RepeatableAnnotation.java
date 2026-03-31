package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

class TestClass {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance problem")
    public void process() {
        System.out.println("Processing...");
    }
}

public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {

        Method m = TestClass.class.getMethod("process");

        BugReport[] reports = m.getAnnotationsByType(BugReport.class);

        for (BugReport b : reports) {
            System.out.println("Bug: " + b.description());
        }
    }
}

