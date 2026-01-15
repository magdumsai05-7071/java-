public class student {
    int id ;
    String name ;

    public student(int i,String n) {
       id = i;
       name = n;
    }

    void display(){
        System.out.print(id + " "+name);
}

public static void main(String[] args) {
    student s =new student(0, null);
    student s1 = new student(123, "sai");

    s.display();
    s1.display();
}

    
}
//Parameterized Constructor