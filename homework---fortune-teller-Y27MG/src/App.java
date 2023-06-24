import java.security.Permission;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a Person object to store user information
        Person person = new Person();

        // Set the user's first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);

        // Set the user's last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);

        // Retirement Years
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        person.setAge(age);
        int retirementYears = person.getAge() % 2 == 0 ? 12 : 14;

        // Vacation Home Location
        System.out.print("Enter the number of siblings you have: ");
        int siblings = scanner.nextInt();
        person.setSiblings(siblings);
        String vacationLocation;
        switch (person.getSiblings()) {
            case 0:
                vacationLocation = "Boca Raton, FL";
                break;
            case 1:
                vacationLocation = "Nassau, Bahamas";
                break;
            case 2:
                vacationLocation = "Ponta Negra, Brazil";
                break;
            case 3:
                vacationLocation = "Portland, Oregon";
                break;
            default:
                vacationLocation = "Baton Rouge, LA";
                break;
        }

        // Mode of Transportation
        scanner.nextLine(); // Consume the remaining newline character
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();
        person.setColor(favoriteColor);
        String modeOfTransportation = person.getColor() != null ? person.getColor() : "unknown";

        // Bank Balance
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        person.setBirth(birthMonth);
        double bankBalance;
        switch (person.getBirth()) {
            case 1:
            case 2:
            case 3:
            case 4:
                bankBalance = 256000.76;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                bankBalance = 3687105.42;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                bankBalance = 86.23;
                break;
            default:
                bankBalance = 0.00;
                break;
        }
        // Display the user's fortune
        System.out.println("\n" + person.getFirstName() + " " + person.getLastName() +
                " will retire in " + retirementYears + " years with $" + bankBalance +
                " in the bank, a vacation home in " + vacationLocation +
                ", and travel by " + modeOfTransportation + ".");
    }

    
}
