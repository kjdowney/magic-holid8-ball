package holid8ball;

public class Holiday {

   private final long id;
   private final String name;
   private final String monthName;

   public Holiday(long id, String name, String monthName) {
      this.id = id;
      this.name = name;
      this.monthName = monthName;
   }

   public long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getMonthName() {
      return monthName;
   }
}
