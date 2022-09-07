package myimplementation;

public class Main
{
	public static void main(String[] args)
	{
		MyLinkedList mll=new MyLinkedList();
		mll.insert(2);
		mll.insert(3);
		mll.insert(4);
		mll.printList();
		System.out.println(mll.size());
		System.out.println(mll.size());
		mll.insertFirst(1);
		mll.printList();
		System.out.println(mll.size());
		mll.delete();
		mll.printList();
		System.out.println(mll.size());
		mll.deleteFirst();
		mll.printList();
		System.out.println(mll.size());
		mll.insertAtIndex(100,1);
		mll.printList();
		mll.deleteIndex(2);
		mll.printList();
		System.out.println(mll.size());
	}
}
