package multi_threading;

class FileDownloader extends Thread {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + getName() + "] Downloading " + fileName + ": " + i + "%");
            try {
                Thread.sleep((int)(Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DownloadManagerThread {
    public static void main(String[] args) throws InterruptedException {
        FileDownloader f1 = new FileDownloader("Document.pdf");
        FileDownloader f2 = new FileDownloader("Image.jpg");
        FileDownloader f3 = new FileDownloader("Video.mp4");

        f1.start(); f2.start(); f3.start();

        f1.join(); f2.join(); f3.join();
        System.out.println("All downloads complete!");
    }
}

