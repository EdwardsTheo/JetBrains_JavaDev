int n = 9;
for (int i = 0; i <= n; i++) {
    System.out.print(i + " "); // here, a space is used to separate numbers
}

class Main {
    public static void main(String[] args) {
        int i = 10;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        } 
    }
}


// Nested Loop 
for (int i = 1; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
        System.out.print(i * j + "\t");
    }
    System.out.println();
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int x = 0; x < 1000; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
            }
        }

    }
}