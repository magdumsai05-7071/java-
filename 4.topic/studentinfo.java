public class studentinfo {
    int id;
    String name;

    public studentinfo(int i,String n) {
     this.id = i;
     this.name = n;
    }
    void display(){
        System.out.println(id+""+name+"");

    }
    public static void main(String [] args){
        studentinfo s1 = new studentinfo(0, null);


        s1.display();
    }

    
}
