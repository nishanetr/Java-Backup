import java.util.Scanner;

abstract class Employee {
    private String firstName;
    private String lastName;
    private  String ssn;
    private  double salaryForTheWeek;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public void setSalaryForTheWeek(double salaryForTheWeek) {
        this.salaryForTheWeek = salaryForTheWeek;
    }

    public void accept(Scanner sc) {
        System.out.println("Enter first name - ");
        this.firstName = sc.next();

        System.out.println("Enter last name - ");
        this.lastName = sc.next();

        System.out.println("Enter ssn - ");
        this.ssn = sc.next();
    }

    @Override
    public String toString() {
        return "firstName : " + firstName
                + "," +
                "lastName : " + lastName
                + "," +
                "ssn : " + ssn
                + "," +
                "salaryForTheWeek : " + salaryForTheWeek;
    }

    public abstract void calWeeklySalary();
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee() {

    }

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.println("Enter weekly salary : ");
        this.weeklySalary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{ " +
                super.toString()
                + "," +
                "weeklySalary : "
                + weeklySalary;
    }

    public void calWeeklySalary() {
        setSalaryForTheWeek(weeklySalary);
    }

}

class HourlyEmployee extends Employee {
    private double wagePerHr;
    private double hrsWorked;

    public HourlyEmployee() {
    }

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.println("Enter wage per hour : ");
        wagePerHr = sc.nextDouble();
        System.out.println("Enter no. of worked hours : ");
        hrsWorked = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString()
                + "," +
                "wagePerHr : " + wagePerHr
                + "," +
                "hrsWorked : " + hrsWorked;
    }

    public void calWeeklySalary() {
        double calculatedSalary;
            calculatedSalary = wagePerHr * hrsWorked;
            if(hrsWorked > 40) {
                calculatedSalary = calculatedSalary + ((wagePerHr * 0.5) * (hrsWorked - 40));
            }

            setSalaryForTheWeek(calculatedSalary);
    }
}

class CommEmployee extends Employee {
    private double commRate;
    private double grossSales;

    public CommEmployee() {

    }

    public double getCommRate() {
        return commRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.println("Enter commission rate : ");
        commRate = sc.nextDouble();
        System.out.println("Enter gross sales : ");
        grossSales = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString()
                + "," +
                "commRate : " + commRate
                + "," +
                "grossSales : " + grossSales;
    }

    public void calWeeklySalary() {
        double calculatedSalary;
        calculatedSalary = grossSales * (commRate / 100);
        setSalaryForTheWeek(calculatedSalary);
    }
}

class BaseSalariedCommEmployee extends CommEmployee {
    private double baseSalary;

    public BaseSalariedCommEmployee() {

    }

    @Override
    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.println("Enter Base salary : ");
        baseSalary = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString()
                + "," +
                "baseSalary : " + baseSalary;
    }

    public void calWeeklySalary() {
        double calculatedSalary;
        calculatedSalary = (baseSalary * 1.10) + (getGrossSales() * (getCommRate() / 100));
        setSalaryForTheWeek(calculatedSalary);
    }

}

