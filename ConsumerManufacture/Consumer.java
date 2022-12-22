import java.util.Queue;

public class Consumer implements Runnable { // создаем класс потребитея наследуемый от Runnable
    private final Queue<Integer> buffer;// создаю общую очередь для потоков
    private final int size;// максимальную вместимость буффера
    public Consumer(Queue<Integer> buffer, int size){// конструктор
        this.buffer = buffer;
        this.size = size;
    }
    private Integer GetAll() throws InterruptedException {// метод потребления 
        synchronized (buffer){
            if (buffer.size()==0){// если буфер пустой то поток ждет когда он заполнится
                buffer.wait();
            }
            buffer.notifyAll();//уведомляем второй поток 
            return buffer.poll();//удаляем число из начала очереди и возвращаем 

        }
    }
    public void run() {//расширяем run 
        while (true) {
            try {
                System.out.println("Потребитель потребил буфер: " + GetAll());
            } catch (InterruptedException e) {// ловим исключения 
                e.printStackTrace();
            }
        }
    }
}
