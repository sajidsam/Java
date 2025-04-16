package org.example.chapter9;

public class BasePlusCommissionEmployee {
    private CommissionEmployee emp;
    private double baseSalary;

    public BasePlusCommissionEmployee(String f, String l, String ssn, double sales, double rate, double salary) {
        emp = new CommissionEmployee(f, l, ssn, sales, rate);
        baseSalary = salary >= 0.0 ? salary : 0.0;
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary >= 0.0 ? salary : 0.0;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary + emp.earnings();
    }

    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried", emp.toString(), "base salary", baseSalary);
    }

    private static class CommissionEmployee {
        private String firstName;
        private String lastName;
        private String ssn;
        private double sales;
        private double rate;

        public CommissionEmployee(String f, String l, String ssn, double sales, double rate) {
            firstName = f;
            lastName = l;
            this.ssn = ssn;
            this.sales = sales >= 0.0 ? sales : 0.0;
            this.rate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
        }

        public void setSales(double sales) {
            this.sales = sales >= 0.0 ? sales : 0.0;
        }

        public void setRate(double rate) {
            this.rate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
        }

        public double earnings() {
            return rate * sales;
        }

        public String toString() {
            return String.format("%s %s\n%s: %s\n%s: %.2f\n%s: %.2f", firstName, lastName, "SSN", ssn, "Gross sales", sales, "Commission rate", rate);
        }
    }

    public static void main(String[] args) {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Sajid", "Islam", "123-45-6789", 10000, 0.06, 500);
        System.out.println(emp);
        System.out.println("Earnings: " + emp.earnings());
    }
}
