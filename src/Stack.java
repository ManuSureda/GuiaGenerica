
import java.util.ArrayList;

public class Stack<T> {

    private StackNode top;

    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        StackNode<T> newTop = new StackNode<>();
        newTop.setData(data);
        newTop.setNext(this.top);
        this.top = newTop;
    }

    public T pop() {
        T data = (T) this.top.getData();
        this.top = this.top.getNext();
        return data;
    }

    public int getSize() {
        int size = 0;
        StackNode<T> node = this.top;
        while(node != null){
            size++;
            node = node.getNext();
        }
        return size;
    }

    @Override
    public String toString() {
        String data = "---Top---";
        StackNode<T> node = this.top;
        while(node != null){
            data = data + "\n" + node.getData();
            node = node.getNext();
        }
        data = data + "\n---Base---";
        return data;
    }

}