import java.util.Scanner;
     public class IT24102877Lab4Q1{
           public static void main(String[] args){ 
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number :");
                int number = sc.nextInt();
           if(number < 0) {
                System.out.print("The number is Negative.");
           }
           else if (number > 0) {
                System.out.print("The number is Positive.");
           }
           else {
                System.out.print("The number is zero.");
           }
      }
} 
                
