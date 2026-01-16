public class parent {
    void show(){
        System.out.print("parent");
    }
}

class child extends parent{
    void show(){
        super.show();
        System.out.println("child");
    }

    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}


// 3️⃣ super Keyword (Access Parent Method)

// Question:
// Use super to call parent class method