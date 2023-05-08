/*

    Demonstrate an example of polymorphism between an Animal, Dog and Cat

 */

public class TransformingAnimals {
    public static void main(String[] args) {
        Dog je = new Dog();
        je.makeSound();
        je.fetch();

        Animals jo = new Dog();
        jo.makeSound();
        
        jo = new Cat();
        jo.makeSound();
        ((Cat)jo).scratch();
    }
}

class Animals {
    public void makeSound() {
        System.out.println("unknown animal sound");
    }
}

class Dog extends Animals {
    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println("fetch is fun");
    }
}

class Cat extends Animals{

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void scratch() {
        System.out.println("I am a cat, I scratch things");
    }
}