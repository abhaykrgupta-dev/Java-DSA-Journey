public class Day22AdvancePatternPrinting {
    public static void main (String [] args){
        int n = 5;
        System.out.println();

//      Pattern:- 1             [ THE BUTTERFLY PATTERN ]
        System.out.println(" ButterFly Pattern ");
        System.out.println();


       for ( int i = 1; i<=n ; i++){

           for( int j = 1; j<=i ; j++){
               System.out.print("*");
           }
           for( int j = 1; j <= 2*(n-i) ; j++){
               System.out.print(" ");
           }
           for( int j = 1; j<=i ; j++){
               System.out.print("*");
           }
           System.out.println();

       }

        for ( int i = n; i>=1 ; i--){

            for( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            for( int j = 1; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }
            for( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }


//        Pattern:- 2           [ SOLID RHOMNUS ]
        System.out.println();
        System.out.println(" SOLID RHOMBUS");
        System.out.println();

        for (int i = 1; i<=n ; i++){

            for( int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for ( int j = 1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();

        }

//        Pattern:- 3           [ NUMBER PYRAMID ]
        System.out.println();
        System.out.println(" NUMBER PYRAMID ");
        System.out.println();

        for (int i = 1; i<=n ; i++){

            for( int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for( int j = 1 ; j<=i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }


//        Pattern:- 4           [ PALINDROMIC PYRAMID ]
        // palindromic means both side have same pattern going on or you can consider mirror images
        System.out.println();
        System.out.println(" PALINDROMIC PYRAMID ");
        System.out.println();

        for( int i = 1; i<=n ; i++){

            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int j = i; j>=1 ; j-- ){
                System.out.print(j);
            }
            for ( int j = 2; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
