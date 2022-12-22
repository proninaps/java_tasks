import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Integer> buffer;
    private final int size;
    public Consumer(Queue<Integer> buffer, int size){
        this.buffer = buffer;
        this.size = size;
    }
    private Integer GetAll() throws InterruptedException {
        synchronized (buffer){
            if (buffer.size()==0){
                buffer.wait();
            }
            buffer.notifyAll();
            return buffer.poll();

        }
    }
    public void run() {
        while (true) {
            try {
                System.out.println("Потребитель потребил буфер: " + GetAll());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
