import java.util.Scanner;
import java.util.Random;

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

        double personsNumber2 = 300;

        System.out.print("Now enter a number to find the Sine " + personsNumber2);
        double number3 = scanner.nextDouble();

        double result3 = Math.sin(number3);

        System.out.println("The Sine of " + number3 + "is " + result3);

        double personsNumber4 = 22.8;

        System.out.print("Now enter the a number to find the value of the floor, ceiling, and round; " + personsNumber4);
        double number4 = scanner.nextDouble();

        double result4 = Math.floor(number4);
        double result5 = Math.ceil(number4);
        double result6 = Math.round(number4);

        System.out.print("Now the value of the floor is " + result4 + ", The value of the ceiling is " + result5 + ", and the finally the value of the round is " + result6+ ".");

        System.out.print("Now we you are going to get a different number between 1-20.");

        Random rand = new Random();

        int givenRandom = rand.nextInt(20) + 1;

        System.out.print("Your Random number is " + givenRandom + ".");


    }
}
