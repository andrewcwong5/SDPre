import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
        printMenu();
        selection = scanner.nextInt();

        switch (selection) {
          case 1:
            System.out.println("Hello");
            break;
          case 2:
            System.out.println("Apples, Bananas, Coconuts");
            break;
          case 3:
            System.out.println("Goodbye");
            break;
          }

    }


  }

  public static void printMenu() {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
