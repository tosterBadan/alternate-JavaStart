import java.io.Console;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String input = c.readLine();
        int coma = input.indexOf(",");
        int a = Integer.parseInt(input.substring(0,coma).replaceAll(" ", ""));
        int b = Integer.parseInt(input.substring(coma+1).replaceAll(" ", ""));
        if (a<=b) {
            for (int i = a; i < b + 1; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i > b - 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
