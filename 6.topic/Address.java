public class Address {
    String city , state;

    Address (String c, String  s){
        this.city =  c;
        this.state = s;
    }
}

 class employee{
   String name ;
   int id ;
   Address address;   // Aggregation funtion 

    public employee(String n, int i, Address address) {
        this.name = n;
        this.id = i;
        this.address = address;
    }
void display(){
    System.out.println(id +""+name);
    System.out.println(address.city+""+address.state);
}

public static void main(String[] args) {
   Address a= new Address(null, null);
   employee e = new employee(null, 0, a);

   e.display();
   
}
}


// Aggregation Example

// Question:
// Demonstrate aggregation using Address and Employee.
