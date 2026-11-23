
interface Animal {
    void sound();
}

abstract class LivingBeing {
    abstract void eat();

    void sleep() {
        System.out.println("Living being is sleeping");
    }
}

class Dog extends LivingBeing implements Animal {

    void eat() {
        System.out.println("Dog is eating");
    }

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.sound();
        d.sleep();
    }
}
