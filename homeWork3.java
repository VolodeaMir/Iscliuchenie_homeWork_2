public class homeWork3 {
    public static void main(String[] args) throws Exception {
        // Постарался сделать так что даже если где-то и выскачет ошибка программа всё
        // ровно должна будет пройтись по всем трём операциям.
        try {
            Integer a = null;
            Integer b = 0;

            if (a != null && b != null && a != 0 && b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Ошибка: один из операндов равен null или равен нулю");
            }

            printSum(23, 234);

            // int[] abc = { 1, 2 };
            // int index = 3;
            // if (index >= 0 && index < abc.length) {
            // abc[index] = 9;
            // } else {
            // System.out.println("Индекс выходит за пределы массива!");
            // }
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
            // } catch (ArithmeticException ex) {
            // System.out.println("Деление на ноль!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        if (a != null && b != null) {
            System.out.println("Сумма чисел: " + a + "+" + b + "=" + (a + b));
        } else {
            System.out.println("Один из операндов равен null");
        }
    }
}
