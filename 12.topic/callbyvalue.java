public class callbyvalue {
static void change(int x){
    x = 20;
}    

public static void main(String[] args) {
    int a= 10 ;
    change(a);
    System.out.println(a);
}
}
// Call by Value Example (Primitive Type)