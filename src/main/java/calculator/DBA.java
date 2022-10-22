package calculator;

import calculator.Employee;

public class DBA extends Employee {
    public DBA(String name, String email, Double salary) {
        super(name, email, salary);
    }
    public Double setDiscount(Double salary) {
        if (salary >= 2000) {
            return salary * 0.75;
        } else {
            return salary * 0.85;
        }
    }
}

