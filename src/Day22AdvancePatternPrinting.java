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

//        Pattern:- 2           [ HOLLOW BUTTERFLY ]
       System.out.println();
       System.out.println(" HOLLOW BUTTERFLY ");
       System.out.println();

       for ( int i = 1; i <= n ; i++){
           for ( int j = 1 ; j <= i ; j++){
               if ( j == 1 ||  j == i ) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           for ( int j = 1; j <= 2*(n-i) ; j++ ){
               System.out.print(" ");
           }
           for ( int j = 1; j <= i ; j++){
               if ( j == 1 || j == i ) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
       for ( int i = n; i >= 1 ; i--){
           for ( int j = 1 ; j <= i ; j++){
               if ( j == 1 ||  j == i ) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           for ( int j = 1; j <= 2*(n-i) ; j++ ){
               System.out.print(" ");
           }
           for ( int j = 1; j <= i ; j++){
               if ( j == 1 || j == i ) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }


//        Pattern:- 3           [ SOLID RHOMBUS ]
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

//        Pattern:- 4         [ Hollow RHOMBUS ]
       System.out.println();
       System.out.println(" HOLLOW RHOMBUS ");
       System.out.println();

       for ( int i = 1; i <= n ; i ++){

           for ( int j = 1; j <= n-i ; j++){
               System.out.print(" ");
           }
           for ( int j = 1; j <= n ; j++){
               if ( j == 1 || j == n || i == 1 || i == n ) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }


//        Pattern:- 5         [ NUMBER PYRAMID ]
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


//        Pattern:- 6          [ PALINDROMIC PYRAMID ]
        // palindromic means both side have same pattern going on or, you can consider mirror images
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


//        Pattern:- 7           [ DIAMOND ]
        System.out.println();
        System.out.println(" DIAMOND ");
        System.out.println();

        for (int i = 1; i<=n ; i++){

            for ( int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for ( int j = 1; j <= (2*i-1) ; j++ ){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i>=1 ; i--){

            for ( int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for ( int j = 1; j <= (2*i-1) ; j++ ){
                System.out.print("*");
            }
            System.out.println();

        }

//          Pattern:- 8          [ NUMBER Bi-PYRAMID ]
       System.out.println();
       System.out.println(" NUMBER Bi-PYRAMID ");
       System.out.println();

       for ( int i = 1 ; i <= n ; i++){

           for ( int j = 1 ; j<= n-i ; j++){
               System.out.print(" ");
           }
           for ( int j = 1 ; j<=i ; j++){
               System.out.print(i + " ");
           }
           System.out.println();
       }
       for ( int i = n-1 ; i >= 1 ; i--){

           for ( int j = 1 ; j<= n-i ; j++){
               System.out.print(" ");
           }
           for ( int j = 1 ; j<=i ; j++){
               System.out.print(i + " ");
           }
           System.out.println();
       }


//       Pattern:- 9              [ HALF PYRAMID ]
       System.out.print("\n HALF PYRAMID \n \n");

       for ( int i = 1; i <= n ; i++){

           for ( int j = 1; j <= n-i ; j++){
               System.out.print(" ");
           }
           for ( int j = 1 ; j <= i ; j++){
               System.out.print(j + " ");
           }
           System.out.println();

       }

//        Pattern:- 10
       System.out.println( " \n INVERTED HALF PYRAMID \n");

       for ( int i = 1; i <= n ; i++ ){

           for ( int j = n; j >= i ; j--){
               System.out.print(i + " ");
           }
           System.out.println();

       }

//       Pattern:- 11
       System.out.print("\n PASCALS TRIANGLE \n");
//       Find its logic
//       1
//       11
//       121
//       1331
//       14641


   }
}

