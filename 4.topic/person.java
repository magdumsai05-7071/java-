public class person {
String name ;
int age ;

    public person() {
        name = "unknown";
        age = 0;
    }
     person(String n, int  a){
        name = n;
        age = a;
     }

     void show(){
        System.out.println(name+ ""+age+"");

     }
     public static void main(String []args ){
         person p1 = new person();
         person p2 = new person("prakash", 66);
         person p3 = new person("sai",34);


         p1.show();
         p2.show();
         p3.show();
     }

}

// Question:
// Demonstrate constructor overloading.
