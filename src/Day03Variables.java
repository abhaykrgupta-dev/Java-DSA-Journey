
public class Day03Variables{
    public static void main (String[] args){
        // Now lets understand variable
        // Variables are like containers in which we store data
        /* Always remember while defining a variable we should first define which type of data is going to be stored in our variable i.e dataTypes
        *  then we can use variable name eg I used Name here -- in case of String variable we need to give "Double quotes" this orelse we will get error when we use space
        */
        String Name = "Abhay Kumar Gupta";
        int age = 19;
        // here int is the data type
        // age is variable name which is case sensitive
        // 19 is the actual data which is being stored
        // on combing we get ek dabba banao jiska name age rakho , usme sirf integers rakhunga ur abhi filhal usme 19 store kro
        double Height = 5.9;

        // here this "String Name" , "int age" , "double Height" yeh sab variables hai ur inki value "Abhay Kumar Gupta" , "19" ur "5.9" hai .
        // variable name hi variable ko represent krta hai

        //Eg:- batao int num = 128; mai variable kya hai?
        // num variable hai , int uska type hai , 128 uski value hai ,
        long mobile =1234567896L;
        //we can also use  boolean , float .

        String x = "xyz";
        byte a = 28;
        char b = '@';
        short cd = 12;
        float pi= 3.14F;

        //remember when you use char dont forget to use '' this i mean dont forget to use single quotes

        System.out.println("My name is "+Name);
        System.out.println("I am "+ age + " years old");
        System.out.println("My height is " + Height + " Feet");
        System.out.println("Mobile no :- " + mobile );
        System.out.println("Email:- " +x+cd+a+b+"gmail.com");

//        DataTypes
        /* There are two types of data types :- primitive and non primitive datatypes
        *
        * 1)Primitive Data Type    [ Basic data types ]
        * there are major 8 types of primitive datatypes in java . they are :-
        * byte
        * int
        * float
        * double
        * char
        * short
        * long
        * boolean
        *
        * 2) Non-Primitive DataTypes    [ we can customize or make our own datatypes
        * Some of the major eg are:-
        * String
        * Array
        * Class
        * Object
        * Interface
        *
        * */

//        An important Concept
        int a1 = 50;
        int b1 = 28;
        System.out.println(a+b);
        String name="tonny stark";
        System.out.println(name);

        a1=180;
        b1=8989;
        System.out.println(a+b);
        name="ironman";
        System.out.println(name);

        // if you analyze the above code you will note that the variable value is changed and the change is visible only if you print the variable after assigning new value
        // or else it will show the previous one only

    }
}