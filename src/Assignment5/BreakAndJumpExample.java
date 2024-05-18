package Assignment5;

public class BreakAndJumpExample {
    public static void main(String[] args) {
        // Example of break
        System.out.println("##### Example of break statement ####");
        for (int i = 1; i <= 10; ++i) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Example of continue
        System.out.println("##### Example of continue statement ####");
        for (int j = 1; j <= 10; ++j) {
            if (j > 4 && j < 9) {
                continue;
            }

            System.out.println(j);
        }
    }
}
