import java.sql.SQLOutput;
import java.util.Scanner;
//this is necessary otherwise without importing util.Scanner we cant take input from user or we cant use scanner class

public class Day04UserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //The above code is used to tell java that it needs to take input from user
        // which simply says java ,make an Scanner type object named sc and link it with users keyboard . whatever user types it should automatically be stored
        // sc is type of variable name , whenever we need to take input from users now we can simply call sc instead of this huge code again


        // Let's look at the intergers

//          System.out.println("Enter Your First Number");
//          int a = sc.nextInt();   // This line clarify that the input should be integer and be stored in variable named 'a'.
//          System.out.println("Enter Your Second Number");
//          int b = sc.nextInt();
//          int sum = a+b;
//          System.out.println("The Sum Of These Numbers Is:-");
//          System.out.println(sum);

        // Lets go for decimal now

       System.out.println("Enter your first number");
        float x = sc.nextFloat();
        System.out.println("Enter your second number");
        float y = sc.nextFloat();
        System.out.println("The sum of these numbers is:-");
        float sum1 = x+y;
        System.out.println(sum1);

        // We can also use double data type

//        System.out.println("Enter your first number");
//        double p = sc.nextDouble();
//        System.out.println("Enter your second number");
//        double q = sc.nextDouble();
//        System.out.println("The sum of these numbers is:-");
//        double sum2 = p+q;
//        System.out.println(sum2);

        // If you want to check whether our output is integer or not use the below given code
        System.out.println("Please Enter The Output You Got");
        boolean b1 = sc.hasNextInt();
        System.out.print("Our output is integer:-");
        System.out.println(b1);

        // Always remember to code print part first then use int/float and nextint/nextfloat method orelse you have to enter number first then text will show up if alignment upr niche kroge toh


        // NOTE FOR ME
        // here i need to explain about nextInt , hasNextint etc . clearly
        // confusion about do i need to close sc by using [" sc.close(); "] ??
        // i came to know about the common error faced
        // Difference between sc.next() and sc.nextline()
    }
}