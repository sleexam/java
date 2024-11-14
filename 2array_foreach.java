public class ArraysDemo {
    public static void main(String[] args) {
        // Arrays in Java
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.println("Array element: " + i);
        }

        // Array of objects
        String[] animals = {"Dog", "Cat", "Horse"};
        for (String animal : animals) {
            System.out.println("Animal: " + animal);
        }

        // For-Each style for-loop
        for (String animal : animals) {
            System.out.println("For-Each: " + animal);
        }
    }
}
