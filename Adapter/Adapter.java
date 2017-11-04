/*
-Allows one class to work with another that usually couldn't.
-Wrap a class in a new interface
-Allow old components to match new systems.

The main selling point is that it allows to reuse functionalities not compatible with the current system/archiecture by creating an intermediary.

checlist:
-Identify and design the necessary wrapper class;
-The adapter has an instance of the adaptee class;
*/
  
public class Adapter  {
   public static void main(String[] args) {
        RoundHole roundHole = new RoundHole( 6);
        HexagonalHole hexHole = new HexagonalHole( 6);
        SquarePegAdapter sqAdapter;
       
        for (int i = 1; i < 10; i++) {
        sqAdapter = new SquarePegAdapter((double)i);
        sqAdapter.fit(roundHole);
        sqAdapter.fit(hexHole);
        }
   }
}