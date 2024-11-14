class A extends Thread{
    public void run(){
        
    String n =Thread.currentThread().getName();
    for (int i = 0; i < 4; i++)
{
    System.out.println(n);
}
}
}

class   extthread{
    public static void main(String[] args) {
        A a = new A();
        A b = new A();

        a.setName("Thread 1");
        b.setName("Thread 2");

        a.start();
        b.start();


    }
    }
