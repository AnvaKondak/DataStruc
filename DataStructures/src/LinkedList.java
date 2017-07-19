
public class LinkedList {

	private class Node{ 
		String val; 
		Node next; 
		
		Node(String val, Node next){ 
			this.val = val; 
			this.next = next; 
		}
		Node (String val){ 
			this.val = val; 
		}
	}
	
	private Node first; 
	private Node last; 
	
	LinkedList(){ //set constructor to null 
		
		first=null; 
		last=null; 
	}
	
	public boolean isEmpty() { 
		return first==null; 
	}
	
	public int size(){ 
		int counter=0; 
		Node n = first; 
		
		while (n!=null){ 
			counter++; //counter first 
			n=n.next;
		}
		return counter;
	}
	
	
	public void add(String val){ 
		if (isEmpty()){ 
			first = new Node(val); 
			last = first; 
		}
		
		else{ 
			last.next = new Node(val);
			last=last.next; 
		}
	}
	
	public void add(int index, String val){ 
	if (index<0 || index>size()){ 
		String msg = String.valueOf(index); 
		throw new IndexOutOfBoundsException(msg); 
	} 
		 
	if (index==0){ 
		first = new Node(val); 
		if (last==null)
			last=first; 
		return; 
	}
		Node pred = null; 
	for (int k=0; k<= index-1; k++)
		pred=pred.next; 
		
		pred.next = new Node(val, pred.next);   
		
		if (pred.next.next==null)
			last = pred.next; 
	}
	
	public String toString(){ 
		Node n = first; 
		StringBuilder s = new StringBuilder(); 
		
		while (n!=null){ 
			s.append(n.val + "\n");
			n=n.next; 
		}
		return s.toString();
	}
	
	public void removeByIndex(int index) { 
	
		if (index==0)
			first = first.next; 
		else {
			Node n =first; 
		for (int i=0; i<=index-1; i++){
			n =n.next; 
		}
		n.next = n.next.next; }
	}
	
	public Node removeByElement(Node n, String val){ 
		  Node temp = new Node(val); 
		  temp.next=n; 
		  Node t = temp; 
		  
		  while (t.next != null){
			  if (t.next.val == val) { 
				  Node after=t.next; 
				t.next = after.next; 
			  }
			  else 
				  t=t.next; 
		  }
		  return temp.next; 
	  }
	  
	  
	 public static void main (String[] args) { 
		 LinkedList list = new LinkedList(); 
		list.add("hi"); 
		list.add("Halle Berry");
		list.add("Fro yo");
		list.add("AWWW");
		list.add("nonono so kute");
	    list.add("BLehh");
	   list.removeByIndex(2);
	    list.add("Productivity");
	    System.out.println(list.toString());
	  }
	
}
