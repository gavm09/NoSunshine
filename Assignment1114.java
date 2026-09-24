import java.util.Scanner;


public class Assignment1114 {
   public static void main (String[] args) {
   
   int goalsLastGame = 2;
   double distanceDroveToGame = 20.4;
   boolean lastGameWin = false;
   String soccerTeamName = "BVB ";
   String opposingTeamNumOfGoals;
   String opposingTeamName;
   
   System.out.printf("\nThe average number of goals per miles driven is: %.2f\n", goalsLastGame / distanceDroveToGame);
   
   System.out.println ("Please enter in your the opposing teams number of goals:");
   Scanner scan = new Scanner(System.in);
   opposingTeamNumOfGoals = scan.nextLine();
   System.out.println("You entered the number of goals as: " + opposingTeamNumOfGoals);
   
   System.out.println("Please enter the opposing teams name: ");
   opposingTeamName = scan.nextLine();
   
   System.out.println("You entered the name of the opposing team as: " + opposingTeamName);
   System.out.print("The score of your last game was: " + soccerTeamName);
   System.out.print(" " + goalsLastGame);
   System.out.print(" - " + opposingTeamName);
   System.out.println(" " + opposingTeamNumOfGoals);
   }
}