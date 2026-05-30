
import java.util.Scanner;

public class Day19ProjectSumOfNaturalNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number upto which you want sum:-");
        int n = sc.nextInt();



        //Method-1: Direct Formula  ( Most Optimal )

        int sum1 = (n*(n+1))/2;
        System.out.println("The Sum of n natural no upto number " +n+ " is:-" + sum1);



        // Method-2: For Loop

        int sum2 = 0;
        for( int i = 1 ; i<=n ; i++ ){
            sum2 = sum2 + i;
        }
        System.out.println("The Sum of n natural no is:-" + sum2);



        //Method-3: While Loop

        int j = 1;
        int sum3 = 0;
        while(j<=n){
            sum3 = sum3 + j;
            j++;
        }
        System.out.println("The Sum of n natural no is:-" + sum3);



        //Method-4: Do-While Loop

        int sum4 = 0;
        int k = 1;
        do {
            sum4 = sum4 + k;
            k++;
        } while(k<=n);
        System.out.println("The Sum of n natural no is:-" + sum4);




//        You will note that if you replace order of line 34 and 35 you will get the wrong sum
//        this is because java runs code line by line

        // sum3=sum3+j;
        // j++
//        this means java will first add sum then incriment the value of j for eg if n=2 first j=1 the sum3 will be 0+1 and then java incriments the value of j to 2
//        now in next turn sum3 =[ (0+1) + j=2 ] which will be equal to 3 then java will incriment j=2 to j=3 and in next loop j will be greater than n so loop will be closed
        // sum3 = 3 its correct

        //Similarly If
        // j++;
        //sum3=sum3+j;
//        this means java will first incriment then add sum for eg if n=2 first j=1 j will incriment due to j++ so j will be 2 and then it will be added to sum3 so
//        sum3 will be 0+2 and then j has become 2 again in next step j will be 3 due to j++ and then sum3 will be [ (0+2) + j=3] which will be 5 next time j is 3 so condition fails as j>n hence loop will be closed
        // sum3 = 5 which is wrong


    }
}