import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int randomNumber = random.nextInt(101);
    int attempts = 0;
    int guess;

    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Im thinking of a number between 1-100. Take a guess!");
    System.out.println();

    do {
      System.out.print("Your Guess: ");
      guess = scanner.nextInt();
      attempts ++;

      if (guess > randomNumber) {
        System.out.println("Incorrect, Guess Lower.");
        System.out.println();
      }

      else if (guess < randomNumber) {
        System.out.println("Incorrect, Guess Higher.");
        System.out.println();
      }

      else {
        System.out.println("Mystery Number: " + randomNumber);
        System.out.println("Congratulations! You finally guessed the right number within " + attempts + " attempts.");
        break;
      } 
    } while(true);
      scanner.close();
  }
}
