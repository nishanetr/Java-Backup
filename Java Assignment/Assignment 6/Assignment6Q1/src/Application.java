//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Application {
    public static int menu(Scanner sc) {
        int choice;

        System.out.println("Please select Employee category : ");
        System.out.println("1. Salaried Employee");
        System.out.println("2. Hourly Employee");
        System.out.println("3. Commission Employee");
        System.out.println("4. Base Salaried Commission Employee");
        //System.out.println("0. Exit");

        choice = sc.nextInt();

        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter no. of employees : ");
        int noOfEmployees = sc.nextInt();

        Employee arr[] = new Employee[noOfEmployees];

        for (int index = 0; index < noOfEmployees; index++){

            int choice = menu(sc);

            switch (choice) {
                case 1:
                    arr[index] = new SalariedEmployee();
                    arr[index].accept(sc);
                    break;

                case 2:
                    arr[index] = new HourlyEmployee();
                    arr[index].accept(sc);
                    break;

                case 3:
                    arr[index] = new CommEmployee();
                    arr[index].accept(sc);
                    break;

                case 4:
                    arr[index] = new BaseSalariedCommEmployee();
                    arr[index].accept(sc);
                    break;

                default:
                    System.out.println("Please enter valid choice");
                    index--;
                    break;
            }

        }

        for (int index = 0; index < noOfEmployees; index++){
            arr[index].calWeeklySalary();
            System.out.println(arr[index].toString());
        }
    }
}