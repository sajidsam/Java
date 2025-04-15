package org.example.chapter8;

public class SavingsAccount {
    private static double rate;
    private double bal;

    public SavingsAccount(double b) {
        bal = b;
    }

    public void calcInterest() {
        double i = (bal * rate) / 12;
        bal += i;
    }

    public static void setRate(double r) {
        rate = r;
    }

    public double getBal() {
        return bal;
    }

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(2000);
        SavingsAccount s2 = new SavingsAccount(3000);

        setRate(0.04);

        System.out.println("monthly update with 4%:");
        for (int m = 1; m <= 12; m++) {
            s1.calcInterest();
            s2.calcInterest();
            System.out.println("m" + m + " - s1: $" + s1.getBal() + " | s2: $" + s2.getBal());
        }

        setRate(0.05);

        s1.calcInterest();
        s2.calcInterest();

        System.out.println("after 13th month at 5%:");
        System.out.println("s1: $" + s1.getBal());
        System.out.println("s2: $" + s2.getBal());
    }
}
