// class RightDoor
public interface RightDoor {
    void draw();
}

// class Model1RightDoor
class Model1RightDoor implements RightDoor {
   @Override
   public void draw() {
       System.out.println("Model 1 - Right Door");
   }
}

// class Model2RightDoor
class Model2RightDoor implements RightDoor {
   @Override
   public void draw() {
       System.out.println("Model 2 - Right Door");
   }
}

// class Model3RightDoor
class Model3RightDoor implements RightDoor {
   @Override
   public void draw() {
       System.out.println("Model 3 - Right Door");
   }
}
