public class studentarr {
int id;
String name;

     studentarr(int i,String n) {
     id = i;
     name =n;

    }

    void display(){
        System.out.println(id +""+name);
    }
        public static void main(String[] args){
            studentarr[] s = new studentarr[2];
            s[0] = new studentarr(1, "sai");
            s[1]=new studentarr(2,"ravi");

            for(studentarr st: s){
                st.display();
            }
        }
    }







