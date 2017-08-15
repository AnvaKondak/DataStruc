public class DNode { 
 
 
 public int size = 0;
 
 public String data;
 
 public DNode previous;
 public DNode next;
 
 DNode(String data, DNode n){
  
  this.data = data;
 next = n; 
  size++;
  
 }
 
 String getData () {
   return data; }
   
  
  
}