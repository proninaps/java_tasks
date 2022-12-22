class ChangeThread extends Thread {
    private Object lock; // определяем ключ потоков

    public ChangeThread(Object lock) {
        this.lock = lock;
    }

    public void run() { //расширяем метод run
        while (true) { //делаем бесконечный цикл
            synchronized (lock) { // синхронизируем потоки
                    System.out.println(getName());// Выводим имя потока
                    lock.notify();// продолжаем работу предидущего потока
                try {
                    lock.wait();// переводим поток в состояние ожидания
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
