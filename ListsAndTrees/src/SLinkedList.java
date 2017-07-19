
public class SLinkedList {

	private class Node{ 
	  String data; 
	  Node next; 
	  
	   Node(String data, Node next){ 
		 this.data = data; 
		 this.next = next;
	  }
	   
	}
	
	private Node head; 
	//addfirst: 
	//param: object item, set this equal to new node 
	//set head equal to new node (item, head(Reference as next))
	public void addFirst(String data){ 
		head = new Node(data, head);
	}
	
	//addLAST: exception: head = null 
	//traverse, set last equal to new node 
	
	public void addLast(String data){ 
	if (head==null){ 
		addFirst(data);
		Node temp = head; 
		while (temp.next != null){
			temp = temp.next; 
		}
		temp.next = new Node(data,null);
	}
	}
	//argument: key, value for new node 
	//traverse w two ifs that most be true rather than if options rather than just one. 
	 
	public void insert(String key, String replacement){
		Node temp = head; 
		while (temp != null && !temp.data.equalsIgnoreCase(key)){
			temp= temp.next;
		}
		if (temp != null)
		temp.next = new Node(replacement, head);
	}
	
	public void insertBefore(String key, String replacement) throws Exception{ 
	 //exceptions: head is null, head is key... traverse using prev, when reached key, while curr is not null, new node (replacement, curr)  
       if (head == null)
    	   throw new Exception("nothing there");
       
       if (head.data.equals(key)){
    	   addFirst(replacement); 
    	   return;
       }
		Node prev = null, curr = head; 
      while (curr != null && !curr.data.equalsIgnoreCase(key)){
    	  prev = curr;
    	  curr = curr.next;
      }
      while (curr != null) 
     prev.next = new Node(replacement, curr);      
	}
	
   public void deleteByKey (String key) throws Exception{ 
	   //3 exceptions: null, head is key, key not found,,, traverse w/prev and curr and end w prev.next = cur.next
	   if (head == null){ 
		   throw new Exception("empty list");
	   }
	   
	  if (head.data.equals(key)){
		  head = head.next; 
		  return;
	  }
	  
	  Node prev = null, curr = head;
	  while (curr!= null && !curr.data.equalsIgnoreCase(key)){
		  prev = curr; 
		  curr = curr.next; 
	  }
		  
	  if (curr == null){ 
		  throw new Exception("key not found");
	  }
	 prev.next = curr.next;  
   }   
	
	public void deleteList(){ 
		head = null;
	}
	
	public String toString(){ 
		StringBuilder s = new StringBuilder(); 
		Node n = head;
		
		while (n!=null){
			s.append(n.data + " ");
			n = n.next;
		}
		return s.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
