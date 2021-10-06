import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        if (number > 0) {
            return +1;
        } else if(number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}

import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        return Integer.signum(number);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}