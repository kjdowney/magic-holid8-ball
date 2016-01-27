package holid8ball;

public class Holiday {

   private final long id;
   private final long schemaVersion;
   private final String name;
   private final String monthName;

   public Holiday(long id, String name, String monthName) {
      this.schemaVersion = 3;
      this.id = id;
      this.name = name;
      this.monthName = monthName;
   }

   public long getId() {
      return id;
   }

   public long getSchemaVersion() {
      return schemaVersion;
   }

   public String getName() {
      return name;
   }

   public String getMonthName() {
      return monthName;
   }
}
