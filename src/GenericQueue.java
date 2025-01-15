import java.util.Queue;

public class GenericQueue <E>{
    private Queue<E> queue;

    public Queue<E> getQueue() {
        return queue;
    }

    public void enQueue(E element){
        queue.add(element);
    }
    public E deQueue(){
        return queue.remove();
    }
}
