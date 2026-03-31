package extras;

import java.time.*;


public class TimeZones 
{
	 // method to display time of a zone
    public static void showTime(String zone)
    {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        
        System.out.println(zone + " Time -: " + time);
    }

    public static void main(String[] args)
    {
        //Display
        showTime("GMT");
        showTime("Asia/Kolkata");
        showTime("America/Los_Angeles");
    }

}
