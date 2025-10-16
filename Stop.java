import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;


public class Stop {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose a number between 1 & 30");
    int userInput = input.nextInt();
    int Multiplier = 1;
    int Cash = 500;
    System.out.println("Your balance is " + Cash);
    System.out.println("What is your bet.");
    int Bet = input.nextInt();
    

    if (userInput % 10 == 0) {
        Multiplier *= 3;
        System.out.println();
    } else if (userInput % 2 == 0) {
        Multiplier *= 2;
    } else if (isPrime(userInput)) {
        Multiplier *= 5;
    } else if (userInput < 5) {
        Multiplier *= 2;
    }
    System.out.println("You got " + Multiplier + "x more of you earnings!");
    Cash = Cash + (Bet * Multiplier);
    int randomNum = (int)(Math.random() * 31);
    System.out.println("The random number was...");
    System.out.println(randomNum);
    if (randomNum == userInput) {
        System.out.println("WINNER!!!");
    } else {
        System.out.println("You lost!");
    }

    System.out.println("Your cash is now " + Cash);


  }
}