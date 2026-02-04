// public class Stringbuffer {
//     public static void main(String[] args) {
//         Stringbuffer sd = new  Stringbuffer("hello");
//         sd.append("java");
//         sd.insert(5,"world");
//         sd.reverse();

//         System.out.println(sd);
//     }
// }
class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.reverse();

        System.out.println(sb);
    }
}
