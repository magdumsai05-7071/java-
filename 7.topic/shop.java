public class shop {
    void draw(){
        System.out.println("shape");
    }
    public static void main(String[] args) {
        shop s = new circal();
        s.draw();
    }
}

class circal extends shop{
    void draw(){
        System.out.println("shappe s ");
    }

    public static void main(String[] args) {
        shop s = new circal();
        s.draw();
    }
}
// Runtime Polymorphism

// Question:
// Demonstrate runtime polymorphism.