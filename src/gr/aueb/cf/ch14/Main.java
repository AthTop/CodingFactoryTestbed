package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1);
        Dog dog = new Dog("dog", 2);
        Cat cat = new Cat("cat", 3);

        animal.speak();
        System.out.println(animal);

        dog.speak();
        System.out.println(dog);

        cat.speak();
        System.out.println(cat);


        doSpeak(animal);
        doSpeak(dog);
        doSpeak(cat);


    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
