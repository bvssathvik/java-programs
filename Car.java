class Car {
    // Attributes (Instance Variables)
    String carName;  // Name of the car model
    String carBrand; // Brand of the car
    String fuelType; // Type of fuel the car uses
    double mileage;  // Mileage of the car in km/l or miles per charge

    // Constructor: Initializes the Car object with given attributes
    public Car(String carName, String carBrand, String fuelType, double mileage) {
        this.carName = carName;
        this.carBrand = carBrand;
        this.fuelType = fuelType;
        this.mileage = mileage;
        System.out.println("Welcome to Car Garage");
    }

    // Method to start the car
    void start() {
        System.out.println(carName + " is starting...");
    }

    // Method to stop the car
    void stop() {
        System.out.println(carName + " is stopping...");
    }

    // Method to service the car
    void service() {
        System.out.println(carName + " is under service.");
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Creating objects (instances of the Car class)
        Car car1 = new Car("Model S", "Tesla", "Electric", 400);
        Car car2 = new Car("Civic", "Honda", "Petrol", 35);
        Car car3 = new Car("Fortuner", "Toyota", "Diesel", 12);

        // Testing the methods for each car
        car1.start();
        car1.stop();
        car1.service();
        
        car2.start();
        car2.stop();
        car2.service();
        
        car3.start();
        car3.stop();
        car3.service();
    }
}
