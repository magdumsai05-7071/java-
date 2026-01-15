public class Student {

    int id;
    String name;

    void display(){
        System.out.print(id +" "+name);
    }

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 101;
        s2.id = 202;

        s1.name = "sai";
        s2.name = "sumit";

        s1.display();
        s2.display();
    }
}
