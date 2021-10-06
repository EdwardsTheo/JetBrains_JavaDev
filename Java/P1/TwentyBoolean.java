import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean sumTwenty = h1 + h2 == 20 || h1 + h3 == 20 || h2 + h3 == 20;

        System.out.println(sumTwenty);
        
        // put your code here
    }
}