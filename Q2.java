public class Q2 {
    public static void main(String[] args) {
       ArrauQueue<Integer>queue=new ArrauQueue<>(10);
       ArrauQueue<Integer>q=new ArrauQueue<>(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.print("list1: ");
        queue.print(queue);
       q= q.clone(queue);
        System.out.print("\nlist2: ");
       q.print(q);
        System.out.print("\nlist1: ");
        queue.print(queue);

    }
}
