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
      public Holiday holiday(@RequestParam(value="name", defaultValue="New Year's Day") String name) {
         return new Holiday(counter.incrementAndGet(),
               String.format(template, name));
      }
}
