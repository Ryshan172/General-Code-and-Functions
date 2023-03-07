package classesmain;

/*
    a static method, which means that it can be accessed without creating an object of the class,
    unlike public, which can only be accessed by objects:

    The dot (.) is used to access the object's attributes and methods.
 */

public class ClassMethods {
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        ClassMethods myCar = new ClassMethods();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }


}
