public class Day13Constants{
    public static void main (String [] args){

        int age = 19;
        age = 20;
        age = 50;
        System.out.println(age);

//        here we can notice that we used the same age variable three times and stored diff values
//        but what if we want that no one can further modify our age variable and assign it another value .
//        In order to do that we can use final keyword so that no one can further modify it

        final double pi = 3.14159;
//        pi = 55.2;               // if you now try to assign another value to pie variable it will show an error
        System.out.println( "Constant pi value:- "+pi);

//        in order to use such constants we use this method.

    }
}