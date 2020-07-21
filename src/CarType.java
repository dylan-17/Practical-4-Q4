
public class CarType {
    private String make;
    private String model;
    private double capicity;

    public CarType(String make, String model, double capicity) {
        this.make = make;
        this.model = model;
        this.capicity = capicity;
    }
    
    public String toString(){
        return String.format("%-10s %-10s %-10s", this.make, this.model, this.capicity);
    }
    
}
