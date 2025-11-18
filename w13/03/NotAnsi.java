// lets us use Scanner without typing the package (java.util) every time
import java.util.Scanner;

public class NotAnsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello! What is your name?\r");
        String name = input.nextLine();

        System.out.println("\u001B[41mHello\u001B[0m " + name + "!");

        input.close();
    }
}
