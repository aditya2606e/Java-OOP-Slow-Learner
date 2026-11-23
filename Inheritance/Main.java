
class A {
    void displayA() {
        System.out.println("This is Parent Class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("This is Child Class B");
    }
}

class C extends B {
    void displayC() {
        System.out.println("This is Child Class C");
    }
}

public class Main {
    public static void main(String[] args) {

        // Single Inheritance
        B obj1 = new B();
        obj1.displayA();
        obj1.displayB();

        // Multilevel Inheritance
        C obj2 = new C();
        obj2.displayA();
        obj2.displayB();
        obj2.displayC();
    }
}
