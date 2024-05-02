import java.util.Scanner;

public class Program {

    public static double costPerDay(double milesDrivenPerDay, double costPerGallon, double average, double parkingFeesPerDay, double tollsPerDay ){

        double totalCostPerDay = 0;

        double fuelCost = ((milesDrivenPerDay/average) * costPerGallon);

        totalCostPerDay = fuelCost + parkingFeesPerDay + tollsPerDay;

        return totalCostPerDay;
    }
    public static void main(String[] args) {
        double milesDrivenPerDay;
        double costPerGallon;
        double average;
        double parkingFeesPerDay;
        double tollsPerDay;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total miles driven per day");
        milesDrivenPerDay = sc.nextDouble();

        System.out.println("Enter total cost per gallon of gasoline");
        costPerGallon = sc.nextDouble();

        System.out.println("Enter average miles per gallon");
        average = sc.nextDouble();

        System.out.println("Enter parking fees per day");
        parkingFeesPerDay = sc.nextDouble();

        System.out.println("Enter tolls per day");
        tollsPerDay = sc.nextDouble();

        double totalCostPerDay = Program.costPerDay(milesDrivenPerDay, costPerGallon, average, parkingFeesPerDay, tollsPerDay);

        System.out.println("Total cost of driving per day is " + totalCostPerDay);

        sc.close();
    }
}