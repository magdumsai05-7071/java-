public class shape {

    void draw(){
        System.out.println("shap");
    }
}
    class circle extends shape {
        void area(){
            System.out.println("area");
        }
    }

    class rectangle extends shape{
         void area(){
            
            System.out.println("area");
        }
         public static void main(String[] args) {
             circle c = new circle();
             rectangle r = new rectangle();

             c.draw();
             r.draw();
         }
    }
// Hierarchical Inheritance

// Question:
// Demonstrate hierarchical inheritance.