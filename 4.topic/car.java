public class car {
    String brand;
    int price;

    void setdata(String b, int p){
        brand = b;
        price = p;
    }

    void show(){
        System.out.println(brand+ "" +price);

    }
    public static void main(String[] args) {
        car c = new car();
          c.setdata("honda", 5000000);
          c.show();
    }

}
