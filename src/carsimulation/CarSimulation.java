/*
Name: Oratile
Surname: Mmusi 
Student number: ST10312691
Descrption: Lab4_Homework
Due date: 07 August 2024
 */
package carsimulation;

/**
 *
 * @author orati
 */
public class CarSimulation {

   // Inner Car class
    static class Car {
        private double speed; // Current speed of the car
        private double totalDistance; // Total distance traveled by the car

        public Car() {
            this.speed = 0;
            this.totalDistance = 0;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public double getSpeed() {
            return this.speed;
        }

        public double getTotalDistance() {
            return this.totalDistance;
        }

        public void accelerate(double increment) {
            this.speed += increment;
        }

        public void decelerate(double decrement) {
            this.speed -= decrement;
            if (this.speed < 0) {
                this.speed = 0;
            }
        }

        public void travel(double hours) {
            this.totalDistance += this.speed * hours;
        }
    }

    // Main method to demonstrate the functionality of the Car class
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Set the speed and distance to zero
        myCar.setSpeed(0);
        myCar.travel(0); // Distance is already zero, this is just to be explicit

        // Print the current speed and total distance traveled
        System.out.println("Current speed: " + myCar.getSpeed() + " units");
        System.out.println("Total distance traveled: " + myCar.getTotalDistance() + " units");

        // Accelerate the car by 50 units
        myCar.accelerate(50);

        // Travel a distance of 2.5 hours
        myCar.travel(2.5);

        // Print the current speed and total distance traveled
        System.out.println("After acceleration and 2.5 hours of travel:");
        System.out.println("Current speed: " + myCar.getSpeed() + " units");
        System.out.println("Total distance traveled: " + myCar.getTotalDistance() + " units");

        // Decelerate the car by 15 units
        myCar.decelerate(15);

        // Travel an additional distance of 1.5 hours
        myCar.travel(1.5);

        // Print the current speed and total distance traveled
        System.out.println("After deceleration and an additional 1.5 hours of travel:");
        System.out.println("Current speed: " + myCar.getSpeed() + " units");
        System.out.println("Total distance traveled: " + myCar.getTotalDistance() + " units");
    }
}