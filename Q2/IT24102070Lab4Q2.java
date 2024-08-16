import java.util.Scanner;

public class IT24102070Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Invalid input. Please enter exam marks between 0 and 100: ");
            examMarks = scanner.nextDouble();
        }

        System.out.print("Enter the lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid input. Please enter lab submission marks between 0 and 100: ");
            labMarks = scanner.nextDouble();
        }

        System.out.print("Enter the percentage taken from the exam mark: ");
        double examPercentage = scanner.nextDouble();
        while (examPercentage < 0 || examPercentage > 100) {
            System.out.print("Invalid input. Please enter a percentage between 0 and 100: ");
            examPercentage = scanner.nextDouble();
        }

        System.out.print("Enter the percentage taken from the lab submission mark: ");
        double labPercentage = scanner.nextDouble();
        while (labPercentage < 0 || labPercentage > 100) {
            System.out.print("Invalid input. Please enter a percentage between 0 and 100: ");
            labPercentage = scanner.nextDouble();
        }

            while (examPercentage + labPercentage != 100) {
            System.out.println("Error: The percentages must add up to 100.");

            System.out.print("Re-enter the percentage taken from the exam mark: ");
            examPercentage = scanner.nextDouble();
            while (examPercentage < 0 || examPercentage > 100) {
                System.out.print("Invalid input. Please enter a percentage between 0 and 100: ");
                examPercentage = scanner.nextDouble();
            }

            System.out.print("Re-enter the percentage taken from the lab submission mark: ");
            labPercentage = scanner.nextDouble();
            while (labPercentage < 0 || labPercentage > 100) {
                System.out.print("Invalid input. Please enter a percentage between 0 and 100: ");
                labPercentage = scanner.nextDouble();
            }
        }
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.printf("The final mark is: %.2f\n", finalMark);
    }
}
