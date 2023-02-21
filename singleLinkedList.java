public class singleLinkedList<E>{
  public    Node<E>head=null;
 protected Node<E>tail=null;
   public   int size=0;

    public singleLinkedList() {
    }

    public  boolean isEmpty(){
        return  size==0;
    }
    public void  re(){
        Node<E>h=head;
        head=tail;
        tail=h;
    }
    public  int size()
    {return size;}
    public E first()
    {
       if( isEmpty())return  null;
       return  head.getElement();
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.element;
    }
    public void addFirst(E newElment)
    {
      head=new Node<E>(newElment,head);
        if (isEmpty() )
        tail=head;
        size++;

    }
    public void addLast(E newElment)
    {
        Node<E>newest=new Node<E>(newElment,null);
        if (isEmpty() )head=newest;
        else    tail.setNext(newest);

        tail=newest;
        size++;

    }
    public E removeFirst(){
        if(isEmpty())return  null;
        E del=head.element;
        head=head.next;
        size--;
        if (size==0)
            tail=null;
            return  del;


    }
    public Node<E> getSecondLast(){
        Node<E>i=head;
        while (i.next.next!=null){
            i=i.next;
        }
        return  i;
    }
    public void print(){
        Node<E>i=head;
        while (i!=null){
            System.out.println(i.getElement());
            i=i.next;
        }
       // System.out.println(i.getElement());
    }
    public int sum(singleLinkedList<E>list){
        Node<E>i=head;
        int s=0;
        while (i!=null){
     s=s+(int)i.getElement();
            i=i.next;
        }
       // s+=(int)i.getElement();
       return s;
    }
    public Node<E> removeNode(E n){
        Node<E>i=head;
        if(i.getElement()==n)
            removeFirst();
        else
        while (i.next!=null){

            if (i.getNext().getElement()==n)
            {
              i.setNext(i.getNext().getNext());
            }
            i=i.next;
        }
        return  i;
    }
    public int methodSize(singleLinkedList<E> list){
        Node<E>i=head;
        int s=0;
        while (i!=null){
            s++;
            i=i.next;
        }return  s;
    }
    public singleLinkedList<E> swap(singleLinkedList<E> list,int i,int j){
        if(size<=i&&size<=j)return list;
        else if(size>i&&size>j) {
        Node<E>f=head;
        Node<E>l=head;
        for (int k = 0; k <i; k++) {
            f=f.next;
        }
        for (int k = 0; k <j; k++) {
            l=l.next;

        }E temp=f.element;
        f.setElement(l.element);
        l.setElement(temp);

    }  return  list;}
    public singleLinkedList<E>  append(singleLinkedList<E> L,singleLinkedList<E> M){
        if (!L.isEmpty()){
            L.size=L.size+M.size;
        L.tail.next=M.head;
        L.tail= M.tail;
        }
//        while (!M.isEmpty()){
//       L.addLast(M.removeFirst());}


        return  L;
    }
    public  singleLinkedList<E>concat (singleLinkedList<E> L,singleLinkedList<E>M){

        singleLinkedList<E>c1=new singleLinkedList<>();


            Node<E>i=L.head;
            while (i!=null){
             c1.addLast(i.getElement());
                i=i.next;
            }

        Node<E>j=M.head;
        while (j!=null){
            c1.addLast(j.getElement());
            j=j.next;
        }

        return c1;
    }
    public boolean  equals(singleLinkedList<E> L,singleLinkedList<E> M){
            boolean f=false;
            Node<E>m=M.head;
            Node<E>l=L.head;
            if (L.size()==M.size()){
                while (m!=null&&l!=null){
                    if (m.element==l.element)
                        f=true;
                    else {
                        f=false;


                    }
                    m=m.next;
                    l=l.next;
                }
            }



        return  f;
    }
    public void revers(singleLinkedList<E> L){

if (!isEmpty()){
    Node prev=null;
    Node curr=head;
    Node next= null;
    while (curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}


    }
    public void  rotate(){
        addLast(removeFirst());
    }
    protected static  class Node<E>{
     E element;
     Node<E>next;

     public Node(E element, Node<E> next) {
         this.element = element;
         this.next = next;
     }

        public Node() {

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

}
