public class animal {
    void eat(){
        System.out.println("Eating");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Barking");
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
}
