import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueTwoStacks {

    private Deque<Integer> inStack = new ArrayDeque<>();
    private Deque<Integer> outStack = new ArrayDeque<>();

    public static void main(String[] args) {

    }

    // O(1)
    private void enqueue(int value) {
        inStack.push(value);
    }

    // O(m) m = number of value we push in $outStack
    private int dequeue(int value) {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                int newestValue = inStack.pop();
                outStack.push(newestValue);
            }

            if (outStack.isEmpty()) {
                throw new NoSuchElementException("No Value present to pop");
            }
        }
        return outStack.pop();
    }
}
