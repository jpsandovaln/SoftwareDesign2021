package practice_two;

public class MyCustomList<T> {
    private Node<T> first;
    private Node<T> last;

    public MyCustomList(){
        first = null;
        last = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(null);
        if(this.first == null)
            this.first = newNode;
        else
            this.last.setNext(newNode);
        last = newNode;
    }

    public void print(){
        Node<T> node = this.first;
        while (node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public void addLast(T data){
        this.add(data);
    }

    public void  addFirst(T data){
        Node<T> newNode = new Node<T>(data);
        if (this.first == null){
            this.first = newNode;
            this.last = newNode;
        }
        else {
            newNode.setNext(this.first);
            this.first = newNode;
        }
    }

}
