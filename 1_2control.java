public class ControlAndLoopingDemo {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Using if-else statement:");
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is non-positive.");
        }

        int day = 3;
        System.out.println("\nUsing switch statement:");
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        System.out.println("\nUsing for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("\nUsing while loop:");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("\nUsing do-while loop:");
        int num2 = 1;
        do {
            System.out.println("Num: " + num2);
            num2++;
        } while (num2 <= 3);
    }
}
