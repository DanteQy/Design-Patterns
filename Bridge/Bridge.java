public class Bridge {
    public static void main(String[] args) {
        DomesticAnimal[] dAnimal = {new DomesticAnimal(), new Dog(), new Cat()};
        WildAnimal wAnimal = new WildAnimal();
        
        dAnimal[0].call();
        wAnimal.call();
        dAnimal[1].call();
        dAnimal[2].call();
        
        dAnimal[0].isFed();
        wAnimal.isFed();
        dAnimal[1].isFed();
        dAnimal[2].isFed();
        
        
    }
}