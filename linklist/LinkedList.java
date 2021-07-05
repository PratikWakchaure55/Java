package linklist;

public class LinkedList {

	
	Node head=null;
	
	
	public void insert(int data)
	{
		
		
		Node n = new Node();
		n.data=data;
		n.next=null;
		
		if(head == null)
		{
			head = n;
		}
		else
		{
			Node node = head;
			
			while(node.next != null)
			{
				node = node.next;
			}
			
			node.next = n;
			
			
		}
		
	
	}
	
	
	public void insertFirst(int data)
	{
		
		Node n = new Node();
		n.data =data;
		n.next =null;
		
		
		if(head == null)
		{
			head  = n;
		}
		else
		{
			n.next =head;
			head = n;
		}
		
	}
	
	public void insertLast(int data)
	{
		Node n = new Node();
		n.data =data;
		n.next = null;
		
		if(head == null)
		{
			head = n;
		}
		else
		{
			Node node = head;
			 
			while(node.next!=null)
			{
				node = node.next;
			}
			
			node.next = n;
			
		}
			
	}
	
	public void insertAtIndexPos(int loc, int data)
	{
		Node n = new Node();
		n.data = data;
		n.next = null;
		
		Node node = head;
		
		if(loc == 0)
		{
			insertFirst(data);
			
		}
		else if(loc == length())
		{
			insertLast(data);
		}
		else
		{
		
			int i;
			for(i=0; i<loc-1; i++)
			{
				node = node.next;
			}
			
			n.next = node.next;
			node.next = n;
		}
		
		
		
		
	}
	
	
	public void insertAtPos(int loc, int data)
	{
		Node n = new Node();
		n.data = data;
		n.next = null;
		
		Node node = head;
		
		if(loc == 1)
		{
			insertFirst(data);
			
		}
		else if(loc == length()+1)
		{
			insertLast(data);
		}
		else
		{
		
			int i;
			for(i=0; i<loc-2; i++)
			{
				node = node.next;
			}
			
			n.next = node.next;
			node.next = n;
		}
		
		
		
		
	}
	
	public void delete()
	{
		
		if(head != null)
		{
			Node n = head;
			
			while(n.next.next!=null)
			{
				n=n.next;
				
			}
			
			n.next = null;
			
			
		}
		
	}
	
	
	public void deleteFirst()
	{
		if(head!=null)
		{
		   
		   Node temp = head.next;
		   head.next = null;
		   head = temp;
		   
		   
		}
	}
	
	
	
	public void deleteLast()
	{
		
		if(head != null)
		{
			Node n = head;
			
			while(n.next.next!=null)
			{
				n=n.next;
				
			}
			
			n.next = null;
			
			
		}
		
	}
	
	
	public void deleteAtPos(int ind)
	{
		
		
		if(ind == 0)
		{
			deleteFirst();
		}
		else if(ind == length()-1)
		{
			deleteLast();
		}
		else
		{
			int i;
			Node n = head;
			
			for( i=0 ;i<ind-1;i++)
			{
				n=n.next;
			}
			
			Node temp = n.next.next;
			n.next.next = null;
			n.next = temp;
			
		}
		
		
		
	}
	
	

	public void display()
	{
		Node n = head;
		
		while(n!=null)
		{
			System.out.println(n.data);
			n= n.next;
			
		}
		
	}
	
	
	public void middle()
	{
		Node first = head;
		Node second = head;
		
		int count = 1;
		while(first!=null)
		{
			first = first.next;
			
			if(count%2==0)
			{
			second = second.next;
			}
			count++;
		}
		
		  System.out.println(second.data); 
		
		
	}
	
	public int length()
	{
		Node n = head;
		int count = 0;
		
		while(n!=null)
		{
			count++;
			
			n= n.next;
			
		}
		
//		System.out.println(count);
		return count;
		
	}
	
	
}
