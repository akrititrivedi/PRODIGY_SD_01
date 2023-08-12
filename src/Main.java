import java.util.Scanner;

public class Main {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9/5) - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Conversion Program");
        System.out.println("Options:");
        System.out.println("1. Celsius to Fahrenheit and Kelvin");
        System.out.println("2. Fahrenheit to Celsius and Kelvin");
        System.out.println("3. Kelvin to Celsius and Fahrenheit");
        System.out.print("Enter your choice (1/2/3): ");
        int option = scanner.nextInt();

        double celsius, fahrenheit, kelvin;

        if (option == 1) {
            System.out.print("Enter temperature in Celsius: ");
            celsius = scanner.nextDouble();
            fahrenheit = celsiusToFahrenheit(celsius);
            kelvin = celsiusToKelvin(celsius);
        } else if (option == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            fahrenheit = scanner.nextDouble();
            celsius = fahrenheitToCelsius(fahrenheit);
            kelvin = fahrenheitToKelvin(fahrenheit);
        } else if (option == 3) {
            System.out.print("Enter temperature in Kelvin: ");
            kelvin = scanner.nextDouble();
            celsius = kelvinToCelsius(kelvin);
            fahrenheit = kelvinToFahrenheit(kelvin);
        } else {
            System.out.println("Invalid option!");
            return;
        }

        System.out.printf("Temperature in Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}
