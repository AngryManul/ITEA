import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

            System.out.println("Please input name:");
            String name = consoleInput.next();

            String greeting = name.equals("ITEA") ? "Hello, " : "Hi, ";

            System.out.println(greeting + name + "!");
    }
}
