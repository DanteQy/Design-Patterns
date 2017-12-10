/*
- Attach additional responsibilities to an object dynamically
- Client-specified embellishment of a core object by recursively wrapping it --> WRAPPER.

You want to add behavior or state to individual objects at run-time
*/



public class Decorator {
   public static void main(String[] args) {
Blade dagger = new Dagger();

     Blade cross = new CrossguardHilt(new Dagger());

     Blade hilt = new HiltGuard(new Sword());
     System.out.println("1");
     dagger.apply();
     System.out.println("2");
     cross.apply();
     System.out.println("3");
     hilt.apply();
   }
}