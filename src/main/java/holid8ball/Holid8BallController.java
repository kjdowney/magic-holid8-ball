package holid8ball;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class Holid8BallController {

   private static final String template = "%s";
   private final AtomicLong counter = new AtomicLong();

   @RequestMapping("/magicholid8ball")
      public Holiday holiday(
            @RequestParam(value="monthName", defaultValue="any") String monthName) {
         int monthNum = 0;
         String name = "Unknown";

         if ("ANY".equalsIgnoreCase(monthName)) {
            monthNum = ThreadLocalRandom.current().nextInt(1, 13);
         }

         switch(monthNum) {
            case 1:  monthName = "January";
                     name = "New Year's Day";
                     break;
            case 2:  monthName = "February";
                     name = "Valentine's Day";
                     break;
            case 3:  monthName = "March";
                     name = "St. Patrick's Day";
                     break;
            case 4:  monthName = "April";
                     name = "April Fool's Day";
                     break;
            case 5:  monthName = "May";
                     name = "Cinco de Mayo";
                     break;
            case 6:  monthName = "June";
                     name = "Flag Day";
                     break;
            case 7:  monthName = "July";
                     name = "Independence Day";
                     break;
            case 8:  monthName = "August";
                     name = "Purple Heart Day";
                     break;
            case 9:  monthName = "September";
                     name = "Labor Day";
                     break;
            case 10: monthName = "October";
                     name = "Columbus Day";
                     break;
            case 11: monthName = "November";
                     name = "Thanksgiving";
                     break;
            case 12: monthName = "December";
                     name = "Christmas Day";
                     break;
            default: monthName = "Invalid month";
                     break;
         }

         return new Holiday(counter.incrementAndGet(),
               String.format(template, name),
               String.format(template, monthName));
      }
}
