import java.util.*;

public class Main {
    public static void main(String[] args) {
        greeting(new Scanner(System.in));
    }

    public static void greeting(Scanner sc) {
        String s = sc.nextLine();
        while (true) {
            String[] array = s.split(" ");
            if (array.length != 2) {
                s = sc.nextLine();
                continue;
            }
            char[] charArray = array[1].toCharArray();
            if (charArray.length < 2 || charArray.length > 5) {
                s = sc.nextLine();
                continue;
            }
            for (char c : charArray) {
                if (!Character.isDigit(c)) {
                    s = sc.nextLine();
                    continue;
                }
            }
            break;
        }
        String[] array = s.split(" ");
        int num = Integer.parseInt(array[1]);
        System.out.printf("Здравствуй %s! Сумма цифр в числе = %s", array[0], convert(sum(num)));
    }

    public static String convert(int num) {
        return switch (num) {
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "четыре";
            case 5 -> "пять";
            case 6 -> "шесть";
            case 7 -> "семь";
            case 8 -> "восемь";
            case 9 -> "девять";
            case 10 -> "десять";
            default -> "неизвестное число";
        };
    }

    public static int sum(int num) {
        if (num == 0) return 0;
        return num % 10 + sum(num / 10);
    }
}