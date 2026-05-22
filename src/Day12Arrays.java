import java.util.Arrays;

public class Day12Arrays{
    public static void main(String[] args){

//        Till now we did this fo storing marks
        int Math=98;
        int physics = 89;
        int chemistry=90;
        int english=95;
        int computersci=99;

//        But now we can use arrays to simplify it
//        Arrays { non-primitive data type }

        int []marks = new int[5];       //we created an array named marks consisting of 5 diff containers of integer type ..
                                        // here the square bracket helps to determine that this is a list / array

        marks [0] = 98;                // java is a zeroth lvl lang so we defined here that in marks container store 98 at zeroth value
        marks [1] = 89;                // similarly at index 1 of marks variable we stored value 89
        marks [2] = 90;                // similarly here , 2nd index contains value 90 stored in marks variable
        marks [3] = 95;
        marks [4] = 99;

//        System.out.println(marks);      { here you will figure out we get an unexpected result i.e hash code it is because in java if we try to print array variable
//                                            it cannot print all array variable so it gives us a kind of hashcode
        System.out.println(marks[3]);   // we printed the 3rd index value stored in marks


//        We can further simplify arrays
        int []marks1 = {98 , 89, 90, 95, 99};
        System.out.println( marks1[1]);  // here we printed value stored in 1st index of marks1 array variable
        System.out.println(marks1[4]);   // here we printed the 4th index i.e 99 of marks1 array variable



//      java has initalisation that means if value is not given to an array it assign the default values to the arrays
//        for eg

        int [] age = new int[2];
        age [0] =55;
//        age [1] = 12;
        System.out.println(age [1]);  // here you will find that the default value will be assigned as 1st index of age array is commented out or not written and
                                      // the default value of int variable is '0'.

        boolean []isadult = new boolean[3];
        isadult [0] = true;      // we considered the age to be 55 so adult
        isadult [1] = false;    // we consider age to be 12 so its not adult

        System.out.println(isadult[2]);   // we can clearly see there is no 2nd index defined so java will print its default value for boolean variable i.e false



//      Two important functions for arrays

//        1) .LENGTH
        System.out.println(marks.length);   // we will get our output as 5 as the marks array has 5 values stored in the array


//        2) SORT

       //   Normal                             Ascending order after sorting

//        int []marks = new int[5];          int []marks = new int[5];
//        marks [0] = 98;                    marks [0] = 89;
//        marks [1] = 89;                    marks [1] = 90;
//        marks [2] = 90;                    marks [2] = 95;
//        marks [3] = 95;                    marks [3] = 98;
//        marks [4] = 99;                    marks [4] = 99;

        System.out.print( "before:- " );
        System.out.println(marks[3]);

        Arrays.sort(marks);    // for this to work we need to import the package java.util.Arrays
                               // after this the marks array will be in ascending order
        System.out.print("After:- ");
        System.out.println(marks[3]);  // you will note output as 98 but previously you got output 95 for the same 3rd index its due to sort function


//        2D Array
        int [][]studentmarks = {{97, 98,99,68,95},{96,55,46,88,79}}; // this is how we make an array to store 2 or more containers .
        System.out.println(studentmarks[0][2]);                      // we are printing the zeroth index , 2nd index value
        System.out.println( studentmarks[1][4]);                     // we are printing the first index , 4th index value


//      i came to hear about Arrays.toString()
//      so i need to look after this later
      }
}