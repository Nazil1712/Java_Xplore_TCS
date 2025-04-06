import java.awt.*;

public class Dog {

    String dogName;
    int dogAge;
    Color dogColour;

    Dog(String name, int age, Color colour) {
        this.dogAge = age;
        this.dogColour = colour;
        this.dogName = name;
    }

    public void bark() {
        System.out.println("Barking......🐕🐩🐕‍🦺🐶");
    }

    public void printMyDetails() {
        System.out.println("My Name is : " + this.dogName);
        System.out.println("My Age is : " + this.dogAge);
        System.out.println("My Colour is : " + this.dogColour.toString());
    }

}
