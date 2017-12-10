/*
-Flyweight pattern is primarily used to reduce the number of objects created
 and to decrease memory footprint and increase performance. 
*/




public class Flyweight {
   private static final String types[] = { "Carnivora", "Lagomorpha", "Primates", "Cetacea"};
    
   public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Mammal mammal = (Mammal)Factory.getSpecies(getType()); 
         mammal.setValue(findValue());
         mammal.doThis();
      }
   } 
    
   private static int findValue() {
      return (int)(Math.random()*100 );
   } 
    
   private static String getType() {
      return types[(int)(Math.random()*types.length)];
   } 
}