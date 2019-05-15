import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Please, input name:");
        String name = consoleInput.next();

        boolean isITEA = name.equals("ITEA");
        if (isITEA) {
            System.out.println("Good day, ITEA!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
