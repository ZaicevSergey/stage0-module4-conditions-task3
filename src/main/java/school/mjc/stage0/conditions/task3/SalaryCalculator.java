package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxPercentage;
        if (salary <= 0) {
            System.out.println("wrong input!");
            return;
        } else if (salary <= 10000) {
            taxPercentage = 0.15;
        } else if (salary <= 20000) {
            taxPercentage = 0.18;
        } else {
            taxPercentage = 0.2;
        }
        double taxAmount = taxPercentage * salary;
        double netSalary = salary - taxAmount;
        System.out.println(netSalary);
    }
}
