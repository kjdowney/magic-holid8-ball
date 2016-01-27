package holid8ball;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
            monthNum = 1;
         }

         if (1 == monthNum) {
            monthName = "January";
            name = "New Year's Day";
         }

         return new Holiday(counter.incrementAndGet(),
               String.format(template, name),
               String.format(template, monthName));
      }
}
