package multi_threading;

class PrintJob implements Runnable {
    private String jobName;
    private int pages;

    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    @Override
    public void run() {
        for (int i = 1; i <= pages; i++) {
            System.out.println("Printing " + jobName +
                    " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintShop {
    public static void main(String[] args) throws InterruptedException {
        Thread[] jobs = {
                new Thread(new PrintJob("Job1", 10)),
                new Thread(new PrintJob("Job2", 5)),
                new Thread(new PrintJob("Job3", 15)),
                new Thread(new PrintJob("Job4", 8)),
                new Thread(new PrintJob("Job5", 12))
        };

        long start = System.currentTimeMillis();
        for (Thread t : jobs) t.start();
        for (Thread t : jobs) t.join();

        System.out.println("All jobs completed in " +
                (System.currentTimeMillis() - start) + "ms");
    }
}

