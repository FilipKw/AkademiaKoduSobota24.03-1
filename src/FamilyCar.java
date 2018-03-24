public class FamilyCar extends Car {
    private int seatsNumber;

    public FamilyCar(String brand, String model, String colour, String registrationNumber, int power, int engineCapacity, int fuelConsumption, int seatsNumber) {
        super(brand, model, colour, registrationNumber, power, engineCapacity, fuelConsumption, rentPrice);
        this.seatsNumber = seatsNumber;
        // jak wykona to co powyzej, wejdz w CarRepository, wez carsList i dodaj "mnie"
    }

    public FamilyCar(CarDataWrapper carDataWrapper, int seatsNumber) {
        super(carDataWrapper);
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    @Override
    public String toString() {
        return "FamilyCar{" + super.toString() +
                "seatsNumber=" + seatsNumber +
                '}';
    }
}