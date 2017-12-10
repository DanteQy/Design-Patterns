import java.util.ArrayList;
import java.util.List;

public class Species {
   private String family;
   private String name;
   private String dist;
   private List<Species> subspecies;

   // constructor 
   public Species(String family, String name ) {
      this.name = name;
      this.family = family; 
      this.dist = "";
      subspecies = new ArrayList<Species>();
   }

   public List<Species> getSubspecies(){
     return subspecies;
   }
    
   public void add(Species e) {
      subspecies.add(e);
      e.dist = this.dist+"--";
   }

   public void remove(Species e) {
      subspecies.remove(e);
   }

   

   public String toString(){
      return ("|"+dist+"  Classification: " + family + " :" +name );
   }   
}