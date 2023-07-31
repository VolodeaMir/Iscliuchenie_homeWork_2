public class homeWork2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Объявляем и инициализируем массив intArray

        try {
            int d = 0;
            if (d != 0) {
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Нельзя делить на ноль.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
