package entities;

public class Individual extends TaxPayer {

    private double halthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, double halthExpenditures) {
        super(name, anualIncome);
        this.halthExpenditures = halthExpenditures;
    }

    public double getHalthExpenditures() {
        return halthExpenditures;
    }

    public void setHalthExpenditures(double halthExpenditures) {
        this.halthExpenditures = halthExpenditures;
    }

    @Override
    public double tax() {
        double tax;
        if (getAnualIncome() < 20000.0) {
            tax = getAnualIncome() * 0.15;
        } else {
            tax = getAnualIncome() * 0.25;
        }

        if (halthExpenditures > 0) {
            tax -= halthExpenditures * 0.5;
        }

        return tax;
    }
}
