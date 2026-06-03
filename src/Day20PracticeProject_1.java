import java.util.Scanner;

public class Day20PracticeProject_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Project :- Take a number from user and print its table
        System.out.println("Table Of "+n);
        for(int i = 1 ; i<=10 ; i++){
            int mul = n*i;
            System.out.println(mul);
        }


//        Project :- take the input from user as a number and assign month with it and print it as 1 stands for jan and so on

        System.out.println("Enter your no for month");
        int m = sc.nextInt();

        if ( m == 1){
            System.out.println("January");
        } else if (m==2){
            System.out.println(("February"));
        } else if (m==3){
            System.out.println("March");
        } else if (m==4){
            System.out.println("April");
        } else if (m==5){
            System.out.println("May");
        } else if (m==6){
            System.out.println("June");
        } else if (m==7){
            System.out.println(("July"));
        } else if (m==8){
            System.out.println("August");
        } else if (m==9){
            System.out.println("September");
        } else if (m==10){
            System.out.println("October");
        } else if (m==11){
            System.out.println("November");
        } else if (m==12){
            System.out.println("December");
        } else {
            System.out.println("Invalid input");
        }

//      method-2
        System.out.println("Enter a number");
        int k = sc.nextInt();
        switch (k){
            case 1 : System.out.println("january");
            break;
            case 2 : System.out.println("February");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("July");
            break;
            case 8 : System.out.println("August");
            break;
            case 9 : System.out.println("September");
            break;
            case 10 : System.out.println("October");
            break;
            case 11 : System.out.println("November");
            break;
            case 12 : System.out.println("December");
            break;
            default : System.out.println("Invalid input");

        }

//      Project :- All even numbers till N
        System.out.println("Enter N for printing even no till N :-");
        int N = sc.nextInt();

        // Method-1
        for ( int i = 0; i<=N ; i=i+2){
            System.out.println(i);
        }

        // Method-2
        int j = 0;
        while (j<=N){
            System.out.println(j);
            j=j+2;
        }

        // Method-3
        int l = 0;
        do{
            System.out.println(l);
            l = l+2;
        } while(l<=N);

        // Method-4
        for (int i = 1; i <= N ; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
