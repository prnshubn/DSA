package myimplementation;

public class MyLinkedList
{
	Node head;
	
	//insert element at first
	public Node insertFirst(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return head;
		}
		node.next=head;
		head=node;
		return head;
	}
	
	//insert element at last
	public Node insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return head;
		}
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=node;
		return head;
	}
	
	//insert element at index
	public Node insertAtIndex(int data,int index)
	{
		if(this.size()<index)
			return head;
		else if(index==0)
		{
			this.insertFirst(data);
			return head;
		}
		else if(index==this.size()-1)
		{
			this.insert(data);
			return head;
		}
		else
		{
			Node node=new Node(data);
			Node traversal=head;
			for(int i=0;i<index-1;i++)
				traversal=traversal.next;
			Node hold=traversal.next;
			traversal.next=node;
			node.next=hold;
			return head;
		}	
	}
	
	//delete element from first
	public Node deleteFirst()
	{
		if(head==null)
			return head;
		else
		{
			head=head.next;
			return head;
		}
	}
	
	//delete element from last
	public Node delete()
	{
		if(head==null)
			return head;
		else if(head.next==null)
		{
			head=null;
			return head;
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
				temp=temp.next;
			temp.next=null;
			return head;
		}
	}
	
	//delete element from index
	public Node deleteIndex(int index)
	{
		if(this.size()<index)
			return head;
		else if(index==0)
		{
			this.deleteFirst();
			return head;
		}
		else if(index==this.size()-1)
		{
			this.delete();
			return head;
		}
		else
		{
			Node traversal=head;
			for(int i=0;i<index-1;i++)
				traversal=traversal.next;
			Node temp=traversal.next.next;
			traversal.next=temp;
			return head;
		}
	}
	
	//return size
	public int size()
	{
		int count=0;
		if(head==null)
			return count;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	//print LinkedList
	public void printList()
	{
		if(head==null)
		{
			System.out.println("null");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
