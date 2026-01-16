public class parent {
    final void show(){
        System.out.println("final mathod");
    }
}

class child extends parent{

    // void show() {}  // ERROR: cannot override final method
    public static void main(String[] args) {
        parent p = new parent();
        p.show();
    }
}

// Question:
// Prevent method overriding using final