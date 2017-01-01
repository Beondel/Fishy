/**
 * Created by benjaminmacmillan1 on 12/4/16.
 */
import java.awt.*;
import java.util.*;

public class Ocean {
    public static void main(String[] args){
        DrawingPanel p = new DrawingPanel(1200, 720);
        p.setBackground(Color.BLUE);
        Graphics g = p.getGraphics();

        oceanBg(g, p);


        Random r = new Random();
        // speed is -50 to 50
        int speed = r.nextInt(6) * 20 - 50;
        // size is 10 to 90
        int size = r.nextInt(11) * 8 + 10;
        // y is 10 to 720
        int position = r.nextInt(72) * 10 + 10;

        Fish bob = new Fish(speed, size, position, true);

        // draw the fish
        drawFish(g, p, bob.getSpeed(), bob.getPosition(), bob.getSize(), bob.getStatus());

        Player person = new Player();
        //playerControl(person.getSize(), );

        //while(person.isAlive()){

        //}
    }

    // background ocean, has nothing to do with player
    public static void oceanBg(Graphics g, DrawingPanel p){

        for(int i = 0; i < 15; i++) {
            Random r = new Random();
            int x = r.nextInt(1150);
            int y = r.nextInt(670);
            int size = r.nextInt(45)+5;
            bubbles(g, p, x, y, size);
        }
    }

    // add bubbles to background
    public static void bubbles(Graphics g, DrawingPanel p, int x, int y, int size){
        g.setColor(Color.CYAN);
        g.fillOval(x, y, size, size);
        g.setColor(Color.WHITE);
        g.fillOval(x + size / 5, y + size / 5, size / 4, size / 4);
    }

    //draw fish
    public static void drawFish(Graphics g, DrawingPanel p, int speed, int y, int size, boolean alive){

        int x = 0;
        if(speed < 0){
            x = 1200;
        }
        int oppX = 1200 - x;
        while(alive && Math.abs(oppX - x) > Math.abs(speed)) {
            x = x + speed;
            g.setColor(Color.RED);
            g.fillOval(x - size, y - size / 2, size * 2, size);
            //g.fillRect(x, y - size / 4, size, size / 2);
            //g.setColor(Color.BLACK);
            //g.fillOval(x - size / 2, y, size / 8, size / 8);
            p.sleep(500);
            g.setColor(Color.BLUE);
            g.fillOval(x - size + 2, y - size / 2, size * 2 + 3, size + 3);

        }
    }

    //play control class
    //public static void playerControl(int size, int position, int speed){

    //}
}
