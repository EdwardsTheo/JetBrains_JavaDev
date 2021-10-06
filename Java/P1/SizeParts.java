import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int readyParts = 0;
        int partsToFix = 0;
        int rejects = 0;
        for (int i = 0; i < n; i++) {
            int prints = scanner.nextInt();
            if (prints == 0) {
                readyParts++;
            } else if (prints == 1) {
                partsToFix++;
            } else if (prints == -1){
                rejects++;
            }
        }
        System.out.println(rejects + " " + readyParts + " " + partsToFix);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int grades;

        for (int i = 0; i < n; i++) {
            grades = scanner.nextInt();
            if (grades == 5) {
                a++;
            } else if (grades == 4) {
                b++;
            } else if (grades == 3) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        int nb = 0;
        int fNb = 0;

        for (int i = 0; i < n; i++) {
            nb = scanner.nextInt();

            if (nb % 4 == 0) {
                if (nb > fNb) {
                    fNb = nb;
                }
            }
        }
        System.out.println(fNb);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum = 1;
        for (; a < b; a++) {
            sum *= a;
        }
        System.out.println(sum);
    }
}
