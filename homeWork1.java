
import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        float userInput = readFloatFromUser();
        System.out.println("Введенное число: " + userInput);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result = 0.0f;
        boolean validInput = false;

        do {
            try {
                System.out.print("Введите дробное число: ");
                result = Float.parseFloat(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное число, попробуйте снова.");
            }
        } while (!validInput);

        return result;
    }
}
