public class bank {
    int getbank(){
        return 4;
    }
     public static void main(String[] args) {
        bank b = new sbl();
        System.out.println(b.getbank());
    }
}

class sbl extends bank{
    int getbank(){
        return 8;
    }

    public static void main(String[] args) {
        bank b= new sbl();
        System.out.println(b.getbank());
    }
}

// Method Overriding

// Question:
// Override a method in child class.