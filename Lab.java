import java.util.Scanner;

public class Lab {

  public static void main(final String args[]) {
    // scanner reads input from the command line through various methods
    final Scanner scanner = new Scanner(System.in);

    // prompt and read a string
    System.out.print("Enter your name: ");
    final String username = scanner.next();

    // prompt and read an int
    System.out.print("Enter your age: ");
    final int age = scanner.nextInt();

    System.out.println(String.format("Hello %s, your age is %d", username, age));

    if (age >= 16) {
      System.out.println("You are old enough to drive");
    }
    if (age >= 18) {
      System.out.println("You are old enough to vote");
    }
    if (age >= 21) {
      System.out.println("You are old enough to drink");
    }
    if (age >= 35) {
      System.out.println("You are old enough to be President");
    }
    if (age >= 55) {
      System.out.println("You can join AARP");
    }
    if (age >= 67) {
      System.out.println("You can starting drawing Social Security");
    }

    System.out.print("Enter 'E'(employed), 'U'(unemployed) or 'S'(student) for your employement status: ");
    final String emp = scanner.next();
    switch (emp) {
      case "E":
        System.out.println("You are Employed");
        break;
      case "U":
        System.out.println("You are Unmployed");
        break;
      case "S":
        System.out.println("You are a Student");
        break;
    }
    System.out.print("Enter 'C'(Car), 'S'(SUV),'T'(Truck) or 'N'(No Vehicle) for your vehicle type: ");
    final String vehicle = scanner.next();
    switch (vehicle) {
      case "C":
        System.out.println("You have a Car");
        break;
      case "S":
        System.out.println("You have a SUV");
        break;
      case "T":
        System.out.println("You have a Truck");
        break;
      case "N":
        System.out.println("You don't have a Vehicle");
        break;
    }

  }

}
