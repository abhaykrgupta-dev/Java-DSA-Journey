
public class Day15WaysOfPrintingOutput {

    public static void main (String[] args){

//        Three Ways Of Printing In Java

        System.out.print("Hello World");
        System.out.print(" Hii There");

        System.out.println("Hello World !");
        System.out.println("Hey Guys");

        System.out.print("Hello World\nHey Buddy ");   // here \n works as a br tag as it breaks line
        System.out.print("50\n51\n52\n53\n54\n55\n");

//        Simple Task
//        Print the above
//        *
//        **
//        ***
//        ****


        // Method 1
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        // Method 2   [ The Cleaner Version ]
        System.out.print("*\n**\n***\n****");

    }
}