// class Model1Factory
class Model1Factory extends AbstractFactory {
    @Override
    public RightDoor createRightDoor() {
        return new Model1RightDoor();
    }

    @Override
    public LeftDoor createLeftDoor() {
        return new Model1LeftDoor();
    }
    
    @Override
    public Hood createHood() {
        return new Model1Hood();
    }
}

