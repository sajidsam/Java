package org.example.chapter8;

public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        commissionEmployee = new CommissionEmployee(first, last, ssn, sales, rate);
        baseSalary = salary >= 0.0 ? salary : 0.0;
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary >= 0.0 ? salary : 0.0;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary + commissionEmployee.earnings();
    }

    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried", commissionEmployee.toString(), "base salary", baseSalary);
    }

    private static class CommissionEmployee {
        private String firstName;
        private String lastName;
        private String ssn;
        private double grossSales;
        private double commissionRate;

        public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
            firstName = first;
            lastName = last;
            this.ssn = ssn;
            grossSales = sales >= 0.0 ? sales : 0.0;
            commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
        }

        public void setGrossSales(double sales) {
            grossSales = sales >= 0.0 ? sales : 0.0;
        }

        public void setCommissionRate(double rate) {
            commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
        }

        public double earnings() {
            return commissionRate * grossSales;
        }

        public String toString() {
            return String.format("%s %s\n%s: %s\n%s: %.2f\n%s: %.2f", firstName, lastName, "SSN", ssn, "Gross sales", grossSales, "Commission rate", commissionRate);
        }
    }

    public static void main(String[] args) {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Sajid", "Islam", "123-45-6789", 10000, 0.06, 500);
        System.out.println(emp);
        System.out.println("Earnings: " + emp.earnings());
    }
}
