class main {
 void check(int age) throws IllegalArgumentException{
    if(age < 18){
       throw new IllegalArgumentException("Age should be greater than or equal to 18");
    }
    else{
        System.out.println("Age is valid");
    }
 }

public static void main(String[] args){
    try{
        main obj = new main();
        obj.check(14);
    }
    catch(IllegalArgumentException e){
        System.out.println(e);
    }
}
}
