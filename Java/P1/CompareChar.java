import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println(phrase.substring(0, 1).equalsIgnoreCase("j"));
    }
}