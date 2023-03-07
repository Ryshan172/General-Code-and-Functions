import java.awt.desktop.SystemEventListener;
import java.util.Locale;

public class Functions {
    public static void main(String[] args) {

        //diosWorld();
        //practiceFunctions();
        //practiceVariables();
        //practiceStringsA();
        //practiceStringsB();
        //practiceBool();

        //practiceLoops();
        //pracForLoops();


    }



    private static void pracForLoops() {
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

         */

        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

    }



    private static void practiceLoops() {
        // While loops
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do While Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

    }



    private static void practiceBool() {
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        // Switch
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // Outputs "Thursday" (day 4)


        String result = "No";
        switch (result){
            case "No":
                System.out.println("Not");
                break;

            case "Yes":
                System.out.println("Definitely");
                break;


        }



    }

    private static void practiceStringsB() {
        // Concatenation
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        // Random numbers
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

    }

    private static void practiceStringsA() {
        // Practice string operations
        String word = "HHjdjijdijifjiajf";
        int result = word.length();
        String resb = word.toLowerCase();
        String resc = word.toUpperCase();

        System.out.println(result);
        System.out.println(resb);
        System.out.println(resc);

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
    }

    private static void practiceVariables(){
        int a,b,c ;
        a = 5;
        b = 10 ;
        c = 15;

        System.out.println(a+b+c);

        String greeting, myName, mySurname;
        greeting = "Hello ";
        myName = "Ryshan";
        mySurname = "Ramlall";

        System.out.println(greeting + myName + " " + mySurname);

        int x = 10;
        x += 5;
        int y = 20;
        System.out.println(x);
        System.out.println(y > x);



    }

    private static void practiceFunctions() {
        // Printing numbers
        System.out.println(3+3);

        // Declaring Variables
        String name = "John Cena";
        Integer num = 5;

        System.out.println(name);
        System.out.println(num);

    }

    private static void diosWorld() {
        System.out.println("Za Warudo!");
        System.out.println("Shinei Kakyoin!");
        System.out.println("Kono Dio Da!");
    }
}

