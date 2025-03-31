package main.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Halwai {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());

        if (samosa1 != s2) {
            System.out.println("Singleton pattern has been broken!");
        }

//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());
    }
}

/* How to break singleton
*
* 1. Reflection API
*
*
*
 */
