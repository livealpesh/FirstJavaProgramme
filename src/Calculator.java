public class Calculator
{
    static int a = 50;

    static int b = 50;

    // performs addition between numbers
    public static void printAddition()
    {
    System.out.println(  a + " + " + b + " = " + (a + b));
    }

    // performs subtraction between numbers
    public static void printSubtraction()
    {
        System.out.println(a + " - " + b + " = " + (a-b) );
    }
    // performs multiplication between numbers
    public static void printMultiplication()
    {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    // performs division between numbers
    public static void printDivision()
    {
        System.out.println(a + "/" + b + " = " + (a/b));
    }

    public static void main(String args[])
    {
        printAddition();
        printSubtraction();
        printMultiplication();
        printDivision();
    }



























}
