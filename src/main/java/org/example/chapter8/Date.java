package org.example.chapter8;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(String monthName, int day, int year) {
        this.month = getMonthFromName(monthName);
        this.day = day;
        this.year = year;
    }

    public Date(int dayOfYear, int year) {
        this.year = year;
        this.month = (dayOfYear - 1) / 30 + 1;
        this.day = (dayOfYear - 1) % 30 + 1;
    }

    private int getMonthFromName(String monthName) {
        String[] months = {
                "january", "february", "march", "april", "may", "june",
                "july", "august", "september", "october", "november", "december"
        };
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i + 1;
                //pushing to github
            }
        }
        return -1;
    }

    public String toMMDDYYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public String toLongDate() {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1] + " " + day + ", " + year;
    }

    public String toDayOfYear() {
        return day + " " + year;
    }

    public static void main(String[] args) {
        Date date1 = new Date(12, 25, 2023);
        Date date2 = new Date("December", 25, 2023);
        Date date3 = new Date(359, 2023);

        System.out.println("Date 1 (MM/DD/YYYY): " + date1.toMMDDYYYY());
        System.out.println("Date 2 (Long format): " + date2.toLongDate());
        System.out.println("Date 3 (Day of Year): " + date3.toDayOfYear());
    }
}
