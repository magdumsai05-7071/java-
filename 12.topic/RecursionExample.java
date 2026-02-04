public class RecursionExample {
    static void print(int n){
        if (n>5 )// base condition 
        return;

       System.out.println(n);
       print(n+1); // recursive call  
    }
    public static void main(String[] args) {
        print(1);
    }
}
