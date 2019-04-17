import java.util.Scanner;
class Factor{
   public static void main(String args[]){
   
      Scanner a = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = a.nextInt();
      int factorial = fact(num);
      System.out.println("Factorial of entered number is: "+factorial);
   }
   static int fact(int n)
   {
       int output;
       if(n==1){
         return 1;
       }
       output = fact(n-1)* n;
       return output;
   }
}