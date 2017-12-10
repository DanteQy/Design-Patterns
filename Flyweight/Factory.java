import java.util.HashMap;

public class Factory {
   private static final HashMap<String, Species> speciesMap = new HashMap();

   public static Species getSpecies(String type) {
      Mammal mammal = (Mammal)speciesMap.get(type);
       
       //if a match doesn't exist it will add a new type in the hashmap
      if(mammal == null) {
         mammal = new Mammal(type);
         speciesMap.put(type, mammal);
         System.out.println("Define insect type : " + type);
      }
      return mammal;
   }
}