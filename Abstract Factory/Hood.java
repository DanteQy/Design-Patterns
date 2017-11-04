//-------------------------------------------
// class Hood
public interface Hood {
    void draw();
}

// class Model1Hood
class Model1Hood implements Hood {
   @Override
   public void draw() {
       System.out.println("Model 1 - Hood");
   }
}

// class Model2Hood
class Model2Hood implements Hood {
   @Override
   public void draw() {
       System.out.println( "Model 2 - Hood");
   }
}

// class Model3Hood
class Model3Hood implements Hood {
   @Override
   public void draw() {
       System.out.println( "Model 3 - Hood");
   }
}

