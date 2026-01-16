public class calculator {
    int add(int a, int b){
        return a+b;
    }

    double add(double a , double b){
        return a+b;
    }

    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(5,3));
        System.out.println(c.add (5.5,6.7));
    }
}


// Method Overloading (Compile-Time Polymorphism)

// Question:
// Create methods with same name but different parameters.