import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer st =  
        new StringTokenizer("java is easy");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            
        }
    }
}




