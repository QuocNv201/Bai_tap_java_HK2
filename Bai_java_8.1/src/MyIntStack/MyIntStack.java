package MyIntStack;

public class MyIntStack {
    private int[] contents;
    private int tos;  
    
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean push(int element) {
        if (isFull()) {
            expandCapacity(); 
        }
        contents[++tos] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop!");
        }
        return contents[tos--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek!");
        }
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }

    private void expandCapacity() {
        int newCapacity = contents.length * 2; 
        int[] newContents = new int[newCapacity];
        System.arraycopy(contents, 0, newContents, 0, contents.length);
        contents = newContents;
        System.out.println("Stack capacity expanded to " + newCapacity);
    }

    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= tos; i++) {
            System.out.print(contents[i] + " ");
        }
        System.out.println();
    }
}
