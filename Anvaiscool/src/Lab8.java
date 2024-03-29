
	//package lab08;

	import java.util.*;

	/**
	 * @author zumrut
	 */
	public class Lab8 {
	    
	    /**
	     * Adds an integer element to the stack
	     * @param st
	     * @param a 
	     */
	    public static void push(Stack st, String a) {
	      st.push(new String(a));
	      System.out.println("push(" + a + ")");
	   }

	    /**
	     * Removes an integer element from the stack
	     * LIFO(Last-In-First-Out) - The last element gets removed from the stack
	     * @param st 
	     */
	    public static String pop(Stack st) {
	        System.out.print("pop -> ");
	        String a = (String) st.pop();
	        System.out.println(a);
	        return a;
	    }
	   
	   /**
	    * Adds a String element to the queue
	    * @param queue
	    * @param word 
	    */
	   public static void enqueue(Queue queue, String word){
	       queue.add(word);
	       System.out.println("enqueue(" + word + ")");
	   }
	   
	   /**
	    * Removes a String element from the queue
	    * FIFO(First-In-First_Out)- The first element in the queue gets removed
	    * @param queue 
	    */
	    public static String dequeue(Queue queue){
	        String removed = (String)queue.remove();
	        System.out.println("dequeue(" + removed + ")");
	        return removed;
	    }
	   
	   /**
	    * Removes elements from the given stack and puts into the queue.
	    * Maintain the order so that if you were to pop and print all of the items from the stack 
	    * and dequeue and print all the items from the queue it would print the same thing
	    * @param st
	    * @param queue 
	    */
	   public static void transferFromStackToQueue(Stack st, Queue queue){
	       /*
	       * TO-DO: IMPLEMENT THIS METHOD
	       */
		  /* while(!st.isEmpty()){
	            pop(st);
	            System.out.println("stack: " + st);
	            dequeue(queue);
	            System.out.println("queue: " + queue.toString());
	        }   */
	//pop(st); 
	//String str= " " + st; 
	 //enqueue(queue, str); 
	// System.out.print("dequeued " + queue); 
	     
	    String x; 
	    if (st.isEmpty()) 
	    	return; 
	    x=pop(st); 
	    transferFromStackToQueue(st,queue);
	    push(st,x); 
	     
	     
	   }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        /**
	         * Adding/removing elements to/from a stack
	         */
	        Stack<String>st = new Stack<String>();
	        System.out.println("stack: " + st);
	        
	        push(st, "1");
	        push(st, "2");
	        push(st, "3");
	        System.out.println("stack: " + st);
	        
	        pop(st);
	        System.out.println("stack: " + st);
	        pop(st);
	        System.out.println("stack: " + st);
	        pop(st);
	        System.out.println("stack: " + st);
	        
	        try {
	             pop(st);
	        }catch (EmptyStackException e) {
	             System.out.println("empty stack");
	        }
	      
	        /**
	         * Adding/removing elements to/from a queue
	         */
	        Queue<String> queue=new LinkedList<String>(); 
	        
	        enqueue(queue, "This");
	        enqueue(queue, "is");
	        enqueue(queue, "the");
	        System.out.println("queue: " + queue.toString());
	        
	        enqueue(queue, "lab");
	        enqueue(queue, "8");
	        enqueue(queue, "assignment");
	        
	        System.out.println("queue: " + queue.toString());
	        System.out.println("Head:"+queue.element());
	        System.out.println("Head:"+queue.peek());  
	        
	        dequeue(queue);
	        dequeue(queue);
	        System.out.println("After removing two elements:");
	        System.out.println("queue: " + queue.toString());
	        queue.clear();
	        System.out.println("queue: " + queue.toString());
	        
	        
	        /**
	         * TO-DO: Add the given string below to the stack "st", word by word.
	         * String: "213 lab students learned stacks and queues"
	         */
	        push(st, "213"); 
	        push(st, " lab "); 
	        push(st, " lab "); 
	        push(st, " students "); 
	        push(st, " learned "); 
	        push(st, " stacks "); 
	        push(st, " and "); 
	        push(st, " queues "); 
	        transferFromStackToQueue(st, queue);
	        while(!st.isEmpty()){
	            pop(st);
	            System.out.println("stack: " + st);
	            dequeue(queue);
	            System.out.println("queue: " + queue.toString()); 
	        }
	    }
	    
	}


