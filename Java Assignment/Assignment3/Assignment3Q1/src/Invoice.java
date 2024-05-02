import java.util.Scanner;
public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice() {
        
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void acceptInvoiceDetails(Scanner sc){
        System.out.println("Enter Part Number");
        this.partNumber = sc.next();

        System.out.println("Enter Part Description");
        this.partDescription = sc.next();

        System.out.println("Enter Price per item");
        this.pricePerItem = sc.nextDouble();

        System.out.println("Enter Quantity");
        this.quantity = sc.nextInt();

    }

    public double calInvoiceAmount(){
        
        double invoiceAmount;
        if (this.pricePerItem == 0 || this.quantity == 0) {
            
            invoiceAmount = 0;
            
        }else{
            invoiceAmount = this.pricePerItem * this.quantity;
        }

        return invoiceAmount;

    }

}