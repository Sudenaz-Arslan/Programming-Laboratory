
package lab;
//week 3 
public class Car {
    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0; 
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        double requiredFuel = km / 10.0; 
        
        if (requiredFuel > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            mileage += km;
            fuelLevel -= requiredFuel;
            System.out.println("Driving " + km + " km."); 
        }
    }

    public void refuel(double amount) {
        if (fuelLevel + amount > tankCapacity) {
            double addedFuel = tankCapacity - fuelLevel;
            fuelLevel = tankCapacity; 
            System.out.println("Tank is full, extra fuel discarded. Refueled " + addedFuel + " liters.");
        } else {
            fuelLevel += amount;
            System.out.println("Refueling " + amount + " liters.");
        }
    }

    public void checkStatus() {
        System.out.println("Mileage: " + mileage + " km, Fuel level: " + fuelLevel + " liters.");
        
        if (fuelLevel < (tankCapacity * 0.10)) {
            System.out.println("Low fuel warning!");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("38 SS 33", "Toyota ", 20.0, 50.0);

        System.out.println("--- Initial Status ---");
        myCar.checkStatus();

        myCar.drive(120); 
        myCar.checkStatus();

        myCar.drive(100); 
        myCar.checkStatus();

        myCar.refuel(60); 
        myCar.checkStatus();

        myCar.drive(470); 
        myCar.checkStatus();
    }
}