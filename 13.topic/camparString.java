

public class camparString {
    public static void main(String[] args) {
        String a = "java ";
        String b = new String ("java ");
        System.out.print(a == b);
        System.out.println(a.equals(b));
        

    }
}


// STRINGBUFFER CLASS
// 🔹 What is StringBuffer?

// A mutable sequence of characters (thread-safe).

// ✔ Synchronized
// ✔ Slower than StringBuilder