import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private int age;
    private int matchesPlayed;


    public Player() {
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void accept(Scanner sc) {
        System.out.println("Enter ID : ");
        this.id = sc.nextInt();

        System.out.println("Enter name : ");
        this.name = sc.next();

        System.out.println("Enter age : ");
        this.age = sc.nextInt();

        System.out.println("Enter no. of matches played : ");
        this.matchesPlayed = sc.nextInt();

    }

     @Override
     public String toString() {
        String string = "ID : " + this.id + ", " + "Name : " + this.name + ", " + "Age : " + this.age + ", " + "No. of mathches played : " + this.matchesPlayed; 
        return string;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name + ", " + "Matches Played : " + matchesPlayed);
    }
}
