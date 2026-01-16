public class A {
    A(){
        System.out.println("parent constructor");
    }
}
class  b extends A{
    b(){
        super();
        System.out.println("chalid constructor");
    }

    
    public static void main(String[] args) {
        new b();

    }
}


// super Keyword (Constructor)

// Question:
// Call parent class constructor using super().