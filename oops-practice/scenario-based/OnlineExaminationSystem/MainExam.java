package scenario_based.OnlineExaminationSystem;
import java.util.*;

public class MainExam {
	
	public static void main(String[] args) {

        // Create Student
        Student s1 = new Student(101, "Rishabh");

        // Create Exam (duration = 60 seconds)
        Exam exam = new Exam("Java Online Test", 60);

        // Create Questions
        Question q1 = new Question(
                "What is JVM?",
                "Java Virtual Machine",
                new Descriptive()
        );

        Question q2 = new Question(
                "Which keyword is used to create an object?",
                "new",
                new Objective()
        );

        // Add questions to exam
        exam.addQuestion(q1);
        exam.addQuestion(q2);

        // Student answers
        List<String> answers = new ArrayList<>();
        answers.add("Java Virtual Machine is used to run Java bytecode in the system"); // Descriptive
        answers.add("new");   // Objective

        // Submit exam and get result
        try {
            int score = exam.submitExam(answers);
            System.out.println("Student Name: " + s1.getName());
            System.out.println("Student ID: " + s1.getId());
            System.out.println("Score: " + score + " out of 2");
        }
        catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }

}
