class Test {
   
    void div(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }
}

class throwsprogram {
    public static void main(String[] args) {
        Test t = new Test();
        
        try {
            t.div(20, 0); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
