import java.util.LinkedList;

public class LinkedQueue<E> implements interfaceQueue<E>  {
    LinkedList<E>list=new LinkedList<>();//هذه الجاهزة
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.getLast() ;//طابور عكسي
      //  return list.getFirst() ;  //طابور عادي

    }

    @Override
    public void enqueue(E e) {
list.addFirst(e);//طابور عكسي
      //  list.addLast(e);//طابور عادي
    }

    @Override
    public E dequeue() {
     return   list.removeLast();//طابور عكسي
       // return   list.removeFirst(); //طابور عادي
    }
//    public E f() {
//        return lis ;//طابور عكسي
//        //  return list.getFirst() ;  //طابور عادي
//
//    }
//    public sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M) {
//        singleLinkedList.Node<E>h=L.list.head;
//        System.out.println(h);
//        return L;
//    }

    public void rotate(){
        enqueue(dequeue());
    }
}
