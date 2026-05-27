import java.util.Scanner;

public class Day16ConditionalOperators {
    public static void main (String[] args){

//        Verification For Adult For Voting

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Age:- ");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("Adult !");
            System.out.println("You Can Vote");
        }
        else {
            System.out.println("Not Adult !");
            System.out.println("You Cannot Vote");
        }

//        Verification Of The Number As Odd Or Even
        // Concept :- even no. --> number which are divisible with 2 leaving remainder 0

        System.out.println("Enter Your Number:- ");
        int num = sc.nextInt();

        int remainder = num%2;

        if (remainder==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }



    }
}