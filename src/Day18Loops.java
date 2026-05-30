
public class Day18Loops{
    public static void main(String[] args){

//        For Loops
        /*
        *   for ( initialisation start from ; condition kab tak chalana chaiye; updation next chance me kya changes chaiye){
        *       print what you want
        *       }
        * */
        for (int i = 1; i<=100 ;i++) {
            System.out.println(i);
        }

        for (int count =0; count<=10 ; count=count+1){
            System.out.println("Ayush");
        }

//         While Loop
            /*
            *   initialisation
            *  while ( condition ){
            *         print what you want as output
            *         i=i+1;  or i++;
            *     }
            * */
        int j = 100;
        while (j>=0){
            System.out.println(j);
             j=j-1;}


//          Do While Loop
        /*
        *    initialisation
        *    do { what you want to do or print
        *    } while ( condition )
        * */

        int k = 201;
        do {
            System.out.println(k);
            k++;
        } while (k<=300);



//        A small difference between while loop andd do while loops
        int p = 15;
        while (p<12){
            System.out.println("The end");
        }

        do {
            System.out.println("The End");
        }while (p<12);

//      here you will observe that the statement in do while loop gets printed once although the condition is not met or false
//      but for same in while loop the statement was not printed this is because
//      in while loop it checks for the condition first then print our statements but in do while loop it first print our statement and then it checks for the condition



//        Concept of infinite loop
        for ( ; ; ){
            System.out.println("Hello World");
        }
        /*                                              [ THE CONCEPT OF INFINITE LOOP ]
        * A standard for loop in java requires three parts ( initialization ; condition ; increament/decrement ) . if you skip these and leave it blank
        * No initialization: java skips creating a counter variable
        * no condition: java thinks no condition is written so it marks blank space as true
        * no updation: java skips updating any counter variable .
        * As this condition is permanently evaluated as true so java will continuously print hello world forever, until we manualy force the program to stop
        * */

    }
}