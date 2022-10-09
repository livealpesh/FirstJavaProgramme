public class VariableExercise {
   // static variable
    static String name = "alpesh";

    public static void printMyLastName(){
        // local variable for printMyLastName() method
        String lastname = "panchal";
        System.out.println(lastname);
    }
    public static void printMyAge(){
        String age = "30";
        System.out.println(age);
    }

    public static void main(String args[]){
        // local variable
        int a = 10;
       System.out.println(name);
       System.out.println(a);

       printMyLastName();
       printMyAge();
    }
}
