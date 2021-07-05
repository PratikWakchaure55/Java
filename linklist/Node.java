package linklist;

public class Node {    /// main method should be always in the public class in order to call that
	
	int data;			// class having main method can also run if it don't have public keyword but any other should also not have public keyword as well
	Node next;
	
	
	
	public static void main(String args[])
	{
		
		Node n = new Node();
		n.data = 5;
		n.next=null;
		
		
		System.out.println(n.data);
		
		
	}
	

}


//
//class name   // not working
//{
//	public static void main(String args[])
//	{
//		
//		Node n = new Node();
//		n.data = 5;
//		n.next=null;
//		
//		
//		System.out.println(n.data);
//		
//		
//	}
//
//	
//}