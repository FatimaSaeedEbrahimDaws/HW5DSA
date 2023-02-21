public class ArrauQueue<E> implements interfaceQueue<E>{
private  int s=0;
private int  f=0;
    static  final  int CAPACITY=10;
    E []data;
    public ArrauQueue(int cap) {
      data= (E[]) new Object[cap];
    }
    public ArrauQueue() {
      this(CAPACITY);
    }

public void rotate(ArrauQueue<E> q){
        q.enqueue(q.dequeue());
}
public  void  print(ArrauQueue<E>q) {
    ArrauQueue<E> q1 = new ArrauQueue<>();
    while (!q.isEmpty()) {
        System.out.print(q.first() + "  ");
        q1.enqueue(q.dequeue());

    }
    while (!q1.isEmpty()) {
        q.enqueue(q1.dequeue());

    }

}
    public ArrauQueue<E> clone(ArrauQueue<E>q){
       ArrauQueue<E>q1=new ArrauQueue<>(10);
       int ff=q.size();
        while (ff>0){
            q1.enqueue(q.first());
            rotate(q);
            ff--;
        }

        return q1;


}
    @Override
    public boolean isEmpty() {
        return s==0;
    }

    @Override
    public int size() {
        return s;
    }

    @Override
    public E first() {
        if (isEmpty())return  null;
        return data[f];
    }

    @Override
    public void enqueue(E e) {
        if(size()==data.length)
            throw new IllegalStateException("Queue is full");
int x=(f+s)%data.length;
data[x]=e;
s++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())return  null;
        E delet=data[f];
       data[f]=null;
       f=(f+1)%data.length;
       s--;
       return delet;
    }

    @Override
    public sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M) {
        return null;
    }
}
