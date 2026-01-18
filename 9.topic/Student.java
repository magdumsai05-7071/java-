class Student {
 private  int id;
 private String name;
 
 //setter methods
 public void setid(int id ){
    this.id = id;
 }

 public void setname(String name){
    this.name = name;

 }

 //getter mrthods
public int getid(){
    return id ;

}
public String getname(){
    return name;
}

public static void main(String[] args) {
        Student s = new Student();
        s.setid(101);
        s.setname("sai");

        System.out.println(s.getid());
        System.out.println(s.getname());
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setid(101);
        s.setname("sai");

        System.out.println(s.getid());
        System.out.println(s.getname());
    }
}
