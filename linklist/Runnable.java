package linklist;

public class Runnable {

	public static void main(String[] args) {


		LinkedList l = new LinkedList();
		
		
		l.insert(5);
		l.insert(10);
		l.insert(15);
		l.insert(20);
		
		
		l.insertFirst(2);
		l.insertFirst(1);
		
		l.insertLast(40);
		l.insertLast(50);
		
		l.insertLast(70);
		l.insertLast(80);
		
//		l.insertAtPos(1, 0);
//		l.insertAtPos(1, 100);
//		l.insertAtPos(10, 200);
////		
//		l.insertAtPos(3, 4);
		
		
//		l.deleteAtPos(7);
		
		
//		l.insertAtPos(4, 7);
//		l.insertAtPos(9, 30);
	
//		l.delete();
		
//		l.deleteFirst();
//		l.deleteLast();

		l.insertAtPos(3, 4);
		l.insertAtPos(8, 30);
		
//		l.middle();
		l.display();
		
		
//		System.out.println(l.length());

	}

}
