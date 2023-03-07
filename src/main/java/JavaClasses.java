public class JavaClasses {
    int x = 5;

    //  String username = "Ryshan";

    // Cannot change value of a final attribute
    final String username = "Kira Yoshikage";

    public static void main(String[] args) {
        // Creates new object assigned to this class
        JavaClasses myObj = new JavaClasses();

        // Can now call the attributes from the object
        System.out.println(myObj.x);

        // Can also change the value
        //myObj.username = "yes";

        //But if I do it this way, it won't work, because it always calls the object tied to the class value
        String username = "NO";

        System.out.println(myObj.username);
    }
}

