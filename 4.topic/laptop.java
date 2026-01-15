public class laptop {

    String modle;
    int ram;


    laptop(String m , int r ){
        modle = m;
        ram = r;
    }

    void display(){
        System.out.println(modle+" "+ram+"");
    }

        public static void  main(String[] args){

            laptop l1 = new laptop("asus", 52);
            laptop l2 = new laptop("hpvictus", 53);

            l1.display();
            l2.display();
          
        
    }
    
}
// Multiple Objects of Same Class

// Question:
// Create multiple objects of a class and display their values