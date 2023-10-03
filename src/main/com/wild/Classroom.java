package com.wild;

public class Classroom {
    public static void main(String[] args) {

        Wilder jeannot = new Wilder("Jeannot", true);
        Wilder archibald = new Wilder("Archibald", false);


        System.out.println(jeannot.whoAmI());
        System.out.println(archibald.whoAmI());
    }
}
