import java.util.Scanner;
public class Day23VerificationOfPrimeNo {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Number :- ");
        int num = sc.nextInt();

        if ( num == 0 || num == 1 || num < 0){
            System.out.println("Neither Prime Nor Composite");
        }else {

           int i = 2;
           while ( i < num ){
               int j = num % i ;
               if ( j == 0){
                   System.out.println(" Composite ");
                   break;
               }
               i++;
           }
           if ( i == num ){
               System.out.println(" Prime ");
           }

        }
        sc.close();
    }
}
// negative numbers are defined as neither prime nor composite and 2 is the smallest prime no ..