public class PolymorphismDemo {
    // Method Overloading
    void display(int num) {
        System.out.println("Number: " + num);
    }

    void display(String text) {
        System.out.println("Text: " + text);
    }

    // Constructor Overloading
    PolymorphismDemo() {
        System.out.println("Default constructor");
    }

    PolymorphismDemo(String message) {
        System.out.println("Constructor with message: " + message);
    }

    public static void main(String[] args) {
        PolymorphismDemo obj1 = new PolymorphismDemo();
        obj1.display(10);
        obj1.display("Hello");
        PolymorphismDemo obj2 = new PolymorphismDemo("Custom message");
    }
}
