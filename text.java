
 //Declare variables
// class text {
//     public static void main(String[] args ){
//         int age = 21;
//         char grade = 'A';
//         boolean isStudent = true;

//         System.out.println(age);
//         System.out.println(grade);
//         System.out.println(isStudent);
//     }
// }


//Create a constant use the final keyword 

// class test {
//     public static void main(String[] args){
//         final double pi = 3.14159;
//         int radius = 3;

//         double area = pi * radius * radius;
//         System.out.println(area);
//     }
// }


//Question:
//Perform arithmetic operations on two numbers.

// // class test {
//     public static void main(String [] args){
//        int a = 10 ;
//        int b = 3 ;
       
//     System.out.println(a + b);
//      System.out.println(a - b);
//       System.out.println(a * b);
//        System.out.println(a / b);
//     }
// }



// Question:
// Convert double to int and int to double.



// class text {
//     public static void main(String[] args){
//        int[] arr= {1,23,4,5,6}; 

//        for(int i = 0 ; i < arr.length; ++i){
//         System.out.println(i);  
//        }
//        }

//     }  


// Question:
// Find the largest and smallest number in an array

// class test  {
//     public static void main (String []args){

//         int []arr = {12,24,36,48,60};

//          int max = arr[0];
//          int min = arr[0];

//          for(int i = 1 ; i < arr.length ; i++){
//             if (arr[i]< min)
//              min = arr[i];

//              if(arr[i]>max)
//              max  = arr[i];
//          }

//          System.out.println(min);
//          System.out.println(max);
//         }
// }

// Question:
// Calculate average of integers and return accurate result using casting

// class test {
//     public static void main (String [] args){
//         int a = 3 , b = 4 , c= 5;

//         double average = (double) a+b+c/3;
//         System.out.println(average + "Averge");
//     }
// }


// Question:
// Use final with array reference and try modifying values.

// class tsxt {
//     public static void main(String[] args) {
//         final int []arr = {1,23,4,66};

//         arr[0] = 10;

//         for(int i : arr){
//             System.out.println(i);
//         }
//     }
// }


// Question:
// Check if a number is even or odd using bitwise operator.

class tsxt{
    public static void main(String[] args) {
        int num = 7;

        if ((num & 1)==0)
            System.out.println("even");
        else
            System.out.println("odd");
        
    }
}


class text{
    public static void main(String[] args) {
        int []arr= {1,2,34,5,6,77,8,90,98};
         
        int even = 0,odd = 0;

        for (int i =0 ; i< arr.length ; i++){
            if (( i & 1) ==0)
            even ++;
            else 
            odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    
    }
}