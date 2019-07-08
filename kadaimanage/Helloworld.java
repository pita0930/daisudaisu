import java.util.Random;

public class Helloworld{

    Random rnd = new Random();
    int random1 = rnd.nextInt(5);
    public static void main(String[] args){
        Random rnd = new Random();
        System.out.println("Rolling the dice....");

        int dice1 = rnd.nextInt(6)+1;
        int dice2 = rnd.nextInt(6)+1;

        System.out.println("Die 1: " + dice1 + "\n" + "Die 2: " + dice2);
        System.out.println("Total value: " + (dice1+dice2));
    }
}