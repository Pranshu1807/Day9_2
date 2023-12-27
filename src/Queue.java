public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int value) {
        Node node = new Node(value);
        if (this.front == null) {
            this.front = node;
            this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = node;
        }
    }

    public int getFront() {
        if (this.front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return this.front.data;
    }
}
