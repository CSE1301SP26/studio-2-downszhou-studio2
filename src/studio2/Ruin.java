import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your starting amount?");
        int startAmount = scan.nextInt();
        
        double winChance;
        int winLimit = 10;
        int total = startAmount;
        int numberOfPlays = 0;
        int totalSimulation = 10;

    for ( int sim = 1; sim <= totalSimulation; sim ++) {

        if (total >= winLimit) {           
             System.out.println("simulation " + sim + ":" + " You win!");
        }

        else if (total == 0) {
            System.out.println("simulation " + sim + ":" + "You lose");
        }

        else {
            while (total < 10 && total > 0) {
                numberOfPlays++;
                winChance = Math.random();
                    if(winChance > 0.7) {
                        total++;
                    }
                    else {
                        total--;
                    } 
            }
        }
        System.out.println("Number of plays: " + numberOfPlays); 
    }

    }
}

