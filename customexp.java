import java.util.*;

class myExp extends Exception{
    myExp(int age){
       System.out.println("age is less than 18");
    }
}

class customexp{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    if(age > 18){
        System.out.println("ok go");

    }
    else {
        try{
            throw new myExp(age);
        }
        catch(myExp e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    }
}
