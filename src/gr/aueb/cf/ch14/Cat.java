package gr.aueb.cf.ch14;

public class Cat extends Animal {
    public Cat() {}

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }
}
