
public  class grandparent{
  void porperty(){
    System.out.println("grend parent");
  }
}

class parent extends grandparent{
    void house(){
        System.out.println("parenrt house");
    }
}

class child extends  parent{
    public static void main(String[] args) {
        child c=  new child();

        c.house();
        c.porperty();
    }
}


// 4️⃣ Multilevel Inheritance

// Question:
// Demonstrate multilevel inheritance.