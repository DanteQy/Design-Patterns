enum Architecture {
     MODEL1, MODEL2, MODEL3
}

abstract class AbstractFactory {
    private static final Model1Factory MODEL1 = new Model1Factory();
    private static final Model2Factory MODEL2 = new Model2Factory();
    private static final Model3Factory MODEL3 = new Model3Factory();

    // Returns a concrete factory object that is an instance of the concrete factory class appropriate for the given architecture.
    static AbstractFactory getFactory(Architecture architecture) {
        AbstractFactory factory = null;
        switch (architecture) {
            case MODEL1:
                factory = MODEL1;
                break;
            case MODEL2:
                factory = MODEL2;
                break;
            case MODEL3:
                factory = MODEL3;
                break;
        }
        return factory;
    }

    public abstract RightDoor createRightDoor();
    public abstract LeftDoor createLeftDoor();
    public abstract Hood createHood();
}