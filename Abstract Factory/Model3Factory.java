// class Model3Factory
class Model3Factory extends AbstractFactory {
    @Override
    public RightDoor createRightDoor() {
        return new Model3RightDoor();
    }

    @Override
    public LeftDoor createLeftDoor() {
        return new Model3LeftDoor();
    }
    
    @Override
    public Hood createHood() {
        return new Model3Hood();
    }
}