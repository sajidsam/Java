package org.example.chapter6;

public class TableOfBin {
    public static void main(String[] args) {
        System.out.println("Decimal   Binary     Octal     Hex");

        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase();


            System.out.println(i + "        " + binary + "     " + octal + "     " + hex);
        }
    }
}
