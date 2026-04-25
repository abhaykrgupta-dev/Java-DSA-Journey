
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
        long l = 56489652565L;
        short s = 55;


        int ans1 = b+s;              // any other datatype except int will give error if you try to run
        int ans2 = s+a;              // any other datatype except int will give error if you try to run
        float ans3 = l+f;            // any other datatype except int will give error if you try to run
        float ans4 = a+f;            // any other datatype except int will give error if you try to run
        int ans5 = c+a;              // any other datatype except int will give error if you try to run
        int ans6 = c+s;              // any other datatype except int will give error if you try to run
        double ans7 = l+d;           // any other datatype except int will give error if you try to run
        double ans8 = f+d;           // any other datatype except int will give error if you try to run

        // if you want you can try running program by changing datatype without changing variables it will definitely show error
        // For Eg :- Try running int ans7 = l+d; will give error,
        // but notice that if you change datatype of int to float or double then it will work smoothly without giving error , its because float and double can print integers as well as decimals
        // but if you exchange float with int data types you will get error as int cant hold decimals it can only store integers and thats basic logic

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


    }
}