package streambuzz;
import java.util.*;

public class MainStreamBuzz {
	

    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

 
    public Map<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {

        Map<String, Integer> result = new HashMap<>();

        for (CreatorStats cs : records) {
            int count = 0;
            for (double likes : cs.weeklyLikes) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(cs.creatorName, count);
            }
        }

        return result;
    }

    // Calculate average likes
    public double CalculateAverageLikes() {

        double total = 0;
        int count = 0;

        for (CreatorStats cs : CreatorStats.EngagementBoard) {
            for (double likes : cs.weeklyLikes) {
                total += likes;
                count++;
            }
        }

        if (count == 0) return 0;
        return total / count;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MainStreamBuzz obj = new MainStreamBuzz();

        while (true) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {

                System.out.println("Enter Creator Name:");
                String name = sc.nextLine();

                double[] likes = new double[4];
                System.out.println("Enter weekly likes (Week 1 to 4):");
                for (int i = 0; i < 4; i++) {
                    likes[i] = sc.nextDouble();
                }
                sc.nextLine();

                CreatorStats cs = new CreatorStats(name, likes);
                obj.RegisterCreator(cs);

                System.out.println("Creator registered successfully\n");

            } 
            else if (choice == 2) {

                System.out.println("Enter like threshold:");
                double threshold = sc.nextDouble();
                sc.nextLine();

                Map<String, Integer> result =
                        obj.GetTopPostCounts(CreatorStats.EngagementBoard, threshold);

                if (result.isEmpty()) {
                    System.out.println("No top-performing posts this week\n");
                } else {
                    for (Map.Entry<String, Integer> entry : result.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    System.out.println();
                }

            } 
            else if (choice == 3) {

                double avg = obj.CalculateAverageLikes();
                System.out.println("Overall average weekly likes: " + (int)avg + "\n");

            } 
            else if (choice == 4) {

                System.out.println("Logging off - Keep Creating with StreamBuzz!");
                break; 

            } 
            else {
                System.out.println("Invalid choice\n");
            }
        }

        sc.close();
    }

}
