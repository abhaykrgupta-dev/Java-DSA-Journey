import java.util.Scanner;

public class Day06UnitsConversion{
        public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);

//         Kilometer To Meter
//         1km = 1000m
            System.out.println("Enter Distance Covered in Kilometer");
            float a =abc.nextFloat();

            float inmeter = a*1000;

            System.out.println("You Covered "+inmeter+"meter");

//         Kilometer To Miles
//         1km is 0.62 miles

            System.out.println("Enter Distance in Kilometer");
            double x = abc.nextDouble();
            double inmiles = x*0.62;
            System.out.println("Distance in Miles");
            System.out.println(inmiles);

//          Kilogram To Pounds
//          1kg = 2.2046 pounds
            System.out.println("Enter Weight in Kilogram");
            double y = abc.nextDouble();
            double inpound = y*2.2046;
            System.out.println("weight in Pounds");
            System.out.println(inpound);

//          Centimeter To Inch
//          1cm = 0.393 inch
            System.out.println("Enter height in Centimeter");
            double z = abc.nextDouble();
            double ininch = z*0.393;
            System.out.println("Height in Inch");
            System.out.println(ininch);

//          Meter To Feet
//          1meter = 3.28 feet

            System.out.println("Enter Input In Meters");
            double p = abc.nextDouble();
            double infeet = p*3.28;
            System.out.println("Output In Foot");
            System.out.println(infeet);

//            Meter To Yard
//            1meter = 1.093 yard
            System.out.println("Enter Input In Meters");
            double q = abc.nextDouble();
            double inyard = a*1.093;
            System.out.println("Output is "+ inyard +"yards");



          abc.close();
        }
    }


