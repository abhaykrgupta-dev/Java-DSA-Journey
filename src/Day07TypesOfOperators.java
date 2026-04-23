

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

//      Comparison Operators [ ==,<,>,<=,>= ]
        System.out.println(" is 28 = 16? "+(a==b));      // the == gives only true or false as a result and is used for comparision
        System.out.println("is 128 = 128? " +(128==128));
        System.out.println(" is 1999 greater than 9995? "+(1999>9995));
        System.out.println(" is 2589 less than 8567 ? "+(2589<8567));

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