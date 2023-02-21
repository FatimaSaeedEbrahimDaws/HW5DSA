public class Queue {
    public static void main(String[] args) {
        ArrauQueue<Integer> queue = new ArrauQueue<>(20);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        while (!queue.isEmpty()){
            System.out.print(queue.dequeue()+"  ");
        }
        System.out.println();
        LinkedQueue<Integer> queue1 = new LinkedQueue<>();
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.size());
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);
        queue1.enqueue(60);
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.size());
        while (!queue1.isEmpty()){
            System.out.print(queue1.dequeue()+"  ");
        }

    }
}
