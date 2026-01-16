public class animal {
    void sound(){
        System.out.println("animal sound");
    }
    
}

class dog extends animal{
    void sound(){
        System.out.println("dog sound");
    }
}

    class cat extends animal{
        void sound(){
             System.out.println("cat sound");
        }
         public static void main(String[] args) {
        animal a;
        a = new dog();
        a = new cat();

        a.sound();
    }
       
    }

// Question:
// Demonstrate polymorphism using one method with different behaviors.