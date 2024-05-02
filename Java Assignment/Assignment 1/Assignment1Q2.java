import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int choice = 0;
        int pricePerUnit = 0;
        int noOfUnits = 0;
        int price = 0;
        int totalBill = 0;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("1. Idli(Rs.10)");
        System.out.println("2. Samosa(Rs.15)");
        System.out.println("3. Dosa(Rs.20)");
        System.out.println("10. Generate Bill");

        do {
            System.out.println("Please enter appropriate choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pricePerUnit = 10;
                    System.out.print("Enter Quantity:");
                    noOfUnits = sc.nextInt();
                    price = noOfUnits * pricePerUnit;
                    break;

                case 2:
                    pricePerUnit = 15;
                    System.out.print("Enter Quantity:");
                    noOfUnits = sc.nextInt();
                    price = noOfUnits * pricePerUnit;
                    break;

                case 3:
                    pricePerUnit = 20;
                    System.out.print("Enter Quantity:");
                    noOfUnits = sc.nextInt();
                    price = noOfUnits * pricePerUnit;
                    break;

                case 10:
                    break;

                default:
                    System.out.println("Please enter valid choice");
                    break;
            }

            totalBill = totalBill + price;
            price = 0;
        } while (choice != 10);

        System.out.println("Total Bill : " + totalBill);
        
        sc.close();
    }
}