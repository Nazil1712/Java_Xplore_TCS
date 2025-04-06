import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        /*

        // 1) Dealing with class

        System.out.println(Color.black + "Hello, World!");

        Car c1 = new Car(4, Color.black, "GJ-06-5069");
        System.out.println(c1.averagePerLitre);
        System.out.print(c1.carColour);*/


        /*

        // 2) Dealing with Strings
        // - Strings are immutable
        String userInput = "entertainment";
        String upperCased = userInput.toUpperCase();

        System.out.println(userInput);
        System.out.println(upperCased);


        char firstChar = userInput.charAt(0);

        System.out.println("Contains : "+ userInput.contains("Enter".toLowerCase()));*/


        // 3) Working with userInput - Scanner Class
        /*Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of x : ");
        int x = sc.nextInt();

        System.out.print("Please enter the value of y : ");
        int y = sc.nextInt();

        int sum = x + y;

        System.out.println("The sum of x : " + x + " and y : " + y + " is : " + sum);*/



        // 4) Working with Arrays

        /*int[] numbersArr = new int[5]; // once you set the size of array then you can't insert more numbers in this array than size

        numbersArr[0] = 18;
        numbersArr[1] = 25;
        numbersArr[2] = 19;
        numbersArr[3] = 11;
        numbersArr[4] = 91;


        int[] num2 = {78,12,69,23,45,73};

        System.out.println("Before Arr : " + Arrays.toString(num2));
        Arrays.sort(num2);
        System.out.println("After Arr : " + Arrays.toString(num2));


        String[] friendsName = {"P. Zaid","B. Sohil","K. Ruhan","P. Faizan"};

        System.out.println("@ 1 : " + friendsName[1]);

        friendsName[1] = "T. Amaan";

        System.out.println("After @ 1 : " + friendsName[1]);

        System.out.println(Array.get(friendsName,3));

        System.out.println("Length : " + friendsName.length);
*/



        // 5) Pass by value and pass by reference

        /*
        Car myFerrari = new Car(4,Color.RED,"GJ06-KM-7968");

        // No change because Java only have pass by value
        // double myCarSpeed = 50;
        // myFerrari.speedUp(myCarSpeed);
        System.out.println(myCarSpeed);


        // Hence using return
        double myFerruSpeed = 50;
        myFerruSpeed = myFerrari.speedUp(myFerruSpeed);
        System.out.println(myFerruSpeed);*/



        // 6) .replace
        /*String name = "Nazil";
        System.out.println(name.replace("N","Br"));*/



        // 7) Dog Class
       /* Dog sheru = new Dog("Sheru",2,Color.black);

        // sheru.bark();
        sheru.printMyDetails();*/



        // 8) Conditional
        /*Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the age : ");
        int age = sc.nextInt();

        if(age >=0 && age <= 5) {
            System.out.println("Baby");
        } else if(age >= 6 && age <= 11) {
            System.out.println("Kid");
        } else if(age >= 12 && age <= 17) {
            System.out.println("Teen");
        } else if(age >= 18) {
            System.out.println("Adult");
        }
        else{
            System.out.println("Invalid Age!");
        }*/




        // 8) While Loop

       /* int x = 4;

        while(x > 0) {
            System.out.println("Current X : " + x);
            x--;
        }

        System.out.println("Final X : " + x);
        System.out.println();*/




        // 9) do while Loop

        /*int x = 5;
        do{
            System.out.println("Current X : " + x);
            x--;
        }while (x > 80);

        System.out.println("Final X : " + x);*/



        // 10) For Loop

        /*for(int i=0; i<5; i++) {
            System.out.println("Current i : "+ i);
        }*/


        // 11) Using Library for extra functionalities

        /*double power = Math.pow(2,3);
//        System.out.println(power);

        double squareRoot = Math.sqrt(16);
//        System.out.println(squareRoot);


        Random randomNum = new Random();

        int r1 = randomNum.nextInt();
        System.out.println(r1);

        int r2 = randomNum.nextInt(10); // will give random number betn 0 & 9
        System.out.println(r2);*/



        // 12) Using Coin Class
        /*Coin c1 = new Coin();

        for(int i=0; i<10; i++) {
            String ans = c1.getFaceUp();
            System.out.println(ans);
        }*/


        // 13) Using Dice Class
        Dice d1 = new Dice();

        for (int i=0; i<10; i++) {
            d1.flip();
            d1.getFaceUp();
        }
    }
}