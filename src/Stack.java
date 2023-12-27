public class Stack {
    public Node top = null;

    public void push(int value) {
        Node node = new Node(value);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    public int peek() {
        return top == null ? -1 : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void pop() {
        if (top == null) {
            System.out.println("The stack is empty");
            return;
        }
        top = top.next;
    }
}
