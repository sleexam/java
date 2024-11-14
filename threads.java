class A implements Runnable {
    public void run(){
        for(int i =1 ;i<5; i++){
            System.out.println("Thread A: " + i);
        }
    }
}

class threads{
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();
        for(int i =1 ;i<5; i++){
            System.out.println("Main Thread: " + i);
            }
            }
        

}
