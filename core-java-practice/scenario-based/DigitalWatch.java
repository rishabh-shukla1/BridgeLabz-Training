package scenario_based;

import java.time.*;

public class DigitalWatch 
{
	public static void main(String[] args) {

        //Start time at 00:00
        LocalTime time = LocalTime.of(0, 0);

        //hours
        for (int hour = 0; hour < 24; hour++) {

            // Inner loop = minutes
            for (int minute = 0; minute < 60; minute++) {

                time = LocalTime.of(hour, minute);

                //Print time in HH:MM format
                System.out.println(time);

                //Power cut 
                if (time.equals(LocalTime.of(13, 0))) {
                    System.out.println("Power Cut at 13:00");
                    break;
                }
            }

            //Power cut occurs
            if (time.equals(LocalTime.of(13, 0))) {
                break;
            }
        }
    }

}
