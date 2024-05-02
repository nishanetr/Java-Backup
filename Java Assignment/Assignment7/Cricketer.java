import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler{
        private int runs;
        private int wickets;

        public Cricketer() {
            super();
        }

        public int getRuns() {
            return runs;
        }
        
        public void setRuns(int runs) {
            this.runs = runs;
        }

        public int getWickets() {
            return wickets;
        }

        public void setWickets(int wickets) {
            this.wickets = wickets;
        }

        @Override
        public void accept(Scanner sc) {
            super.accept(sc);
            
            System.out.println("Enter runs scored : ");
            this.runs = sc.nextInt();

            System.out.println("Enter wickets taken : ");
            this.wickets = sc.nextInt();
        }

        @Override
        public String toString() {
            String string = ", Runs : " + this.runs + ", " + "Wickets : " + this.wickets; 
            
            return super.toString() + string;
        }
}
