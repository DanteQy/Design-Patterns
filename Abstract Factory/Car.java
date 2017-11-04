/*
- Provide an interface for creating families without specifying their concrete  classes.
- Build a hierarchy regarding a non specific product
- The new operator is considered harmful.


What to check:
- Matrix of platforms(Model1/2/3 vs Right/Left/Hood)
*/


public class Car {
    public static void main(String[] args) {
        AbstractFactory factory1 = AbstractFactory.getFactory(Architecture.MODEL1);
        AbstractFactory factory2 = AbstractFactory.getFactory(Architecture.MODEL2);
        RightDoor rd = factory1.createRightDoor();
        rd.draw();
        LeftDoor ld = factory1.createLeftDoor();
        ld.draw();
        Hood h = factory2.createHood();
        h.draw();
    }
}