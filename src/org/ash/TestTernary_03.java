package org.ash;

public class TestTernary_03 {
    public static void main(String[] args) {
        int bill = 2000;
        int qty = 10;
        int discount = (bill > 1000)? (qty > 11)? 10 : 9 : 5;
        System.out.println(discount);
    }
}
