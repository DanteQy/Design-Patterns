public class Mammal implements Species {
   private String type; 
   private int value;

   public Mammal(String type){
      this.type = type;		
   }
    
   public void setValue(int value) {
      this.value = value;
   }
 
   public void doThis() {
      System.out.println("doThis() [type: " + type + " | value: "+ value +" ]" );
   }
}
