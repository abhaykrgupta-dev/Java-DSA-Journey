import java.util.*;

public class Day17ConceptOfSwitch {
    public static void main (String[] args){

        // lets consider makking a lottery system with 4 prizes [ car, bike, cycle,TV ]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Ticket number:-");
        int number = sc.nextInt();

        if(number==1){
            System.out.println("You won a cycle");
        } else if (number ==102){
            System.out.println("You won a car");
        } else if(number==13){
            System.out.println("You won a TV");
        }else if (number==28){
            System.out.println("You won a bike");
        }else{
            System.out.println("Sorry! Better luck next time");
        }

        // here it was just 4 prize imagine plenty of prizes then??
        // instead of using multiple if elseif statements we can use switch concept for such programs to simplify this code

//  For the same if else statements we can use switch as following:-
        switch (number){
            case 1: System.out.println("You won a cycle");
            break;
            case 102: System.out.println("You won a car");
            break;
            case 13: System.out.println("You won a TV");
            break;
            case 28: System.out.println("You won a bike");
            break;
            default : System.out.println("Sorry! Better luck next time");
        }

        // Remember if you forget to write break then the whole cases will get printed if the top case got fulfilled
        // for eg suppose you forgot to write break after case 102 then if the user enter 102 along with car all the below statements will get printed
        // until it is stopped by a break or it leaves the curly bracket

        // also you may note that i used import java.util.* instead of java.util.scanner ... this * method makes it more easier simple and clean
        // as using the wildcard (*) actually imports every single class inside java.util package into your file's namespace regardless of whether you use them or not
        // but its better to import things you used in program only so better use java.util.Scanner from next time although using * will not give any error now

    }
}
