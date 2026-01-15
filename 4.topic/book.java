public class book {
    int bookid; 
    String title;

    book(int id , String t){
        bookid =id ;
        title = t;
    }
    void display(){
        System.out.println(bookid+""+title);
    }
   public static void main(String[] args){
    book b = new book(1, "java");
    b.display();
   }
}
