package org.example.chapter8;

public class HugeInt {

    private int[] digits = new int[40];

    public void parse(String num) {
        num = num.replaceFirst("^0+(?!$)", "");
        int len = num.length();
        if (len > 40) len = 40;
        for (int i = 0; i < len; i++) {
            char ch = num.charAt(num.length() - len + i);
            if (Character.isDigit(ch)) {
                digits[40 - len + i] = ch - '0';
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int digit : digits) {
            if (digit != 0) leadingZero = false;
            if (!leadingZero) sb.append(digit);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public HugeInt add(HugeInt other) {
        HugeInt result = new HugeInt();
        int carry = 0;
        for (int i = 39; i >= 0; i--) {
            int sum = this.digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    public HugeInt subtract(HugeInt other) {
        HugeInt result = new HugeInt();
        int brw = 0;
        for (int i = 39; i >= 0; i--) {
            int diff = this.digits[i] - other.digits[i] - brw;
            if (diff < 0) {
                diff += 10;
                brw = 1;
            } else {
                brw = 0;
            }
            result.digits[i] = diff;
        }
        return result;
    }

    public boolean isEqualTo(HugeInt other) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] != other.digits[i]) return false;
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInt other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInt other) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] > other.digits[i]) return true;
            else if (this.digits[i] < other.digits[i]) return false;
        }
        return false;
    }

    public boolean isLessThan(HugeInt other) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] < other.digits[i]) return true;
            else if (this.digits[i] > other.digits[i]) return false;
        }
        return false;
    }

    public boolean grtrEql(HugeInt other) {
        return isGreaterThan(other) || isEqualTo(other);
    }

    public boolean lessEql(HugeInt other) {
        return isLessThan(other) || isEqualTo(other);
    }

    public boolean isZero() {
        for (int digit : digits) {
            if (digit != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        HugeInt num1 = new HugeInt();
        HugeInt num2 = new HugeInt();

        num1.parse("1234567890123456789012345678901234567890");
        num2.parse("999999999999999999999999999999999999999");

        HugeInt sum = num1.add(num2);
        HugeInt diff = num1.subtract(num2);

        System.out.println("Num1: " + num1.toString());
        System.out.println("Num2: " + num2.toString());
        System.out.println("Sum: " + sum.toString());
        System.out.println("Diff: " + diff.toString());
        System.out.printf("Is Equal: %b\n", num1.isEqualTo(num2));
        System.out.printf("Is Not Equal: %b\n", num1.isNotEqualTo(num2));
        System.out.printf("Is Greater: %b\n", num1.isGreaterThan(num2));
        System.out.printf("Is Less: %b\n", num1.isLessThan(num2));
        System.out.printf("Is Zero (num1): %b\n", num1.isZero());
    }
}
