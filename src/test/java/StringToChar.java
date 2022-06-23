import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class StringToChar {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Угадайте, какую букву я загадал?!");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.print("А ты не экстрасенс ??");
        } else if (ch > answer) {
            System.out.print("Перебор");
        } else {
            System.out.print("Подумай ещё немного");
        }

    }
}