import java.util.Scanner;

public class LadderIfElse
{

    public static void main(String[] args)
    {
        System.out.println("Enter the Marks:- ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks >= 70)
        {
            System.out.println("Distinction");
        } else if (marks>=60) {
            System.out.println("First");
        } else if (marks>=35) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
