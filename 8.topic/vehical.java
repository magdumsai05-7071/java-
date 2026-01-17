
abstract class  vehical{
    
    abstract void start();

    void fuel(){
        System.out.println("user fual");
    }
    
    public static void main(String []args){
        vehical  v = new bike();
        v.start();
        v.fuel();

    } 

}

class  bike extends vehical{
    void start(){
        System.out.println("bike starts with key");
    }

    public static void main(String []args){
        vehical  v = new bike();
        v.start();
        v.fuel();

    } 
}


// Abstract Class
// 🔹 What is an Abstract Class?

// A class declared using the abstract keyword that may contain abstract and non-abstract methods.