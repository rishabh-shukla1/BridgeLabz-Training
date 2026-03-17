package scenario_based;

import java.util.*;
import java.util.regex.*;

public class DynamicTemplateProcessor {

    public static String processLine(String line) {

        Pattern pattern = Pattern.compile("\\$\\{(.*?)\\}");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {

            String placeholder = matcher.group(1);
            String[] parts = placeholder.split(":");

            String result = "INVALID";

            if (parts[0].equals("UPPER")) {

                result = parts[1].toUpperCase();
            }

            else if (parts[0].equals("LOWER")) {

                result = parts[1].toLowerCase();
            }

            else if (parts[0].equals("REPEAT")) {

                String[] data = parts[1].split(",");
                String word = data[0];
                int count = Integer.parseInt(data[1]);

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < count; i++)
                    sb.append(word);

                result = sb.toString();
            }

            else if (parts[0].equals("DATE")) {

                try {

                    String[] date = parts[1].split("-");

                    int dd = Integer.parseInt(date[0]);
                    int mm = Integer.parseInt(date[1]);
                    int yy = Integer.parseInt(date[2]);

                    if (dd > 31 || mm > 12)
                        result = "INVALID";
                    else
                        result = yy + "/" +
                                String.format("%02d", mm) + "/" +
                                String.format("%02d", dd);

                } catch (Exception e) {
                    result = "INVALID";
                }
            }

            line = line.replace("${" + placeholder + "}", result);
        }

        return line;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            System.out.println(processLine(line));
        }
    }
}