import java.util.Scanner;
import ru.kirpichenkov.Leetcode.package01.palindrom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean p = palindrom.isPalindrom(scanner.nextInt());
        System.out.println(p);

    }
}
