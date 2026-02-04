package functional_interfaces;

public class BackgroundJob {
    public static void main(String[] args) {

        Runnable job1 = () -> {
            System.out.println("Job 1: Sending emails");
        };

        Runnable job2 = () -> {
            System.out.println("Job 2: Generating reports");
        };

        Runnable job3 =()->{
        	 System.out.println("Job 3: Clean database");
        };

        // Run asynchronously
        new Thread(job1).start();
        new Thread(job2).start();
        new Thread(job3).start();
    }
}

