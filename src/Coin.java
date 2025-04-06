import java.util.Random;

public class Coin {
    public final static int HEADS = 0;
    public final static int TAILS = 1;

    private int faceUp;

    public Coin() {
        flip();
    }

    public void flip() {
        Random rand = new Random();
        faceUp = rand.nextInt(2); // will generate either 0 or 1
    }


    public String getFaceUp() {

        if(faceUp == HEADS) {
            return "HEADS";
        }else{
            return "TAILS";
        }
    }
}
