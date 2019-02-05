import java.util.Scanner;

public class MathText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for square root :");
        double number1 = scanner.nextDouble();

        double result = Math.sqrt(number1);

        System.out.println("The square root of " + number1 + "is : " + result);

    }

}
