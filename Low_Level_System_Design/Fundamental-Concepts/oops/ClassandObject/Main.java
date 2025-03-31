public class Main {
    public static void main(String[] args) {
        //Creating an Object
        Car car1 = new Car("Corolla", "Toyota", "Black", 2021);
        Car car2 = new Car("Mustang", "Ford", "White", 2020);
        Car car3 = new Car("Ferrari", "Ferrari", "Red", 2015);

        car1.displayInfo();
        System.out.println("---------------------");
        car2.displayInfo();
        System.out.println("---------------------");        
        car3.displayInfo();
        System.out.println("---------------------");        
    }
}
