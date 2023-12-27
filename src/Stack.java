public class Stack {
    public Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (this.top == null) {
            this.top = node;
        } else {
            node.next = this.top;
            this.top = node;
        }
    }

    public int peek() {
        if (this.top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.top.data;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void pop() {
        if (this.top == null) {
            System.out.println("The stack is empty");
            return;
        }
        this.top = this.top.next;
    }
}