package org.example.chapter8;

public class EnhanceClassTime {
    private int h;
    private int m;
    private int s;

    public EnhanceClassTime(int hh, int mm, int ss) {
        h = (hh >= 0 && hh < 24) ? hh : 0;
        m = (mm >= 0 && mm < 60) ? mm : 0;
        s = (ss >= 0 && ss < 60) ? ss : 0;
    }

    public void tick() {
        s++;
        if (s == 60) {
            s = 0;
            incMin();
        }
    }

    public void incMin() {
        m++;
        if (m == 60) {
            m = 0;
            incHour();
        }
    }

    public void incHour() {
        h++;
        if (h == 24) {
            h = 0;
        }
    }

    public String show() {
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public static void main(String[] args) {
        EnhanceClassTime t1 = new EnhanceClassTime(11, 59, 59);
        System.out.println("before tick: " + t1.show());
        t1.tick();
        System.out.println("after tick : " + t1.show());

        EnhanceClassTime t2 = new EnhanceClassTime(5, 59, 0);
        System.out.println("before min+: " + t2.show());
        t2.incMin();
        System.out.println("after min+ : " + t2.show());

        EnhanceClassTime t3 = new EnhanceClassTime(23, 0, 0);
        System.out.println("before hr+: " + t3.show());
        t3.incHour();
        System.out.println("after hr+ : " + t3.show());
    }
}
