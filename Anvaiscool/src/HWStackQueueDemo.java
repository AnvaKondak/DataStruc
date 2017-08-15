
public class HWStackQueueDemo {
 
  public static void main (String [] args) { 
	  LinkedStack stack = new LinkedStack(); 
	  LinkedQueue queue= new LinkedQueue();  
	  
	  System.out.println("Pushing these words into the stack");
	  stack.push(" Hey ");
	  stack.push(" How "); 
	  stack.push("you");
	  stack.push("zoin");  
	  
	  LinkedStack st = new LinkedStack(); 
	  System.out.println("Traversing stack backwards: ");
	  while (!stack.isEmpty()) {
		String n=  stack.pop(); 	
		st.push(n);     }
	  
	  System.out.println("Printing out queue in same order as original stack: ");
		while (!st.isEmpty()){
			String b = st.pop(); 
			queue.enqueue(b); 
		}
		
		LinkedQueue qu = new LinkedQueue(); 
		System.out.println("Pushing these words into queue: "); 
		qu.enqueue(" Hello "); 
		qu.enqueue(" there "); 
		qu.enqueue(" friend "); 
		
	
		LinkedStack i = new LinkedStack(); 
	System.out.println("Printing out stack in same order as queue: ");
	while(!qu.isEmpty()) { 
	 String c = qu.dequeue(); 
	 i.push(c);
	}
	
	 
	 LinkedStack s = new LinkedStack();  
	  System.out.println("Pushing these words into the stack");
	  s.push(" Am ");
	  s.push(" I "); 
	  s.push("done");
	  s.push("yet");  
	  
	  LinkedStack l = new LinkedStack(); 
	  System.out.println("Traversing stack backwards: ");
	  while (!s.isEmpty()) {
		String n=  s.pop(); 	
		l.push(n);     } 
		   
	  
	  System.out.println("Lastly, I shall move a stack into a stack in the same order.");
	  LinkedStack last = new LinkedStack(); 
	  while (!l.isEmpty()) {
		  String end = l.pop(); 
		  last.push(end);
	  }
	  }
  
  

	
  }


