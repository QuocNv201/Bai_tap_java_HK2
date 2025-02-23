package MyIntStack;

public class TestMyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack(); 

        stack.push(60);
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

