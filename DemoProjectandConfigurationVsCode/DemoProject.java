import java.util.Scanner;

public class DemoProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Hey " + x);
        scanner.close();
    }
}