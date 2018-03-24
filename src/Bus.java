public class Bus extends Car {

    private int seatsNumber, standingPlaces;
    private double length, height;


    public Bus(String brand, String model, String colour, String registrationNumber, int power, int engineCapacity, int fuelConsumption,
               int seatsNumber, int standingPlaces, double length, double height)
                {
        super(brand, model, colour, registrationNumber, power, engineCapacity, fuelConsumption);
        this.seatsNumber=seatsNumber;
        this.standingPlaces=standingPlaces;
        this.height = height;
        this.length = length;

    }


    }
}
