package game;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};

    public void run(){
        String[] status = {"lose", "draw", "win"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int wins = 0;

        for (int i=0; i<3; i++){
            GameObject obj1 = objects[random.nextInt(objects.length)];

            System.out.println("Choose an object");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("> ");

            int objectIndex = scanner.nextInt();
            GameObject obj2 = objects[objectIndex -1];

            System.out.println("You choose " + obj2);
            System.out.println("Computer chose " + obj1);

            int compatison = obj2.compareTo(obj1);
            System.out.println(status[compatison + 1]);

            wins += compatison;
            System.out.println("\n");
        }
        scanner.close();
        System.out.println();
        if (wins > 0){
            System.out.println("You have won!");
        } else if (wins < 0) {
            System.out.println("You have lost!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
