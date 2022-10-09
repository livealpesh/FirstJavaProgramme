public class Calculator02
{
    // no written type with parameter method
    // for addition  use static
    // for susbstraction use non static

   static int answer;

   // method is static
   public static void addition(int a, int b)
   {
       answer = a +b ;
       System.out.println(" Addition of " + a +  " and "  + b + " = " + answer);
   }
   // method is non static
    public void substraction(int a, int b)
    {
        answer = a - b ;
        System.out.println(" Substraction of " + a + " and " + b + " = " + answer);
    }

    public static void main(String[] args)
    {
        addition(24,89);

        // using new word is create new object helping to creat instant class

    Calculator02 calculator02 = new Calculator02();

    calculator02.substraction(58,48);
    }
}
