package org.example.chapter8;

public class RationalNumbers {

    static class Rational {
        private int numRtr;
        private int deNmtr;

        public Rational(int numRtr, int deNmtr) {
            if (deNmtr == 0) {
                deNmtr = 1;
            }
            int gcd = gcd(numRtr, deNmtr);
            this.numRtr = numRtr / gcd;
            this.deNmtr = deNmtr / gcd;

            if (this.deNmtr < 0) {
                this.numRtr *= -1;
                this.deNmtr *= -1;
            }
        }

        public Rational() {
            this(0, 1);
        }

        private int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static Rational add(Rational a, Rational b) {
            int num = a.numRtr * b.deNmtr + b.numRtr * a.deNmtr;
            int den = a.deNmtr * b.deNmtr;
            return new Rational(num, den);
        }

        public static Rational subtract(Rational a, Rational b) {
            int num = a.numRtr * b.deNmtr - b.numRtr * a.deNmtr;
            int den = a.deNmtr * b.deNmtr;
            return new Rational(num, den);
        }

        public static Rational multiply(Rational a, Rational b) {
            return new Rational(a.numRtr * b.numRtr, a.deNmtr * b.deNmtr);
        }

        public static Rational divide(Rational a, Rational b) {
            return new Rational(a.numRtr * b.deNmtr, a.deNmtr * b.numRtr);
        }

        public String toFractionString() {
            return numRtr + "/" + deNmtr;
        }

        public String toFloatString(int precision) {
            double value = (double) numRtr / deNmtr;
            return String.format("%." + precision + "f", value);
        }
    }

    public static void main(String[] args) {
        Rational r1 = new Rational(2, 4);
        Rational r2 = new Rational(3, 6);

        Rational sum = Rational.add(r1, r2);
        Rational diff = Rational.subtract(r1, r2);
        Rational prod = Rational.multiply(r1, r2);
        Rational quot = Rational.divide(r1, r2);

        System.out.println("r1: " + r1.toFractionString());
        System.out.println("r2: " + r2.toFractionString());
        System.out.println("Sum: " + sum.toFractionString());
        System.out.println("Diff: " + diff.toFractionString());
        System.out.println("Product: " + prod.toFractionString());
        System.out.println("Quotient: " + quot.toFractionString());
        System.out.println("r1 float: " + r1.toFloatString(2));
    }
}
