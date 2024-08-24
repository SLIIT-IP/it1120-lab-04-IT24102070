import java.util.Scanner;
public class IT24102070Lab4Q2 {

       public static void main(String[] args) {
 
       Scanner input = new Scanner(System.in);

       int examMarks;

       System.out.println("Please enter exam marks (out of 100):");
       examMarks = input.nextInt();

       if(examMarks <= 0 || examMarks >= 100) {

           System.out.print("Invalid input for exam marks. Terminating program.");
                return;
                         }
       int labSubmissionMarks;
 
       System.out.println("Please enter lab submission marks (out of 100):");
       labSubmissionMarks = input.nextInt();
    
       if(labSubmissionMarks <= 0 || labSubmissionMarks >= 100) {

           System.out.print("Invalid input for exam marks. Terminating program.");
                return;
                        }
 
        int percentageForExam;

       System.out.println("Please enter the percentage given for the exam:");
       percentageForExam = input.nextInt();

       if(percentageForExam <= 0 || percentageForExam >= 100) {

            System.out.print("The percentage must add up to 100. Terminating program.");
                return;
                        }

       int percentageForLabSubmission;

       System.out.println("Please enter the percentage given for the lab submission:");
       percentageForLabSubmission = input.nextInt();

       if((percentageForLabSubmission + percentageForLabSubmission) != 100) {

            System.out.print("The percentage must add up to 100. Terminating program.");
                return;
                        }

       double finalExamMark = (examMarks * percentageForExam / 100) + (labSubmissionMarks * percentageForLabSubmission / 100);
          System.out.println ("Final Exam Mark is : " + finalExamMark); 

        }

 } 

       
       


