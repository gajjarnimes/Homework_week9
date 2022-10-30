package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the First Number");
        int a = scanner.nextInt();
        System.out.println("Please Enter the Second Number");
        int b = scanner.nextInt();
        System.out.println("Please Enter one of the symbol +,-,*,/");
        char ch = scanner.next().charAt(0);
        Calculator obj1 = new Calculator();
        obj1.calculateResult(a, b, ch);
        System.out.println("Would you like to do more calcultion ");
        char result = scanner.next().charAt(0);
        if (result != 'Y') {
            System.out.println("Enter the First number");

            if  (ch == 'N') {
                System.out.println("Terminate here");
            }
        }
    }
}







