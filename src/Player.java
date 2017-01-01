/**
 * Created by benjaminmacmillan1 on 12/6/16.
 */
public class Player {
    private boolean isAlive;
    private int size;

    public Player(){
        this.isAlive = true;
        this.size = 50;
    }

    public boolean getStatus(){
        return isAlive;
    }

    public int getSize(){
        return size;
    }
}
