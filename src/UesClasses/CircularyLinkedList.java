package UesClasses;

/**
 * Created by ameen on 2/28/2021.
 */
public class CircularyLinkedList <E>{
  private int size=0;
    private Node<E> tail=null;
    private static class Node <E>{
     private    E element;
       private Node <E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }
    public E last()
    {
        if(isEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E element)
    {
        if(size==0){
        tail=new Node<E>(element,null);
        tail.setNext(tail);}
        else {
            Node<E> newset=new Node<E>(element,tail.getNext());
            tail.setNext(newset);
        }
        size++;
    }
    public void addlast(E element)
    {
        addFirst(element);
        tail=tail.getNext();
    }
    public void Rotate()
    {
        if(tail !=null)
            tail=tail.getNext();
    }
    public E removeFirst()
    {
        if(isEmpty()) return null;
        Node<E>x=tail.getNext();
        if(x==tail)tail=null;
        else {
            tail.setNext(tail.getNext());
            size--;

        }
        return x.getElement();
    }

}
