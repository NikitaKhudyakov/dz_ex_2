//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
//        повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введенное число:  " + numRequest());
    }

    public static float numRequest() {
        float number = 0;
        boolean getOut = false;
        while (!getOut) {
            System.out.print("Введите дробное число: ");
            Scanner scanner = new Scanner(System.in);
            try {
                number = Float.parseFloat(scanner.next());
                System.out.println();
                getOut = true;

            } catch (NumberFormatException e) {
                e.getStackTrace();
                System.out.println("Попробуй еще раз");

                getOut = false;
                number = 0;
            }

        }
        return number;
    }

}