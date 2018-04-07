import java.io.Console;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        String firstName = c.readLine("Enter your first name: ");
        String lastName = c.readLine("Enter your last name: ");
        int age = Integer.parseInt(c.readLine("Enter your age: "));

        System.out.println("I`m "+ firstName +" "+ lastName+ ", "+ age +" years old");
    }
}
