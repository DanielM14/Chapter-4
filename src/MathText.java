import java.util.Scanner;

public class MathText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for square root :");
        double number1 = scanner.nextDouble();

        double result = Math.sqrt(number1);

        System.out.println("The square root of " + number1 + "is : " + result);

        
        double personsNumber = 300;
        
        System.out.print("Now enter a number to find the cosine: " + personsNumber);
        double number2 = scanner.nextDouble();

        double result2 = Math.cos(number2);

        System.out.println("The Cosine of " + number2 + "is " + result2);
    }
}
