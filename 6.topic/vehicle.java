public class vehicle {
  void run(){
    System.out.println("vehicle");
  }    
}
  class Bike extends  vehicle {


   
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
  }

// 2️⃣ Single Inheritance

// Question:
// Demonstrate single inheritance.