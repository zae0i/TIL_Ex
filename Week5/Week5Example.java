interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() { System.out.println("멍멍"); }
}

class Cat implements Animal {
    public void sound() { System.out.println("야옹"); }
}

public class Week5Example {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
