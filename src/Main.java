public class Main {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack();
        st.push(70);
        st.push(30);
        st.push(56);
        st.push(40);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}