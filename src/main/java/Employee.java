abstract class Employee {

    private String name;
    private String email;
    private Double salary;

    protected Double discountedSalary;





    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.discountedSalary = setDiscount(salary);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public Double setDiscount(Double salary) {

        return salary;
    }
}
