public class Main {
    public static void main(String[] strings) {
        Object lock = new Object();
        ChangeThread Thread1  = new ChangeThread(lock);
        ChangeThread Thread2  = new ChangeThread(lock);
        Thread1.start();
        Thread2.start();

    }
}
