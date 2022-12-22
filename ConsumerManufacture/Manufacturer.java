import java.util.Queue;

public class Manufacturer implements Runnable {
    private final Queue<Integer> buffer ;// аналогично с потребителем
    private final int size;
    public Manufacturer(Queue<Integer> buffer, int size){
        this.buffer = buffer;
        this.size = size;
    }
    private int PutIn() throws InterruptedException {//заполняем очередь
        synchronized (buffer) {
            if (buffer.size() == this.size) {// если буфер заполнен, то поток ждет 
                buffer.wait();
            }
            int newDigit = (int) (Math.random() * (200 + 1)) - 100;// генерируем число
            buffer.add(newDigit);//добавляю в очередь
            buffer.notifyAll();//уведомляем второй поток
            return newDigit;
        }

    }
    public void run(){
        while(true){
            try {
                System.out.println("Производитель пополнил буфер: " + PutIn());
            } catch (InterruptedException e) {
                e.printStackTrace();//ловим ошибки
            }
        }
    }
}
