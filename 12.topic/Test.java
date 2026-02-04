public class Test {
    int x= 10;
       public static void main(String[] args) {
        Test odj= new Test();
        System.err.println(odj.x);
    }

}
class callbyvalueodj{
    static void chsngs(Test t){
        t.x= 30;
    }
    public static void main(String[] args) {
        Test odj= new Test();
        System.err.println(odj.x);
    }
}