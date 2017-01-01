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

        Fish bob = new Fish(2, 20, 100, true);

        Player person = new Player();
        //playerControl(person.getSize(), );

        while(person.getStatus() == true){

        }
    }

    // background ocean, has nothing to do with player
    public static void oceanBg(Graphics g, DrawingPanel p){
        g.setColor(Color.ORANGE);
        g.fillRect(0, 620, 1200, 100);

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

    //play control class
    //public static void playerControl(int size, int position, int speed){

    //}
}
