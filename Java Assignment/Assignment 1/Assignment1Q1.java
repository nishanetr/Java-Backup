import java.io.InputStream;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double d1 = 0;
        double d2 = 0;
        double avg = 0;
        boolean isFirstDouble = false;
        boolean isSecondDouble = false;


        System.out.println("Enter first double value :");

        isFirstDouble = sc.hasNextDouble();

        if (isFirstDouble) {
            d1 = sc.nextDouble();

            System.out.println("Enter second double value :");
            isSecondDouble = sc.hasNextDouble();
            if (isSecondDouble) {
                d2 = sc.nextDouble();
                avg = (d1 + d2)/2;
                System.out.println("Average : " + avg);
                
            }else{
                System.out.println("Please enter valid double value!");    
            }
        }else{
            System.out.println("Please enter valid double value!");
        }
         
        sc.close();

    }
}

