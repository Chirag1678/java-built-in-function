// Program to display the current time in different zones
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class TimeInDifferentZones {
    public static void main(String[] args) {
        // Get the ZoneId for different time zones
        ZoneId gmt = ZoneId.of("GMT");
        ZoneId ist = ZoneId.of("Asia/Kolkata");
        ZoneId pst = ZoneId.of("America/Los_Angeles");

        // Get current time for each zone
        ZonedDateTime gmtTime = ZonedDateTime.now(gmt);
        ZonedDateTime istTime = ZonedDateTime.now(ist);
        ZonedDateTime pstTime = ZonedDateTime.now(pst);

        // Use DateTimeFormatter to format the time accordingly
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss VV");

        // Display the current time in different zones
        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current time in IST: " + istTime.format(formatter));
        System.out.println("Current time in PST: " + pstTime.format(formatter));
    }
}

// Sample Output ->
// Current time in GMT: 2021-07-07 10:00:00 GMT
// Current time in IST: 2021-07-07 15:30:00 Asia/Kolkata
// Current time in PST: 2021-07-07 02:00:00 America/Los_Angeles

// Current time in GMT: 2025-03-07 08:29:41 GMT
// Current time in IST: 2025-03-07 13:59:41 Asia/Kolkata
// Current time in PST: 2025-03-07 00:29:41 America/Los_Angeles