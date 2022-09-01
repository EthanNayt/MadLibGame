import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = keyboardInput.nextLine();
        System.out.println("Enter your hobby");
        String hobby = keyboardInput.nextLine();
        System.out.println("Enter your ambitions");
        String ambitions = keyboardInput.nextLine();
        System.out.println("Enter your weakness");
        String weakness = keyboardInput.nextLine();
        System.out.println("Enter your idol");
        String idol = keyboardInput.nextLine();
        System.out.println("Enter your failure");
        String failure = keyboardInput.nextLine();


        System.out.println("Welcome " + name + " \n"
                + hobby + " is of now \n"
                + ambitions + " is of the future \n"
                + weakness + " is of your success \n"
                + idol + " is of your dream \n"
                + "To not be " + failure + " is your destiny");


    }
}


