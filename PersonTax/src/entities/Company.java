package entities;

public class Company extends TaxPayer {

    private Integer employeesNumber;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public double tax() {
        double tax;
        if (employeesNumber > 10) {
            tax = getAnualIncome() * 0.14;
        } else {
            tax = getAnualIncome() * 0.16;
        }

        return tax;

    }
}
