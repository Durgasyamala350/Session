public class Stack 
{
	private Node top;
	public int size;
	private  class Node
	{
		private int data;
		private Node next;
	    public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	}
   
	public void push(int data)
	{
		Node temp=new Node(data);
		temp.next=top;
		top=temp;
		size++;		
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		int res=top.data;
		top=top.next;
		size--;
		return res;	
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		return top.data;
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void display()
	{
		Node current=top;
		while(current!=null)
		{
			System.out.println(current.data+"->");
			current=current.next;
		}
	}

}



