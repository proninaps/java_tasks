import java.util.Queue;

public class Manufacturer implements Runnable {
    private final Queue<Integer> buffer ;
    private final int size;
    public Manufacturer(Queue<Integer> buffer, int size){
        this.buffer = buffer;
        this.size = size;
    }
    private int PutIn() throws InterruptedException {
        synchronized (buffer) {
            if (buffer.size() == this.size) {
                buffer.wait();
            }
            int newDigit = (int) (Math.random() * (200 + 1)) - 100;
            buffer.add(newDigit);
            buffer.notifyAll();
            return newDigit;
        }

    }
    public void run(){
        while(true){
            try {
                System.out.println("Производитель пополнил буфер: " + PutIn());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
