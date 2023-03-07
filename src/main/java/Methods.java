import java.util.Scanner;

public class Methods {

    // Supplying parameters to method and then calling it
    static void PrintStuff (String name, int age){
        System.out.println(name + ":" + age);

    }

    static void PrintOther (int number){
        /*
         Prints number from other function
         */

        System.out.println("Is this your number: " + number);
    }

    static int GetNumber(){
        /*
        Get number from user input
         */
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter number");
        int number = Integer.parseInt(myNumber.nextLine());

        return number;

    }



    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String name = myObj.nextLine();

        PrintStuff(name,5);

        int number = GetNumber();

        PrintOther(number);



    }

}
