import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double invoiceAmount;

        Invoice i = new Invoice();

        i.acceptInvoiceDetails(sc);
        invoiceAmount = i.calInvoiceAmount();

        System.out.println("Total Invoice Amount : " + invoiceAmount);

        sc.close();
        
    }
    
}
