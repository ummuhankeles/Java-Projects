import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----OPTIONS----");
        System.out.println("1.Sum");
        System.out.println("2.Subtruction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();

        int process;
        while(true) {

            System.out.println("Enter the your choose (1-4):");
            process = scanner.nextInt();

            if (process == 1) {
                System.out.println("Result: " + calculate.sum(number1,number2));
            }
            else if(process == 2) {
                System.out.println("Result: " + calculate.subsruction(number1,number2));
            }
            else if(process == 3) {
                System.out.println("Result: " + calculate.multiplication(number1,number2));
            }
            else if(process == 4) {
                while (number2 <= 0) {
                    System.out.println("Enter the second number again:");
                    number2 = scanner.nextDouble();
                }
                System.out.println("Result: " + calculate.division(number1,number2));
            }

            if(process > 0 && process < 5) {
                break;
            }
            else {
                System.out.println("Enter the choose again (1-4): ");
                process = scanner.nextInt();
            }

        }
    }
}
