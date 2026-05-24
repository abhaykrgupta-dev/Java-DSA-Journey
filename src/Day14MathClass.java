
public class Day14MathClass{
    public static void main (String[] args){

        // In java we have some classes predefined one of it is the math class we can use this as:-

        System.out.println(Math.max(1099,1052));
        System.out.println(Math.min(12500,4587));

        System.out.println(Math.random());  // we will find that by using this we will get random values ranging from 0.0 to 1.0

        // If we want an integer value we can typecast it as:-

//        System.out.println((int)Math.random());   but you will find that we will get 0 everytime its because the default value we get using random function ranges between 0 to 1.
//        So if we want diff integer we can use the following
        System.out.println((int)(Math.random()*100));

    }
}