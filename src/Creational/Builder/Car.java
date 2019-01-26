package Creational.Builder;

public class Car {

    // Required Fields
    private int fuel;
    private int color;

    // Optional Parameters
    private boolean isHybrid;
    private boolean isTurbo;

    private Car(CarBuilder builder) {
        this.fuel = builder.fuel;
        this.color = builder.color;
        this.isHybrid = builder.isHybrid;
        this.isTurbo = builder.isTurbo;
    }

    @Override
    public String toString() {
        return "Fuel: " + fuel + ", Color: " + color + ", isHybrid: " + isHybrid + ", isTurbo: " + isTurbo;
    }

    public static class CarBuilder {
        private int fuel;
        private int color;

        // Optional Parameters
        private boolean isHybrid;
        private boolean isTurbo;

        // Initialize the required fields
        public CarBuilder(int fuel, int color) {
            this.fuel = fuel;
            this.color = color;
        }

        public CarBuilder setHybrid(boolean hybrid) {
            isHybrid = hybrid;
            return this;
        }


        public CarBuilder setTurbo(boolean turbo) {
            isTurbo = turbo;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
