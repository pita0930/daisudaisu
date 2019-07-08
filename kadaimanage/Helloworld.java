import java.util.*;

public class Helloworld{


    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input_txt = scanner.next();
        System.out.println("Hello, " + input_txt + "!");

        Random rnd = new Random();
        System.out.println("Rolling the dice....");

        int dice1 = rnd.nextInt(6)+1;
        int dice2 = rnd.nextInt(6)+1;

        System.out.println("Die 1: " + dice1 + "\n" + "Die 2: " + dice2);
        System.out.println("Total value: " + (dice1+dice2));


    }
}