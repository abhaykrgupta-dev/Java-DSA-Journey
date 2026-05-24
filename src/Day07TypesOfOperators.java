

public class Day07TypesOfOperators{
    public static void main(String[] args) {

//        Operators are used to perform operations on variables and values

//        Types Of Operators

//        Arithmetic Operators  [ +,-,*,/,%,++,-- ]
        int a = 28;
        int b = a + 12;
        int c = 199 - 18;
        int d = a*4;
        int e = a/4;
    //   Modulo Operator ( % )
        int f = a%12;  // The code simply means tell me the remainder i get if i divide 28 with 12 i.e 4
        // 4.8%1.1 --> will return a decimal remainder i.e 0.4
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

//        Assignment Operators [ = , += . *= ]
        int ab = 125;  // Here = works as an assignment Operator " = assigns 125 to variable ab "
        int p = 8;
        p += 102;    //Here += works as an assignment operator as it will print p+102 which is 8+102=110
    //   p *= 12;     // it simply means p*12 which is 8*12=96

        System.out.println(p);

        // Unary OPERATORS
        // these operators usually requires only one value to be declared
        int numb = 105;
        numb++;                     // '++' means 105 is added or enhanced by 1
        System.out.println(numb);

//        A new concept
        int num = 128;
        System.out.println(num++);   // [129]  // by this we instructed java to first print num and after that add 1 and store it
        System.out.println(num);     // [129]  // now if we try to print num we already know that previously num was enhanced by using ++ so we will get the enhanced output
                                               // simply remember that here we instructed to first print the num then enhanced is as we wrote ++ after num
        int number = 92;
        System.out.println(++number);  // [92] // by using ++ before numb we are instructing java that first enhance the number by 1 and then print it
        System.out.println(number);    // [93] // now if we print this we will figure out we will get output as 93 as it was already enhanced previously by suing ++number
                                               // simply remember that here we instructed java to first enhance the number and print it

//        Similarly we use num-- and --numb for decrement

//      Comparison Operators [ ==,<,>,<=,>= ]
        System.out.println(" is 28 = 40? "+(a==b));      // the == gives only true or false as a result and is used for comparison
        System.out.println("is 128 = 128? " +(128==128));
        System.out.println(" is 1999 greater than 9995? "+(1999>9995));
        System.out.println(" is 2589 less than 8567 ? "+(2589<8567));
        // Similarly we use <= and >=

//        Logical Operators [ && , || , ! ]

    // The and method "&&"
        // it specifies both condition need to be true to get the output as true
        // if one true one false then output false
        // if both false then
        System.out.println( 68>56 && 109>996);
        System.out.println(168<999 && 56 <123);
        System.out.println(559>1036 && 99>102);

    // The or method "||"
        // Simply means if any one from both are true then output Is Also true
        System.out.println( 68>56 || 109>996);
        System.out.println(168<999 || 56 <123);
        System.out.println( 25698<1258 || 569885<4569);

//      Bitwise Operators [ & , | ]
        // this is not necessary at the moment

        // i wrote this code in lit bit hurry if my code has an error i will reconsider making similar projects as a punishment
    }
}