public class Q4 {

        public static void main(String[] args) {
            int position = 2;
                    //Integer.parseInt(args[0]);
      int count =4;
                //    Integer.parseInt(args[1]);

            printJosephusPositions(count, position);
        }

        public static void printJosephusPositions(int count, int position) {
           LinkedQueue<Integer> queue = new LinkedQueue<>();
            for (int i = 0; i < count; i++) {
                queue.enqueue(i);
            }

            while(!queue.isEmpty()) {
                // The eliminated position counted from 1.
                for (int i = 1; i <= position; i++) {
                    int eliminatedPosition = queue.dequeue();
                //    System.out.println("ss"+i);
                    if (i == position) {
                        System.out.println(eliminatedPosition + " ");
                        break;
                    }

                    queue.enqueue(eliminatedPosition);
                }

        }
    }

}
