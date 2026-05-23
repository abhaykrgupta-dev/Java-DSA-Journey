
public class Day10ResultingDataType {
    public static void main(String[] args) {

//     Let's learn about resulting data types that we get after we run an arithmetic operation on them
        /**
         *    1. byte + short = int
         *    2. short + int = int
         *    3. long + float = float
         *    4. int + float = float
         *    5. char + int = int
         *    6. char + short = int
         *    7. long + double = double
         *    8. float + double = double
         */
    // Examples :-
        int a = 8;
        byte b = 126;
        char c ='@';
        double d = 89556.6598;
        float f = 199.965F;
        float F = 100.998F;
        long l = 56489652565L;
        short s = 55;


        int ans1 = b+s;              // any other datatype except int will give error if you try to run
        int ans2 = s+a;              // any other datatype except int will give error if you try to run
        float ans3 = l+f;            // any other datatype except float will give error if you try to run
        float ans4 = a+f;            // any other datatype except float will give error if you try to run
        int ans5 = c+a;              // any other datatype except int will give error if you try to run
        int ans6 = c+s;              // any other datatype except int will give error if you try to run
        double ans7 = l+d;           // any other datatype except double will give error if you try to run
        double ans8 = f+d;           // any other datatype except double will give error if you try to run

        // if you want you can try running program by changing datatype without changing variables it will definitely show error
        // For Eg :- Try running int ans7 = l+d; will give error,
        // but notice that if you change datatype of int to float or double then it will work smoothly without giving error , its because float and double can print integers as well as decimals and this is known as implicit casting or widening primitive conversion
        // but if you exchange float with int data types you will get error as int cant hold decimals it can only store integers and thats basic logic
        // Casting:- we can store small containers material into a big container but if we try to store big containers material into the small one it will over flow and we will loose some data

//        int wrongans7 = l+d;                 this will show error
//        System.out.println(wrongans7);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
        System.out.println(ans6);
        System.out.println(ans7);
        System.out.println(ans8);

//        Eg to understand casting better

        double price = 100.00;
        double FinalPrice = price + 18;
        System.out.println(FinalPrice);

        int price_ = 100;
//        int finalprice = price + 18.99;         //   here , you will face an error here as java refuses to do implicit casting here , java prevents automatic "narrowing" to protect our data from being lost.


//        Now if we want to store it and we are redy to loose some of our data then we can do this as following:-

        int finalPrice = price_ + (int)18.99;
        System.out.println( finalPrice);      // you can observe that we lost our value that was written after the decimal point i.e 0.99
                                              // but you will find out there is no error and this is called explicit casting



    }
}