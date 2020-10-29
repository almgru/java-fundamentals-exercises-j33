package se.lexicon.almgru;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        // 1. Create a String with your first name as content. Print out the String object to the console.
        String name = "Daniel";
        System.out.println(name);

        /* 2. Create two Strings. One with your first name and the other with your last name. Print out both Strings to
         * the console with a ” ” separating them. */
        String firstName = "Daniel";
        String lastName = "Alm Grundström";
        System.out.println(firstName + " " + lastName);

        /* 3. Create two variables with decimal values. Create a third decimal variable called result. Assign the sum of
         * the two first variables to result. */
        double value1 = 1.2;
        double value2 = 2.3;
        double result = value1 + value2;

        // 4b. Instantiate an Object of the class and assign values to the object.
        Car car = new Car();
        car.brand = "Volvo";
        car.registrationNumber = "ABC123";
        car.maxSpeed = 140;
        car.ownerName = "Daniel";
    }
}

/* 4a. Create a class called Car. The class should contain the following information. Car brand, registration number,
 * max speed and owner name.*/
class Car {
    String brand;
    String registrationNumber;
    int maxSpeed;
    String ownerName;
}
