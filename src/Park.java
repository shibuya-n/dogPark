//Use the concept of method overriding in at least one place to customize the behavior of your animals
//Inside the main() method of your Park class, create other animals along with the random dogs that already get created


        import java.util.*;

public class Park {

    public static int userAnswer = 0;

    public static void main(String[] args){
        ask();
        parkDog.randomDog();
        parkAnimals.randomCritters();

    }
    public static void ask(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("How many dogs are there? Insert Number");

        userAnswer = Integer.parseInt(String.valueOf(scannerObject.nextLine()));
    }
}

