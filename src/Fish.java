import java.awt.*;

/**
 * Created by benjaminmacmillan1 on 12/4/16.
 */
public class Fish {
    private int speed;
    private int size;
    private int position;
    private boolean alive;

    public Fish(int speed, int size, int position, boolean alive){
        this.speed = speed;
        this.size = size;
        this.position = position;
        this.alive = alive;
    }

    public boolean eat(){
        return true;
    }

    public int behavior(){
        return speed;

    }

    public int appearence(){
        return size;

    }
}
