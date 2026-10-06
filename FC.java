package homework;
import java.util.Scanner;
public class FC {
    public static void main(String[] args) {
        float farengheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        farengheit = scanner.nextFloat();
        float celcius;
        celcius = (farengheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celcius);
    }
}