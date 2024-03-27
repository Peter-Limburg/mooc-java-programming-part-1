
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
    static ArrayList<Bird> birds = new ArrayList<>();

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("?");
            String input = scan.nextLine();

            if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                Bird bird = new Bird(name, latin, 0);
                birds.add(bird);
            } else if (input.equals("Observation")) {
                System.out.println("Bird?");
                String answer = scan.nextLine();
                boolean found = false;
                for (Bird bird : birds) {
                    if (bird.getName().equals(answer)) {
                        bird.increaseCount(1);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Not a bird!");

                }
            } else if (input.equals("All")) {
                for (Bird bird : birds) {
                    String observationText = (bird.getCount() == 1) ? " observation" : " observations";
                    System.out.println(bird.getName() + " (" + bird.getLatin() + "): " + bird.getCount() + observationText);
                }
            } else if (input.equals("One")) {
                System.out.println("Bird?");
                String answerOne = scan.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(answerOne)) {
                        String observationText = (bird.getCount() == 1) ? " observation" : " observations";
                        System.out.println(bird.getName() + " (" + bird.getLatin() + "): " + bird.getCount() + observationText);
                    }
                }
            } else if (input.equals("Quit")) {
                break;
            }
        }
    }

}


