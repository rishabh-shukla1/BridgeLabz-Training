package streambuzz;

import java.util.*;

public class CreatorStats {

    public String creatorName;
    public double[] weeklyLikes;

    // Engagement board (static list)
    public static List<CreatorStats> EngagementBoard = new ArrayList<>();

    // Constructor
    public CreatorStats(String creatorName, double[] weeklyLikes) {
        this.creatorName = creatorName;
        this.weeklyLikes = weeklyLikes;
    }
}
