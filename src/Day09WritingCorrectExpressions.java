public class Day09WritingCorrectExpressions {
    public static void main(String[] args) {
        // Some Warmups to brush up previous concept of precedence and associativity !
        float A = 8;
        float B = 4;
        float C = 16;
        int V = 6;
        int U = 2;
        int S = 1;
//    WRITING SOME FORMULAS
//        1. A-B divided by C
        float Ans1 = (A-B)/C;
        System.out.println(Ans1);

//   The wrong approach for the same question
//        float WrongAns1 = A-B/C;
//        System.out.println(WrongAns1);
//        "ans we are getting is 7.75 but actual ans is 0.25"

//        2. B^2 - 4Ac divided by 2A
        float Ans2 = (B*B - 4*A*C)/(2*A);
        System.out.println(Ans2);

//        3. V^2 - U^2 divided by 2.A.S
        float Ans3 = (V*V-U*U)/(2*A*S);
        System.out.println(Ans3);

    /**
     * The mistake i made here is that i wrote int instead of writing float which resulted in mismatch in my answer
     * int A = 8;
     * int B = 4;
     * int C = 16;
     * NOW IF I want to write A-B divided by C We already know we will get a decimal output so we write
     * float ANS = (A-B)/C
     * System.out.println(ANS);
     * we will again get wrong answer i.e "0" mut our actual ans shoukld be 0.25
     * this is due to i wrote int A , int B and int C I currently don't know the actual main reason why it happened but i will figure it out soon
     * */

    }

}
