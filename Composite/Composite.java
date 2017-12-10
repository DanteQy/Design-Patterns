/*Compose objects into tree structure to represent part-whole hierarchies. Composite lets client treat individual objects and compositions of objects uniformly - Gof

- Compose objects into tree structures
- Recursive composition ("is a" relation to interface)
- Create a "Lowest Common Denominator" that makes classes interchangeable
- */

// Lowest common denominator


public class Composite {
   public static void main(String[] args) {
      //name - family - age
      Species Anc = new Species("Aegyptopithecus zeuxis","Primates");

      Species NWM = new Species("New World Moneys","Cebus");
      Species OWM1 = new Species("Old World Moneys","Macaca");
      Species OWM2 = new Species("Old World Moneys","Papio");
      Species HA = new Species("Human Apes","Hylobates");
      Species PR = new Species("Prosimians","Tarsius");
       
      Species GHA1 = new Species("Great Human Apes","Homo");
      Species GHA2 = new Species("Great Human Apes","Gorilla");
    
      Species OWMP = new Species("Old World Moneys Papionini","Papio Anubis");
     
      Anc.add(NWM);
      Anc.add(OWM1);
      Anc.add(OWM2);
      Anc.add(HA);
      Anc.add(PR);
       
      HA.add(GHA1);
      HA.add(GHA2);

      OWM2.add(OWMP); 

      //print all 
      System.out.println(Anc); 
      System.out.println(" --");
      for (Species start : Anc.getSubspecies()) {
         System.out.println(start);
         
         for (Species s : start.getSubspecies()) {
            System.out.println(s);
             
         } 
      }		
   }
}
