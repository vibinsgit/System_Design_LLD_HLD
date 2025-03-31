public class Car {
    //Attributes
    private String model;
    private String brand;
    private String color;
    private int year;

    //Constructor
    public Car(String model, String brand, String color, int year) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    //Method
    public void displayInfo() {
        System.out.println("Car Model : " + model);
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Color : " + color);
        System.out.println("Car Year : " + year);
    }
}