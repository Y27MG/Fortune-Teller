import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the fortune details
        System.out.println("\n--- Your Fortune ---");

        // Retirement Years
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int retirementYears;

        if (age % 2 == 0) {
            retirementYears = 12;
        } else {
            retirementYears = 14;
        }

        // Display the retirement years
        System.out.println("Retirement Years: " + retirementYears);

        // Vacation Home Location
        System.out.print("Enter the number of siblings you have: ");
        int siblings = scanner.nextInt();
        String vacationLocation;

        if (siblings == 0) {
            vacationLocation = "Boca Raton, FL";
        } else if (siblings == 1) {
            vacationLocation = "Nassau, Bahamas";
        } else if (siblings == 2) {
            vacationLocation = "Ponta Negra, Brazil";
        } else if (siblings == 3) {
            vacationLocation = "Portland, Oregon";
        } else if (siblings > 3) {
            vacationLocation = "Baton Rouge, LA";
        } else {
            vacationLocation = "Chernobyl, Ukraine";
        }

        // Display the vacation home location
        System.out.println("Vacation Home Location: " + vacationLocation);

        // Mode of Transportation
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.next();
        String transportationMode;
        

        switch (favoriteColor.toLowerCase()) {
            case "red":
                transportationMode = "Maserati";
                break;

            case "orange": {
                transportationMode = "Stallion";
                break;
            }
            case "yellow": {
                transportationMode = "Chariot";
                break;
            }

            case "green": {
                transportationMode = "Taxi";
                break;
            }

            case "blue": {
                transportationMode = "Rickshaw";
                break;
            }
            case "indigo": {
                transportationMode = "Motor Scooter";
                break;
            }

            case "violet": {
                transportationMode = "Flying Saucer";
                break;
            }

            default: {
                System.out.println("Invalid color entered.");
                return;
            }
        }

        // Display the mode of transportation
        System.out.println("Mode of Transportation: " + transportationMode);

        // Bank Balance
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        double bankBalance;

        if (birthMonth >= 1 && birthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (birthMonth >= 5 && birthMonth <= 8) {
            bankBalance = 3687105.42;
        } else if (birthMonth >= 9 && birthMonth <= 12) {
            bankBalance = 86.23;
        } else {
            bankBalance = 0.0;
        }

        // Display the bank balance
        System.out.printf("Bank Balance: $%.2f\n", bankBalance);
    }

}