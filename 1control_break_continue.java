public class LoopingAndJumpingDemo {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            if (j == 4) {
                break;
            }
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }
}
