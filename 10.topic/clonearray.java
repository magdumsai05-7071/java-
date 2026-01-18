public class clonearray {
    
    public static void main(String[] args) {
        
        int [] original = {1,2,3,4,5,6};
        int [] copy = original.clone();

        copy [0] = 100;

        System.out.print(original[0]);//1
        System.out.println(original[0]);//100
    }
}
