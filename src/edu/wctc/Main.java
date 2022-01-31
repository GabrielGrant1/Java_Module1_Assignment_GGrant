package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean j = true;
        do {
            String[] choice = {"mild or spicy", "tea or coffee", "breakfast or brunch", "summer or winter", "paper or plastic"};
            int[] input = new int[5];
            int score = 0;
            Scanner leftOrRight = new Scanner(System.in);
            Scanner restart = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                askUser(choice[i]);
                int lOr = leftOrRight.nextInt();
                input[i] = lOr;
            }

            for (int answer : input) {
                score += answer;
            }
            if (score < 3) {
                System.out.println("You prefer life to be clam and organized.");
            } else if (score > 3) {
                System.out.println("You prefer life to be spontaneous and active.");
            } else {
                System.out.println("You prefer a good balance in life.");
            }
            System.out.println("If you would like to play again, enter 'true', if not, enter 'false'."); //I wasn't sure where to put the boolean required by the rubric, so I used it here.
            j = restart.nextBoolean();
        }while(j == true);
    }

    static void askUser(String choice) {
        System.out.println("Enter 0 for the choice on the left");
        System.out.println("Enter 1 for the choice on the right");
        System.out.println("Do you prefer " + choice + "?");
    }
}
