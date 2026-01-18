 class demo {
 private int a = 10;
 int b = 20;
 protected  int c = 30;
 public int d = 40;
 
 
 void show(){
    System.out.println(a+b+c+d);
 }
 public static void main(String[] args) {
     demo d = new demo();
     d.show();
 }
}
