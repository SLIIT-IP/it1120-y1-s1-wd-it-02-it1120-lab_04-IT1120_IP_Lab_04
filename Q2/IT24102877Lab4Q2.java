import java.util.Scanner;
    public class IT24102877Lab4Q2{
         public static void main(String[] args){
             int ExamMark,LabsubmissionMark,ExamPercentage,LabsubmissionPercentage,FinalMark;
             Scanner sc = new Scanner(System.in);
             
             System.out.print("Input the exam marks(given out of 100) :");
             ExamMark = sc.nextInt();
         if(ExamMark < 0 || ExamMark > 100 ){
             System.out.println("Invalid input for exam mark. Terminating program.");
         }
            
             System.out.print("Input the lab submission marks(given out of 100) :");
             LabsubmissionMark = sc.nextInt();
         if(LabsubmissionMark < 0 || LabsubmissionMark > 100){
             System.out.println("Invalid input for lab submission mark. Terminating program.");
         }

             System.out.print("Please enter the percentage given for the exam :");
             ExamPercentage = sc.nextInt();
             System.out.print("Please enter the percentage given for the lab submission :");
             LabsubmissionPercentage = sc.nextInt();

        if(ExamPercentage + LabsubmissionPercentage != 100) ; 
             System.out.print("Invalid input. The percentage must add up to 100.Terminating program.");
             
             FinalMark = (ExamMark * ExamPercentage/100) + (LabsubmissionMark * LabsubmissionPercentage/100) ;
             System.out.print("Final Mark = "+ FinalMark);
       }
  }