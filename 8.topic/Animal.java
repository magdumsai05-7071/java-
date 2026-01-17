interface  Animal {

    void sound ();  //adstract method 
     public static void main(String[] args) {
        Animal a =new Dog();
        a.sound();
    }
}

class Dog implements  Animal{
    public void sound(){
        System.out.println("dog barks");

    }

    public static void main(String[] args) {
        Animal a =new Dog();
        a.sound();
    }


}



// Interface
// 🔹 What is an Interface?

// An interface is a blueprint of a class that contains only abstract methods (before Java 8).