import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

    List<Fruits> listOfFruits = new ArrayList<Fruits>();

    System.out.println("       Welcome to Grasya's Prutasan!");
    System.out.println("");
    System.out.println("Note: You can only input an integer.");
    System.out.println("");

    try {
      System.out.print("Good day! How many fruits do you want to buy?: ");
      Integer objects = input.nextInt();

      if (objects < 0) {
        input.close();
        scan.close();
        throw new FruitsException("Your input is negative. Please input positive index.");
      }
      for (int i = 0; i < objects; i++) {

        System.out.println("");
        System.out.print("Fruit's Name: ");
        String name_s = scan.nextLine();

        System.out.print("Quantity: ");
        int quantity_s = Integer.parseInt(scan.nextLine());

        listOfFruits.add(new Fruits(name_s, quantity_s));
      }

      System.out.println("");
      System.out.println("Here are your Fruits!");
      System.out.println("=====================================");
      for (Fruits list : listOfFruits) {
        System.out.println("Fruit's Name: " + list.getName() + " || " + "Quantity: " + list.getQuantity());
      }
      System.out.println("=====================================");
      System.out.println("");
      
      System.out.println("Thank you for buying come again!");

      input.close();
      scan.close();

    } catch (FruitsException e) {
      System.out.println(e.getMessage());
    } catch (InputMismatchException ex) {
      System.out.println("Your input is not a number.");
    }

  }
}
