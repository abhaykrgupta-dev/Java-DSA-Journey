public class Day02AddingNumbers {
    public static void main ( String [] args){
       //Addition of Integers
        int a = 120;
        int b = 50;
        int c = 28;
        int sum = a+b+c ;

        System.out.print("The sum of above numbers is = ");
        System.out.println(sum);

        //Addition of Decimals
        //we had to add "F" after our decimal literal because the default datatype for decimal input is double
        float p = 12.28F;
        float q = 56.08F;
        float r = 123.58F;
        float sum2 = p+q+r ;
        System.out.println("Sum of the above decimal numbers is = "+sum2);

        //Addition of decimals with other datatype
        //Here we did not need to mention d because the default datatype for decimal literals is double although we can add d it will not effect our program
        double x = 123.768;
        double y = 648.930d;
        double z = 8934.6348;
        double sum3 = x+y+z ;
        System.out.println("The sum of the above numbers is = "+sum3);



    }
}