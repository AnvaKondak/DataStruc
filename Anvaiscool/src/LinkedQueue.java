
/**
 * @author Anva
 *This class is a queue through linked lists. 
 */
public class LinkedQueue {

	private DNode front = null; 
	private DNode end = null; 
	
	/** isEmpty method */ 
	public boolean isEmpty () { 
		return front == null; 
	}  
	
	/** Enqueue method adds another value to list 
	 * @param s The value to be added to the queue. 
	 * */  
	public void enqueue (String n) { 
		if (end != null) { 
			end.next = new DNode (n,null); 
			end = end.next;  
			System.out.println(n);
		}
		else { 
			end = new DNode(n, null); 
			front = end; 
			System.out.println(n);
		}
	}

	public String peek () { 
		if (isEmpty()) {
		return "Empty queue";
     	}
		else 
			return front.data; 
 	}

	
	public String dequeue() { 
		if (isEmpty()){ 
			return "Empty queue"; 
		}
		else {
			String n = front.data; 
			front = front.next; 
			return n; 
		}
			
	}
}
