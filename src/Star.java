public class Star {

    public static void main(String[] args) throws InterruptedException {
        char star = '*';
        int patratele=80;
        int speed=100;

        while (true) {
            for (int c = 0; c < patratele; c++) {
                printStar(star, speed, c);
            }
            for (int c = patratele; c >= 0; c--) {
                printStar(star, speed, c);
            }
        }
    }

    private static void printStar(char star, int speed, int c) throws InterruptedException {
        System.out.print("\r");
        for (int i = 0; i < c; i++) {
            System.out.print(" ");
        }
        System.out.print(star);
        Thread.sleep(speed);
    }
}