package main.Singleton;


public class Samosa {
    private static Samosa samosa;

    // constructor
    private Samosa(){

    }

    // Lazy initialization
    public static Samosa getSamosa(){
        // object of this class
        if (samosa == null) {
            samosa = new Samosa();
        }
        return samosa;
    }
}

/*
*
* 1. Constructor private - to restrict object creation
*
* 2. create object with the help of factory method
*
* 3. create field to store object is private.
*
 */

/*
* Disadvantages of Lazy initialization
*
* 1. It is not thread safe if multiple threads are operating
*
 */