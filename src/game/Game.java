package game;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

import java.util.Random;

public class Game {
    private GameObject[] objects = {new Rock(), new Paper(), new Scissors()};

    public void run(){
        System.out.println("Game running!!");

        Random random = new Random();

        GameObject obj = objects[random.nextInt(objects.length)];

        System.out.println(obj);
    }
}
