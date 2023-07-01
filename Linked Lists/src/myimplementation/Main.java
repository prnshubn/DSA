package myimplementation;

public class Main {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.insert(1);
        mll.insert(2);
        mll.insert(3);
        mll.insert(4);
        mll.printList();
        mll.reverseIterative();
        mll.printList();
    }
}
