package entities;

public class Currency {
    public static double IOF = 0.06;
    public static double converter(double dollar, double quantity){
        double preConverted = dollar * quantity ;
        return preConverted * IOF + preConverted;
    };
}
