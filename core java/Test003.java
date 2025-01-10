import java.util.Scanner;

public class Test003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();

        double total = 1; 
        for (int i = 1; i <= numberOfItems; i++) {
            
            System.out.println("Enter the price of item " + i + ": ");
            double price = scanner.nextDouble();
            System.out.println("Item " + i + " price: " + price);

          
            total *= price;
        }

        
        System.out.println("\nTotal multiplied price of all items: " + total);

        scanner.close();
    }
}
