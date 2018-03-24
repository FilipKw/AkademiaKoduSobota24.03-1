import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {
    // metoda public

    public static void start() {


        boolean exitFlag = false;
        do {
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println();
            int choice = Menu.mainScreen();

            switch (choice) {

                case 1:
                    typeCarFlow();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println();
                    CarRepository.showCars();
                    break;
                case 3:
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);
        System.exit(0);
    }

    private static void typeCarFlow() {
        int choice2 = Menu.carTypeScreen();
        CarDataWrapper cdw;
        Scanner scanner;
        switch (choice2) {
            case 1:

                cdw = readMainParameters();
                scanner = new Scanner(System.in);

                System.out.print("Seat numbers: ");
                int seats = scanner.nextInt();

                FamilyCar fc = new FamilyCar(cdw, seats);
                break;

            case 2:
                cdw = readMainParameters();
                scanner = new Scanner(System.in);
                System.out.print("Seat numbers: ");
                int seatsNumber = scanner.nextInt();
                System.out.print("Standing places: ");
                int standingPlaces = scanner.nextInt();
                System.out.println("Length: ");
                double length = scanner.nextInt();
                System.out.print("Height: ");
                double height = scanner.nextInt();

                Bus b = new Bus(cdw, seatsNumber, standingPlaces, length, height);


                break;
        }
    }

    private static CarDataWrapper readMainParameters() {
        Scanner scanner = new Scanner(System.in);

        CarDataWrapper carDataWrapper = new CarDataWrapper();

        System.out.print("Podaj markę samochodu: ");
        carDataWrapper.brand = scanner.nextLine();

        System.out.print("Podaj model samochodu: ");
        carDataWrapper.model = scanner.nextLine();

        System.out.print("Podaj kolor samochodu: ");
        carDataWrapper.colour = scanner.nextLine();

        carDataWrapper.rentPrice = ourScanner("Rent price: ");


        System.out.print("Podaj moc samochodu: ");
        carDataWrapper.power = scanner.nextInt();

        System.out.print("Podaj pojemność silnika: ");
        carDataWrapper.engineCapacity = scanner.nextInt();

        System.out.print("Zużycie paliwa: ");
        carDataWrapper.fuelConsumption = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Numer rejestracji: ");
        carDataWrapper.registrationNumber = scanner.nextLine();


        return carDataWrapper;
    }

    public static int ourScanner(String parameterName) { //swój skaner, który tworzymy
        int result = 0;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Rent price: ");
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ups...");
                continue;
            }
            break;
        }
        return result;
    }
}
