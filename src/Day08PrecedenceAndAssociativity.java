
public class Day08PrecedenceAndAssociativity {
    public static void main(String[] args) {

//         Just like we use BODMAS method in mathematics for solving equations , In Java we use Precedence and Associativity

//         Precedence

//         The Operators are applied and evaluated on the basis of precedence
//         The operators having high precedence value is evaluated / applied first
//         For eg :-
        int x = 108+12*8;           // "*" has high precedence than "+" so It goes like:-  = 108+96
        System.out.println(x);       // "*" is executed first when compared with "+"        = 204

        int a = 28-56/2;            // "/" has high precedence than "-" So :-    = 28-56/2
        System.out.println(a);       // "/" will be applied first                 = 28-28
//                                                                                  = 0

//        In Case We are required to change this order we can use parenthesis () as the precedence value of it is highest

//        Associativity

//        Associativity tells us the direction of execution of operators when we are collapsed with operators with same precedence value
//        It can either be from "Left to Right" or "Right to Left Execution" !
//        For eg :- "+" and "-" have same precedence value so we will use their associativity (i.e L-->R )to determine how operators are executed
//        similarly "*" and "/" have same precedence value and their Associativity is from " Left to Right "

        int y = 180-150+250/5;      //  = 180-150+250/5
        System.out.println(y);      //  = 180-150+50
//                                      = 30+50
//                                      = 80

        int z = 60/5-18*12;         //  = 12-18*12
        System.out.println(z);      //  = 12-216
                                    //  = -204

        int b = 18*12-60/5;         //  = 216-60/5
        System.out.println(b);      //  = 216-12
                                    //  = 204
//        See above we know precedence of both "*" and "/" are same so we use associativity to determine execution path i.e from left to right
//        In line 33 "/" is executed first but in line 37 "*" is executed first although precedence of both "/" and "*" are exactly same
//        This is due to associativity we can see difference in direction of execution

//        Note :- You can refer this Table for value of precedence and direction of associativity

        /**
         * JAVA OPERATOR PRECEDENCE AND ASSOCIATIVITY TABLE
         * -----------------------------------------------------------------------------
         * Precedence | Operator(s)                | Associativity | Description
         * -----------|----------------------------|---------------|--------------------
         * 14 (High)  | () [] . ->                 | Left to Right | Call, Array, Member
         * 13         | ! ~ ++ -- + - * & (type)   | Right to Left | Unary, Cast, Sizeof
         * 12         | * / %                      | Left to Right | Multiplicative
         * 11         | + -                        | Left to Right | Additive
         * 10         | << >>                      | Left to Right | Shift
         * 9          | < <= > >=                  | Left to Right | Relational
         * 8          | == !=                      | Left to Right | Equality
         * 7          | &                          | Left to Right | Bitwise AND
         * 6          | ^                          | Left to Right | Bitwise XOR
         * 5          | |                          | Left to Right | Bitwise OR
         * 4          | &&                         | Left to Right | Logical AND
         * 3          | ||                         | Left to Right | Logical OR
         * 2          | ?:                         | Right to Left | Conditional
         * 1          | = += -= *= /= %= &= ^= |=  | Right to Left | Assignment
         * 0 (Low)    | ,                          | Left to Right | Comma
         * -----------------------------------------------------------------------------
         * Parentheses are the king-- IF you are confused , use () to force the computer to do that parentheses part first.
         */






    }
}

