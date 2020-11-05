package clock;

import action.Collision;
import game.Snake;

public class GameClock extends Thread{
    public static boolean running = true;

    public void run(){
        while(running){
            try {
                //interval between each snake movement
                sleep(150);
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUp();
                if(Collision.collideSelf()){
                    Snake.tails.clear();
                    Snake.score = 0;
                }
                if(Collision.collideWall()){
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.score = 0;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
