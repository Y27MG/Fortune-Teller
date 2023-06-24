import java.util.Scanner;

public class KeyboardInput {
    /*
     * This function handles int keyboard input
     */
    public int keyboardint() {

        // Initialize keyboard scanner
        Scanner input = new Scanner(System.in);

        // Initialize the return value
        int value = 0;

        // Initialize the menu loop var.
        boolean failedInt = true;

        // Start the loop until we successfully enter an int
        while (failedInt) {

            // Get a string from the scanner
            String stringInt = input.nextLine();

            // Go into a try catch
            try {

                // Convert the scanner string input to an int
                value = Integer.parseInt(stringInt);

                // If we have a valid int the set failed int to false
                failedInt = false;
            }
            // If not a valid integer then we tell the user to try again
            catch (NumberFormatException e) {
                System.out.println(stringInt + " is not an int");
            }
        }
        // Return the valid int
        return value;
    }
    
}