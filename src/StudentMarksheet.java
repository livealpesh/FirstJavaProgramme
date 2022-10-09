public class StudentMarksheet
{
    // global variable
    static int total ;
    static double percentage;

    // no written type with no parameter
    public static void studentMarksheet (String name, int maths, int sci,int eng)
    {
        total = maths + sci + eng;
        percentage = total/3;
        System.out.println(name + " :Total Marks =" + total + " & Percentage =" + percentage);

    }

    public static void main(String[] args)
    {
        // put the out put which ever you want to print or run
        // string come with "" this symbol
        // it is jvm suggested which data come first either u r look into the method sequence
        // it should be comme automatically dont write
        // studentMarksheet is my method

        studentMarksheet("Raj",12,22,55);
        studentMarksheet("Vijay",60,45,66);
        studentMarksheet("Sameer",28,86,22);
        studentMarksheet("suresh",34,56,89);
    }
}
