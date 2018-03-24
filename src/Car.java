public class Car {


    private String brand;
    private String model;
    private String colour;
    private String registrationNumber;
    private int power;
    private int vin;
    private int rentPrice;
    private int engineCapacity;
    private int fuelConsumption;

    public Car(String brand, String model, String colour, String registrationNumber, int power, int engineCapacity, int fuelConsumption, int rentPrice) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.registrationNumber = registrationNumber;
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.fuelConsumption = fuelConsumption;
        CarRepository.carsList.add(this);
    }

    public Car(CarDataWrapper carDataWrapper){
        this.brand = carDataWrapper.brand;
        this.model = carDataWrapper.model;
        this.colour = carDataWrapper.colour;
        this.registrationNumber = carDataWrapper.registrationNumber;
        this.power = carDataWrapper.power;
        this.engineCapacity = carDataWrapper.engineCapacity;
        this.fuelConsumption = (int) carDataWrapper.fuelConsumption;


        CarRepository.carsList.add(this);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getVin() {
        return vin;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPower() {
        return power;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", vin='" + vin + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", power=" + power +
                ", rentPrice=" + rentPrice +
                ", engineCapacity=" + engineCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}