
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Type numbers: ");
        
        while (true) {
                 
        int number = Integer.parseInt(reader.nextLine());
        stats.addNumber(number);
        if (number == - 1) {
            System.out.println(stats.sum());
            break;
           }
    }
}
}
