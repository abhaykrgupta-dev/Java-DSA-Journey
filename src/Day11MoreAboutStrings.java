

public class Day11MoreAboutStrings{
    public static void main (String[] args){

//        Variables
//        Non-Primitive
//        Strings

        String Firstname = " Abhay ";
        String MiddleName = "Kumar";
        String LastName = " Gupta ";
        String FatherName = new String(" Naresh Kumar ");
        System.out.println("Name:-" + Firstname);
        System.out.println("Father's Name:-" + FatherName);

//        Methods
//        Concatenate / Addition of String

        String FullName = Firstname + MiddleName + LastName ;
        System.out.println( "Full Name:-" + FullName);

//        .Length / To calculate length of the value stored in variable

        System.out.println(LastName.length());
        // length will come out to be 7 as there are 2 space given which are included while counting

//        .charAt / Used to find The exact character in given position

        System.out.println(FatherName.charAt(10));
        // charAt / Java is a zeroth index language so counting must begin from zero

//        .replace / Used to replace particular character
        String name = "Look";
        String NewName = name.replace('L' , 'B');
        System.out.println(NewName);
        // by this method we can only replace one character we cannot replace two characters with one or two also

//        .Substring / Used to showcase small part of a huge string
        // FullName = Abhay Kumar Gupta
        // always remember substring works like [7 , 12 ) which means 7th index is included but 12th index is not included
        System.out.println(FullName.substring(7 , 12 ));


    }
}