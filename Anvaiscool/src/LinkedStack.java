import java.util.EmptyStackException;

/** This program demonstrates how to write and use a 
 * stack class based on linked lists. 
 * @author Anva
 *
 */
public class LinkedStack {
	private DNode top = null; //top of stack 
	/** isEmpty method checks if stack is empty. 
	 * @return  true if stack is empty 
	 */
	public boolean isEmpty() { 
		return top == null; 
	}
	
	/** The push method. Add new item to top of stack 
	 * @param new The item to be pushed onto the stack. 
	 */
	public void push(String n){ 
		top= new DNode(n, top); 
		System.out.println(n);
	}
	
	/** Pop method. Remove value at stack top. 
	 * @return The value at top of stack 
	 * @exception EmptyStackException Empty stack 
	 */ 
	public String pop()  {
		String n = ""; 
		if (isEmpty()) 
			throw new EmptyStackException(); 
		else {
			n = top.data; 	
			top = top.next; 
			return n; 
		}
	}
	
	/** The peek method return top 
	 * value of stack. 
	 * @return Top value 
	 * @exception EmptyStackException Empty stack 
	 */
  public String peek() { 
	  if (isEmpty()) { 
		  throw new EmptyStackException(); 
	  }
	  else 
		  return top.data; 
  }
	
	
	
}
