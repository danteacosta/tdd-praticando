public class Developer extends Employee {
    public Developer(String name, String email, Double salary) {
        super(name, email, salary);

    }
    public Double setDiscount(Double salary) {
        if (salary >= 3000) {
            return salary * 0.8;
        } else {
            return salary * 0.9;
        }
    }
}
