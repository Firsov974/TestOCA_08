package org.ash;

public class TestTernary_01 {

    public static void main(String[] args) {
        int bill = 2000;
        int discount = (bill > 2000)? bill-150 : bill - 100;
        System.out.println(discount);
    }
}
