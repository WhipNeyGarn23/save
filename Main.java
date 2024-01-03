import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    double number = scanner.nextDouble();
    System.out.println("Choose an option: ");
    System.out.println("1. Absolute value");
    System.out.println("2. Sine");
    System.out.println("3. Cosine");
    System.out.println("4. Tangent");
    System.out.println("5. Square root");
    System.out.println("6. Conversion to radians");
    System.out.println("7. Area of a circle");
    System.out.println("8. Perimeter of a circle");
    System.out.println("9. Custom math function 1");
    System.out.println("10. Custom math function 2");
    System.out.println("11. Custom math function 3");
    int option = scanner.nextInt();

    switch (option) {
      case 1:
        System.out.println("Absolute value: " + Math.abs(number));
        break;
      case 2:
        System.out.println("Sine: " + Math.sin(number));
        break;
      case 3:
        System.out.println("Cosine: " + Math.cos(number));
        break;
      case 4:
        System.out.println("Tangent: " + Math.tan(number));
        break;
      case 5:
        System.out.println("Square root: " + Math.sqrt(number));
        break;
      case 6:
        System.out.println("Conversion to radians: " + Math.toRadians(number));
        break;
      case 7:
        double area = Math.PI * Math.pow(number, 2);
        System.out.println("Area of a circle: " + area);
        break;
      case 8:
        double perimeter = 2 * Math.PI * number;
        System.out.println("Perimeter of a circle: " + perimeter);
        break;
      case 9:
        // Custom math function 1
        break;
      case 10:
        // Custom math function 2
        break;
      case 11:
        // Custom math function 3
        break;
      default:
        System.out.println("Invalid option");
        break;
    }
  }
}

