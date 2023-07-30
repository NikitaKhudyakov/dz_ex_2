// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        String str;

        System.out.print("Введите дробное число: ");

        try {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            
            if (str.isEmpty()) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("Все в порядке!");
            }

        } catch (IllegalArgumentException  e) {
            System.out.println("Что-то пошло не так...");
        }

    }
}
