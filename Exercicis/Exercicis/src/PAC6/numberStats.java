package PAC6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics stats2 = new NumberStatistics();
        NumberStatistics stats3 = new NumberStatistics();
        System.out.println("Type numbers: ");

        while (true) {

            int number = Integer.parseInt(reader.nextLine());

            if (number != - 1) {
                stats.addNumber(number);
                if (number % 2 != 0){
                    stats3.addNumber(number);
                } else {
                    stats2.addNumber(number);
                }

            } else {
                stats.sum();
                stats.average();
            System.out.println("\nsum: " + stats.sum() + "\nsum of even: " + stats2.sum() + "\nsum of odd: " + stats3.sum());
            }
        
        }
    }
    
}
