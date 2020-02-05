package com.company;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        boolean shouldWakeUp = false;
        if ((hourOfDay >= 0) && (hourOfDay <= 23)) {
            if ((hourOfDay < 8) || (hourOfDay > 22)) {
                if (isBarking) shouldWakeUp = true;
            }
        }
        return shouldWakeUp;
    }
}
