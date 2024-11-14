// #simple try catach block 


class  trycatnested{
    public static void main(String[] args) {
   

try{
    System.out.println("Try");
    int a = 10, b = 0;
    int c = a/b;
    System.out.println("Value of c is "+c);
}
catch(ArithmeticException e){
System.out.println(e);
    }
    finally
    {
        System.out.println("Finally");
    }
}
}



// multiple try catch 

try{
    System.out.println("Try");
    int a = 10, b = 0;
    int c = a/b;
    System.out.println("Value of c is "+c);
}catch(ArithmeticException e){
System.out.println("ArithmeticException: "+e);
} try{
    int a[] = {1,2,3,4,5,6,7,8};
    System.out.println("Value of a[10] is "+a[10]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException: "+e);
}
catch(ArithmeticException e){
    System.out.println(e);
}

// nested try block();

// try{
//     stm1

// }
// try{
//     stme12
// }
// catch(ArithmeticException e){ for inner try block(){
// }
// }
// catch(ArrayIndexOutOfBoundsException e){ for outer try block(){
// }

