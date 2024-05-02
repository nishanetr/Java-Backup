import java.util.Scanner;

public class Program {

    public static int menu(Scanner sc) {

        System.out.println("0. Exit");
        System.out.println("1. Enter Details of Player");
        System.out.println("2. Display details of all players ");
        System.out.println("3. Display total runs and wickets of all the players");
        System.out.println("Enter your choice : ");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int count = 0;
        int noOfPlayers = 11;

        Cricketer team[] = new Cricketer[noOfPlayers];
        
        while ((choice = menu(sc)) != 0) {

            switch (choice) {
                case 1:
                    if(count < noOfPlayers) {
                        team[count] = new Cricketer();
                        team[count].accept(sc);
                        count++;
                    }else{
                        System.out.println("You have entered details of all the player");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("You have not entered any player");
                        
                    }else if (count < 11) {
                        System.out.println("Please enter details of all the 11 players");
                        
                    }else{
                        for(int index =0; index < count; index++) {
                            team[index].displayDetails();
                        }
                    }
                    
                    break;
                    
                case 3:
                    if (count == 0) {
                        System.out.println("You have not entered any player");
                        System.out.println("");
                        
                    }else if (count < 11) {
                        System.out.println("Please enter details of all the 11 players");
                    }else {
                        int totalRuns = 0, totalWickets = 0, totalMatchesPlayed = 0;
                        for(int index =0; index < count; index++) {
                            totalRuns = totalRuns + team[index].getRuns();
                            totalWickets = totalWickets + team[index].getWickets();
                            totalMatchesPlayed = totalMatchesPlayed + team[index].getMatchesPlayed();
                        }
                        System.out.println("Total Runs : " + totalRuns);
                        System.out.println("Total Wickets : " + totalWickets);
                        System.out.println("Total no. of matches of all the players : " + totalMatchesPlayed);
                        System.out.println("");
                    }
                    break;

                default:
                    System.out.println("Please enter valid choice");
                    System.out.println("");
                    break;
            }
            
        }

        
    }
}