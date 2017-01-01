import java.util.*;

public class Fish {
    private int speed;
    private int size;
    private int position;
    private boolean alive;
    private Random r;

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
        // speed is -50 to 50
        int speed = r.nextInt(6) * 20 - 50;
        return speed;

    }

    public int getSize() {
        // size is 10 to 90
        int size = r.nextInt(11) * 8 + 10;
        return size;
    }

    public int getPosition() {
        // y is 10 to 720
        int position = r.nextInt(72) * 10 + 10;
        return position;
    }
}
