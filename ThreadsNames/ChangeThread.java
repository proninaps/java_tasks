class ChangeThread extends Thread {
    private Object lock; //ключ потоков

    public ChangeThread(Object lock) {// метод смены потоков
        this.lock = lock;
    }

    public void run() { //раширяем классический run
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
