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

            } else {
                System.out.println(stats.sum());
                System.out.println(stats.average());
            }
        }
    }
}
