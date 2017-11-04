class WildAnimal {
    private boolean fed; 
    public void feed() {
        System.out.println("Feeding the animal.");
    }

    public void isFed() {
        if(this.fed == false){
            this.fed = true;
            feed(); 
        } 
        else {
            System.out.println("Is hungry");
        }
            
    } 

    public void jump() {
        System.out.println("Is jumping");
    } 
    public void call() {
        System.out.println("Is howling");
    } 
    
}
