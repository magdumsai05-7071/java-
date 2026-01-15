//if-else

public class text {

// public static void main(String []args){
//    int num = -9;

//    if (num > 0){
//     System.out.println("positive "+ num);

//    }else if (num<0){
//     System.out.println("negative"+num );
//    }else{
//     System.out.println("Zero"+num);
//    }

// }


// Switch Statement

// 


//for
// public static void main (String [] args ){


//     for(int i = 1 ; i<= 10; i++ ){
//         System.out.println(i);
//     }
// }


// While Loop

// public static void main (String [] args ){
//     int i =1 , sum = 0;

//     while(i <= 5){
//         sum += i;
//         i++;
//     }
//     System.out.println(sum);
// }


// Question:
// Check whether a number is prime.

// public static void main ( String [] args ){
//     int num =7;
//     boolean isprime = true;
//    if(num <= 1){
//     isprime = false;
//    }else{
//    for(int i = 2; i <= num / 2 ; i++ ){
//     if (num % i ==0){
//         isprime = false;
//         break;
//     }
//    }
// }
// System.out.println(isprime);

// }

// Question:
// Create a simple calculator using switch.

//  public static void main(String [] args ){
// int a=2, b= 5;
// char opration = '*';
// switch(opration){
//     case '+': System.out.println(a + b);break;
//     case '-': System.out.println(a-b); break;
//     case '*': System.out.println(a*b);break;
// }



//  } 

// Question:
// Print numbers from 1 to 20, skip multiples of 3, stop at 15.

// public static void main( String [] args ){
//     for (int i =1 ; i<= 20 ; i++){
//         if (i == 15){
//             break;
//         }

//         if(i % 3== 0){
//             continue;
//         }

//         System.out.println(i);
//     }
    
// }


// Print a number pattern.

public static void main(String[] args){
    for (int i = 1; i <= 4; i++ ){
        for(int j= 1; j<=i; j++){
            System.out.print(j);
        }
    }
}
}




