import java.util.Scanner;

public class Demo049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int reverse = 0;
        int num = Math.abs(number); 

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (number < 0) {
            reverse *= -1;

        }

        System.out.println("The reverse of " + number + " is: " + reverse);

        scanner.close();
    }
}