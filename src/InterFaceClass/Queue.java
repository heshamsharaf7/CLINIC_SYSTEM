package InterFaceClass;

/**
 * Created by ameen on 3/14/2021.
 */
public interface Queue<E> {
    boolean isEmoty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();
}
