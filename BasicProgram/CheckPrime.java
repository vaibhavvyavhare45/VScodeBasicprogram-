package BasicProgram;

import java.util.Scanner;

class CheckPrime{
 public static void main(String[] args) {
    int n;
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
    for(int i=2;i<n;i++)  {
    
        if (n%2==0) {
         count++; 
        } 
    }
    if (count==2) {
        System.out.println("the number is prime number");
        
    } else {
        System.out.println("the number is not prime number");
        
    }
    }

}