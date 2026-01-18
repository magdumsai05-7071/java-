public class clone2D {
    public static void main(String[] args) {
        int[][]arr = {{1,2},{3,4}};
        int [][] copy = arr.clone();

        copy[0][0]= 100;

        System.out.print(arr[0][0]);
    }
}
