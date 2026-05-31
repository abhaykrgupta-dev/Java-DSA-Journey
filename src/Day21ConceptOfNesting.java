import java.util.Scanner;

public class Day21ConceptOfNesting {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

//        Pattern:- 1    [ SOLID RECTANGLE ]
        System.out.println("Enter no of rows:-");
        int r = sc.nextInt();
        System.out.println("Enter no of columns:-");
        int c = sc.nextInt();
        System.out.println();
        System.out.println("SOLID RECTANGLE");
        System.out.println();

        for ( int i = 1; i <= r ; i++ ){

            for ( int j = 1; j <= c; j++){
                System.out.print("*");
            }
            System.out.println();

        }

//        Pattern:- 2      [ HOLLOW RECTANGLE ]
        System.out.println();
        System.out.println(" HOLLOW RECTANGLE ");
        System.out.println();

    // first row
        for ( int i = 1; i <= c ; i++){
            System.out.print("*");
        }
        System.out.println();
    // row 2 to second last row
        for( int i = 1; i <= r-2 ; i++) {
            System.out.print("*");
            for (int j = 1; j <= c-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    // last row
        for (int i = 1; i <= c; i++){
            System.out.print("*");
        }

//        Pattern:- 2     [ ALTERNATIVE AND MOST EFFECTIVE METHOD ]
        System.out.println();
        System.out.println(" ALTERNATIVE OF PATTERN 2");
        System.out.println();

        for ( int i = 1; i<=r ; i++){

            for ( int j = 1; j<=c ; j++ ){

                if ( i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }


//      Pattern:- 3       [ HALF PYRAMID ]
        System.out.println();
        System.out.println("Enter the value of n");
        // int n = sc.nextInt();
        int n = 4;
        System.out.println();
        System.out.println(" HALF PYRAMID ");
        System.out.println();

        for ( int i = 1; i <= n ; i++){

            for ( int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

//        Pattern:- 4        [ INVERTED HALF PYRAMID ]
        System.out.println();
        // int n = 4; Already declared
        System.out.println(" INVERTED HALF PYRAMID ");
        System.out.println();

        for ( int i = n; i >= 1 ; i--){

            for ( int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

//        Pattern:- 5          [ INVERTED AND ROTATED HALF PYRAMID ]
        System.out.println();
        System.out.println(" INVERTED AND ROTATED HALF PYRAMID ");
        System.out.println();

        for ( int i = 1; i<=n ; i++){
            for ( int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for ( int j = 1; j<=i ; j++ ){
                System.out.print("*");
            }
            System.out.println();

        }

//        Pattern:- 6          [ HALF PYRAMID WITH NUMBERS ]
        System.out.println();
        System.out.println(" HALF PYRAMID WITH NUMBERS ");
        System.out.println();

       for ( int i = 1 ; i <= n ; i++ ){

           for( int j = 1; j <= i ; j++){
               System.out.print(j + " ");
           }
           System.out.println();

       }

//       Pattern:- 7           [ INVERTED HALF PYRAMID WITH NUMBERS ]
        System.out.println();
        System.out.println(" INVERTED HALF PYRAMID WITH NUMBERS ");
        System.out.println();

        for ( int i = 1; i <= n ; i++){

            for ( int j = 1; j <= n-i+1 ; j++){
                System.out.print( j + " ");
            }
            System.out.println();

        }

//        Pattern:- 8           [ FLOYD'S TRIANGLE ]
        System.out.println();
        System.out.println(" FLOYD'S TRIANGLE ");
        System.out.println();

        int number = 1;
        for ( int i = 1; i <= n ; i++){

            for ( int j = 1; j <= i ; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();

        }

//        Pattern:- 9            [ 0-1 TRIANGLE ]
        System.out.println();
        System.out.println(" 0-1 TRIANGLE ");
        System.out.println();

        for ( int i = 1; i <= n ; i++){

            for ( int j = 1; j <= i ; j++){
                int sum = i+j;
                if ( sum % 2 == 0 ){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }


        /*
        * SOME IMPORTANT POINTS TO REMEMBER
        * THERE CAN BE PLENTY OF METHODS FOR PRINTING ONE PATTERN BUT THE ONE WHICH DOES IT IN MINIMAL CODE IS THE ONE WHICH SHOULD BE CONSIDERED
        * NESTING MEANS USING A LOOP INSIDE A LOOP AND SO ON
        * GENERALLY i used inside the for loop here represent rows in most case but not in all
        * similarly j is used to represent columns in most case once again in most case it is not necessary that j should only represent column kinda thing
        *
        * */

    }
}
