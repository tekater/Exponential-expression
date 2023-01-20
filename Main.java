import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите значение X: ");
        double x = scanner.nextDouble(); // 22.5
        double y = Math.pow(x , 3) + Math.pow(x , 2) + x + 1;
        System.out.println("Значение Y: ");
        System.out.println(y); // 11920.375

    }
}
