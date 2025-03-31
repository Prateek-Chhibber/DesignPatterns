package main.Singleton;

public class Jalebi {

    //Eager way of creating singleton object
    private static Jalebi jalebi = new Jalebi();

    /*
    * Disadvantages of Eager way
    * 1. Performance issue in large application
    *
    */
    public static Jalebi getJalebi(){
        return jalebi;
    }
}

