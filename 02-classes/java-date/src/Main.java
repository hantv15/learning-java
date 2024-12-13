//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Java dates
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        // Display current time
        LocalTime myObjTime = LocalTime.now();
        System.out.println(myObjTime);

        // Display current Date and Time
        LocalDateTime myObjDateTime = LocalDateTime.now();
        System.out.println(myObjDateTime);

        // Formatting Date and Time
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myObjDateTime.format(myFormatObj);
        System.out.println("Formatting: " + formattedDate);
    }
}