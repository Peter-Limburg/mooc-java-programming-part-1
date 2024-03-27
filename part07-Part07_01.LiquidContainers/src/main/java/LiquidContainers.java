

import java.util.Scanner;
import java.util.ArrayList;



public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int con1 = 0;
        int con2 = 0;

        while (true) {
            System.out.println("First: " + con1 + "/100");
            System.out.println("Second: " + con2 + "/100");

//            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts.length == 1) {
                if (parts[0].equals("quit")) {
                    break;
                } else {

                    String command = parts[0];
                    int amount = Integer.valueOf(parts[1]);

                    if (command.equals("add")) {
                        if (amount > 0) {
                            con1 += amount;
                            if (con1 > 100) {
                                con1 = 100;
                            }
                        }
                    } else if (command.equals("move")) {
//
                        if (amount < 0) {
                            break;
                        }
                        if (amount > 0) {
                            con2 += amount;
                            con1 -= amount;
                            if (con1 < 0) {
                                con1 = 0;
                            }

                            if (con2 > 100) {
                                con2 = 100;
                            }
                        }
                    } else if (command.equals("remove")) {
                        if (amount > 0) {
                            con2 -= amount;
                            if (con2 < 0) {
                                con2 = 0;
                            }
                        }

                    }

                }
            }


        }

    }
}


