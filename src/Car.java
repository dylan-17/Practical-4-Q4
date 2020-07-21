
public class Car {
    private String PlateNo;
    private String color;
    private int year;


    public Car(String PlateNo, String color, int year) {
        this.PlateNo = PlateNo;
        this.color = color;
        this.year = year;

    }
    
    public String toString() {
        return String.format("%%-11s %-10s %5d ", PlateNo, color, year);
    }
    
}
