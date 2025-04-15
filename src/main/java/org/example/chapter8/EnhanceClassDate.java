package org.example.chapter8;

public class EnhanceClassDate {
    private int hour;
    private int minute;
    private int second;

    public EnhanceClassDate() {
        this(0, 0, 0);
    }

    public EnhanceClassDate(int h) {
        this(h, 0, 0);
    }

    public EnhanceClassDate(int h, int m) {
        this(h, m, 0);
    }

    public EnhanceClassDate(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        if (h >= 0 && h < 24) hour = h;
        else throw new IllegalArgumentException("hour must be 0-23");
    }

    public void setMinute(int m) {
        if (m >= 0 && m < 60) minute = m;
        else throw new IllegalArgumentException("minute must be 0-59");
    }

    public void setSecond(int s) {
        if (s >= 0 && s < 60) second = s;
        else throw new IllegalArgumentException("second must be 0-59");
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            incrementMinute();
        }
    }

    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour() {
        hour++;
        if (hour == 24) hour = 0;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                (hour == 0 || hour == 12) ? 12 : hour % 12,
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        EnhanceClassDate t = new EnhanceClassDate(23, 59, 59);
        System.out.println("Before: " + t.toUniversalString());
        t.tick();
        System.out.println("After : " + t.toUniversalString());

        t = new EnhanceClassDate(12, 59, 59);
        t.tick();
        System.out.println("Next hr: " + t.toUniversalString());

        t = new EnhanceClassDate(1, 0, 59);
        t.tick();
        System.out.println("Next min: " + t.toUniversalString());
    }
}
