package Step6.Step6_Link0_2;
/*
Реализовать свой LinkedList

 */
public class Main {
    private Node first;

    public Main(Node first) {
        this.first = first;
    }

    public int get(int index) {
        int current = 0;
        Node currentNode = first;
        while (current++ <= index) {
            currentNode = currentNode.getNext();
        }
        return currentNode.value;
    }

    public void add(int value) {
        first = new Node(value, first);
    }

    public static void main(String[] args) {

    }

    private static class Node {
        private final int value;

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

//        public Node getPrevious() {
//            return previous;
//        }

        private final Node next;
//        private final Node previous;

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
