import java.util.*;

public class Helloworld{
    public static void main(String[] args){
        Random rnd = new Random();
        System.out.println("Rolling the dice....");

        int dice1 = rnd.nextInt(6)+1;
        int dice2 = rnd.nextInt(6)+1;

        System.out.println("Die 1: " + dice1 + "\n" + "Die 2: " + dice2);
        System.out.println("Total value: " + (dice1+dice2));

        if(dice1+dice2 > 7){
            System.out.println("You won!");
        }else{
            System.out.println("You lose!");
        }
    }
}