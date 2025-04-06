import java.awt.*;

public class Car {

    int averagePerLitre;
    Color carColour;
    String numberPlate;


    Car(int avgPerLitre, Color carColour, String numberPlate) {
        this.averagePerLitre = avgPerLitre;
        this.carColour = carColour;
        this.numberPlate = numberPlate;
    }


    public double speedUp(double carSpeed) {
        /*carSpeed += 100;*/
        carSpeed += 100;
        return carSpeed;
    }



}
