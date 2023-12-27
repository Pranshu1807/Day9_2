public class Main {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();

        // System.out.println(q.getFront());

        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        while (!q.isEmpty()) {
            System.out.println(q.getFront());
            q.deQueue();
        }
    }
}