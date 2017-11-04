// class Model2Factory
class Model2Factory extends AbstractFactory {
    @Override
    public RightDoor createRightDoor() {
        return new Model2RightDoor();
    }

    @Override
    public LeftDoor createLeftDoor() {
        return new Model2LeftDoor();
    }
    
    @Override
    public Hood createHood() {
        return new Model2Hood();
    }
}

