import java.util.*;

public class Fish {
    private int speed;
    private int size;
    private int position;
    private boolean alive;

    public Fish(int speed, int size, int position, boolean alive){
        this.speed = speed;
        this.size = size;
        this.position = position;
        this.alive = true;
    }

    public boolean getStatus() {
        return alive;
    }

    public int getSpeed() {
        return speed;

    }

    public int getSize() {

        return size;
    }

    public int getPosition() {

        return position;
    }
}
