package vytrack;

import org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Scrap {
    public static void main(String[] args) {
        //Current Date:

      String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM d yyy"));
        System.out.println(date);
        String time = LocalTime.now().minusHours(2).format(DateTimeFormatter.ofPattern("h:mm a"));
        System.out.println(time);

    }
}
