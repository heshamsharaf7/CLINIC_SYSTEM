package UesClasses;

/**
 * Created by ameen on 2/21/2021.
 */
public class LinkedListr<E> {
    Node<E> head=null;
    Node <E> tail=null;
    private int size=0;
    private static class Node <E>{
        E element;
        Node <E> next;

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
    public E first()
    {
        if(isEmpty()) return null;

        return head.getElement();

    }
    public E last()
    {
        if(isEmpty()) return null;

        return tail.getElement();

    }
    public void addfirst(E element)
    {
        head=new Node<E>(element,head);
        if(size==0)
        tail=head;
        size++;
    }
    public void addlast(E element)
    {
        Node <E> newwest=new Node<E>(element,null);
        if(isEmpty())
            head=newwest;
        else
            tail.setNext(newwest);
        tail=newwest;
        size++;

    }
    public E removeFirst()
    {
        if(isEmpty()) return null;
        E deleted=head.getElement();
        head=head.getNext();
        size--;
        if(size==0)
            tail=head;
        return deleted;

    }
    public String print()
    {
        Node<E>i=head;
        String x="" ;
        while (i!=null)
        {
            x=x+i.getElement().toString()+"\n";
            i= i.getNext();
        }
        return x;

    }

}
