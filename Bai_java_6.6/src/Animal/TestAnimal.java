package Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        cat.greets();

        Dog dog = new Dog("Buddy");
        dog.greets(); 
        dog.greets(new Dog("Charlie")); 

        BigDog bigDog = new BigDog("Max");
        bigDog.greets();
        bigDog.greets(new Dog("Charlie"));
        bigDog.greets(new BigDog("Rocky")); 
    }
}