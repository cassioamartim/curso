package test_1;

import test_1.entity.Toggles;

public class Test {
    public static void main(String[] args) {
        Toggles t1 = new Toggles();
        System.out.println("Test 1: " + t1);

        Toggles t2 = new Toggles();
        t2.setTest2(true);

        System.out.println("Test 2: " + t2);

        // Compare
        System.out.println("Compare Toggles -> " + t1.equals(t2));
    }
}
