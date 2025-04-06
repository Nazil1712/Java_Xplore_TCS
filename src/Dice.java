import java.util.Random;

public class Dice {

    /*public Dice() {
        flip();
    }*/

    public int faceUp1 = 1;
    public int faceUp2 = 1;

    public void flip() {
        Random rand = new Random();
        faceUp1 = rand.nextInt(1,7);
        faceUp2 = rand.nextInt(1,7);
    }

    public void getFaceUp() {
        System.out.println("The value of Dice 1 is : " + faceUp1);
        System.out.println("The value of Dice 2 is : " + faceUp2);
        System.out.println();
    }
}
