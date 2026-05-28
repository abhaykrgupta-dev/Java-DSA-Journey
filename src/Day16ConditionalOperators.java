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

        if (remainder==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
//       while using if else statement we can avoid '{}' curly brackets if we only use print function once but its better to use curly brackets to avoid any error
        // curly braces are used to print multiple statements



        // Methods for using conditional statements

        // make a program which compares 2 inputs a and  from user whether both are equal or a is greater than b or b is greater than a
        System.out.println("Enter value of a:-");
        int a = sc.nextInt();
        System.out.println("Enter value of b-");
        int b = sc.nextInt();

//        Method-1       [ The wrong approach ]
        if (a==b){
            System.out.println("Both Numbers Are equal");
        }
        if (a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }

        // using multiple if simply means all the if conditions will be checked by java one by one even if first condition is met
        // for eg if a==b then it will print both no are same but after that it will also check for the second if i.e a>b and we know a=b so a>b will be false
        // so the else statement will also get printed this is a common error if a==b then as a result you will get two statements as
        // [ both numbers are equal and b is greater than a ]b but the second statement is false as a=b and a<b cant be true both at same times

//        Method-2
        if (a==b){
            System.out.println("Both Numbers Are equal");
        }
        else {
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("b is greater than a");
            }
        }
        // here first a==b will be checked if a!=b or a==b is false then else condition will be checked in which first a>b will be checked if false then a<b the final else will be checked

//        Method-3         [ use of else if ]
        if (a==b) {
            System.out.println(" a is equal to b");
        }
        else if (a>b) {
            System.out.println(" a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    // More clean version
        if (a==b)
            System.out.println(" a is equal to b");
        else if (a>b)
            System.out.println(" a is greater than b");
        else
            System.out.println("b is greater than a");

        // here first a==b will be checked if false the else if condition will be checked i.e a>b if false a<b will be checked
        // but agr bich mai koi condition true hojae toh java will stop checking further below written statements

    }
}