//-------------------------------------------
// class LeftDoor
public interface LeftDoor {
    void draw();
}

// class Model1LeftDoor
class Model1LeftDoor implements LeftDoor {
   @Override
   public void draw() {
       System.out.println("Model 1 - Left Door");
   }
}

// class Model2LeftDoor
class Model2LeftDoor implements LeftDoor {
   @Override
   public void draw() {
       System.out.println("Model 2 - Left Door");
   }
}

// class Model3LeftDoor
class Model3LeftDoor implements LeftDoor {
   @Override
   public void draw() {
      System.out.println("Model 3 - Left Door");
   }
}