package org.ash;

public class TestTernary_02 {
    public static void main(String[] args) {
        int bill = 2000;
        int discount = (bill > 2000)? getSpecDisc(): getRegDisc();
        System.out.println(discount);
    }
    static int getRegDisc() {
        return 11;
    }
    static int getSpecDisc() {
        return 15;
    }
}
