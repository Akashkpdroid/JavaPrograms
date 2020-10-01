import java.util.*;
class FactorialExample2{    
 public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   System.out.println("Factorial of is: "+factorial(sc.nextInt()));    
 }  
  static int factorial(int n){    
  if (n == 0)    return 1;    
  else    return(n * factorial(n-1));    
 }  
}  
