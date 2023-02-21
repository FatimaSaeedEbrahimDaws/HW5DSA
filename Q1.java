public class Q1 {
    public static void main(String[] args) {
        ArrauQueue<Integer> queue = new ArrauQueue<>(6);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.size());
        queue.rotate(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.print(queue);

    }
}
