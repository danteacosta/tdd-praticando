package calculator;

import calculator.Employee;

public class Manager extends Employee {
    public Manager(String name, String email, Double salary) {
        super(name, email, salary);
    }
    public Double setDiscount(Double salary) {
        if (salary >= 5000) {
            return salary * 0.7;
        } else {
            return salary * 0.8;
        }
    }
}
