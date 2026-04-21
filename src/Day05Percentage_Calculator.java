import java.util.Scanner;
public class Day05Percentage_Calculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This program is for students who want to calculate percentage for their respective examination

        System.out.println("Enter Your English Marks:-");
        float a = scan.nextFloat();
        System.out.println("Enter Your Hindi Marks:-");
        float b = scan.nextFloat();
        System.out.println("Enter Your Mathematics Marks:-");
        float c =scan.nextFloat();
        System.out.println("Enter Your Science Marks:-");
        float d = scan.nextFloat();
        System.out.println("Enter Your Social Science Marks:-");
        float e = scan.nextFloat();

        float sum = a+b+c+d+e;
        float percentage = (sum/500)*100;
        System.out.print("CONGRATULATION Your Final Percentage is ");
//        System.out.print(sum*0.2);  we can also use this
//        in above code i have done 100/500 which comes as 0.2 and multiplied it with sum which means total marks
//        Percentage formula : ( total obtained marks / total subject full marks )*100
        System.out.print(percentage);
        System.out.println("%");

        scan.close();
        // came to know we need to close scanner class by using scan.close();
        // always try to close scanner class at the end of program if you did it in between program and then after it if you want to take input from keyboard it will not take
        // server/company code me if 1 lakh user ne app open kra , har user ka scanner khula reh gya = server ki memory full = app crash . company ka nuksan ho jaega
        // RULE:- Jo cheez "new" se kholte ho , usko close() se band krne ki aadat dal lo
    }
}