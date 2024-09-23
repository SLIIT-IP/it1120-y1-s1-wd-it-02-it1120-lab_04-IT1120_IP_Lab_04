import java.util.Scanner;
public class IT24102386Lab4Q2{
      public static void main(String[]args){
           double examMarks,labSubmissionMarks,percentages, labSubmissionPercentage,examPercentage,finalMarks;
           Scanner input=new Scanner (System.in);
           System.out.println("Please enter exam marks (out of 100):");
           examMarks=input.nextDouble();
           if(examMarks<=100 && examMarks>=0){
           }
           else {
                System.out.println("Invalid input for exam marks");
           }
           System.out.println("please enter lab Submission Marks(out of 100):");
           labSubmissionMarks=input.nextDouble();
           if(labSubmissionMarks<=100 && labSubmissionMarks>=0){
           }
           else {
                System.out.println("Invalid input for labSubmissionMarks");
           }
           System.out.println("please enter the percentage given for the exam:");
           examPercentage=input.nextDouble();
           System.out.println("please enter the percentage given for the lab submission:");
           labSubmissionPercentage=input.nextDouble();
           percentages=examPercentage+labSubmissionPercentage;
           if(percentages<=100 && percentages>=0){
           finalMarks=(examMarks*examPercentage/100)+(labSubmissionMarks*labSubmissionPercentage/100);
           System.out.println("Final Exam Mark is :"+finalMarks);
           }
               else{
             System.out.println("The percentage must add up to 100");
           }

      }
}
