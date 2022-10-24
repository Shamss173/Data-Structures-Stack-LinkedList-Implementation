
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

}

public class Stack_Linked {

    Node top = null;

    void push(int data) {
        Node node = new Node(data);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    int peek() {
        return top.data;
    }
    void pop() {
        if (!(top == null)) {
            System.out.println("Removed Element: " + top.data);
        }
         top = top.next;
    }
       public static void main(String arg[]) {
        Stack_Linked stack = new Stack_Linked();
        for (int i = 5; i>=0; i--) {
            System.out.println("Inserting: "+ i);
            stack.push(i);
        }
        stack.pop();
        stack.pop();
        stack.pop();
            
       System.out.println("\n Top Element: " + stack.peek());
    }
}
