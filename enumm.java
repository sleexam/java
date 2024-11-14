enum fruit{
    APPLE, ORANGE, BANANA, PEACH;
}

public class enumm {
    public static void main(String[] args){
        for (fruit f : fruit.values()) {
            System.out.println(f);
            }
        
            System.out.println(fruit.valueOf("APPLE"));
    }
}
