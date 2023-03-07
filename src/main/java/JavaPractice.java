public class JavaPractice {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //breakLoop();
        //continueLoop();

        String res = pracArrays();
        System.out.println(res);


    }

    private static String pracArrays() {


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        return cars[1];


    }

    public static void breakLoop(){

        // This example stops the loop when i is equal to 4:

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void continueLoop(){
        // This example skips the value of 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }





}
