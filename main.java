// Practicum 12 (Yes/No Program)
// (TO WRITE)

// This program should prompt the user to enter "yes" or
// "no" and output their response. The user should be allowed to
// enter their response with either upper or lower case characters
// (e.g., "yes", "Yes", "YES").

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// "User entered yes"
// "User entered no"
//
// (TO COMPLETE)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("\nPlease enter yes or no: ");
      String user_input = sc.nextLine();

      // input validation
      while (!user_input.equalsIgnoreCase("yes") && !user_input.equalsIgnoreCase("no")) {
        System.out.print("Error -> Please enter either yes or no -> Reenter: ");
        user_input = sc.nextLine();
      }

      // Finds if user entered yes or no
      if (user_input.equalsIgnoreCase("yes")) {
        System.out.print("User entered yes");
      } else if (user_input.equalsIgnoreCase("no")) {
        System.out.print("User entered no");
      }
      System.out.println();
    }
}
