import java.util.Scanner;

public class Demo036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int biggest = num1;
        if (num2 > biggest) {
            biggest = num2;
        }
        if (num3 > biggest) {
            biggest = num3;
        }

        System.out.println("The biggest number is: " + biggest);
        scanner.close();
    }
}
