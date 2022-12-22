public class Main {
    public static void main(String[] strings) {
        Object lock = new Object(); // создаю объект ключа
        ChangeThread Thread1  = new ChangeThread(lock); // два потока
        ChangeThread Thread2  = new ChangeThread(lock);
        Thread1.start();// запускаю оба потока
        Thread2.start();

    }
}
