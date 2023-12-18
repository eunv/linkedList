public class MyStack<T>{

    private MyLinkedList<T> list = new MyLinkedList<>();

    //push
    public void push(T item) {
        list.add(item);
    }


    //pop
    public T pop() {
        //아무것도 없을때 꺼내려고 하면 예외
        if(list.isEmpty()) {
            throw new IllegalStateException("stack이 비어있다.");
        }
        int lastIndex = list.size()-1; // 0부터니까
        T top = list.get(lastIndex);
        list.delete(lastIndex);
        return top;
    }

    public T peek() {
        //아무것도 없을때 꺼내려고 하면 예외
        if(list.isEmpty()) {
            throw new IllegalStateException();
        }
        int lastIndex = list.size()-1;
        T top = list.get(lastIndex);
        return top;
    }
}
