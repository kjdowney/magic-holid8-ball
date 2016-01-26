package holid8ball;

public class Holiday {

   private final long id;
   private final String name;

   public Holiday(long id, String name) {
      this.id = id;
      this.name = name;
   }

   public long getId() {
      return id;
   }

   public String getName() {
      return name;
   }
}
