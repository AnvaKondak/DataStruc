//public class DoublyLinkedList {
//
// 
// static DNode root;
// static DNode t;
// static DNode curr;
// 
// public int size () 
// {
//   int num = 0; 
//  DNode spare = root; 
//   
//   while (spare != null) {
//     num ++; 
//     spare = spare.next; }
//   return num; }   
//   
//   
//   
// public void add(String data){
//  
//  DNode dNode = new DNode(data);
//  
//  if(root==null){
//   
//   root = t = dNode;
//
//   
//  }
//  else if (size()==1)  {
//    if (dNode.getData().compareToIgnoreCase(t.getData())>0){
//      t = dNode; 
//     t = root.next;  
//     root = t.previous;   }
//    
//    else {
//      root = dNode; 
//      root.next=t; 
//      t.previous = root; }
//  }
//  
//  else { 
//    if (dNode.getData().compareToIgnoreCase(t.getData())>0) { 
//      t.next = dNode; 
//      dNode.previous = t; 
//      t = dNode; } 
//    
//    else { 
//      DNode t = root; 
//      while (t != null) { 
//        if (dNode.getData().compareToIgnoreCase(t.getData())>0 && dNode.getData().compareToIgnoreCase(t.next.getData())<0) {
//          dNode.next = t.next; 
//          dNode.previous = t; 
//          t.next = dNode; }
//        t = t.next; 
//      }
//  }
//  }
// }
// 
// public void insert(String data, int after){
//   System.out.println(); 
//  System.out.println("inserting node at position " + after); 
//  DNode dNode = new DNode(data);
//  
//  int i = 1;
//  
//  curr = root;
//  
//  while(i != after){
//   
//   curr = curr.next;
//   
//   i ++;
//   
//  }
//  
//  t = curr.next;
//  
//  curr.next = dNode;
//  dNode.next= t;
//  t.previous = dNode;
//  dNode.previous= curr;
//  
// }
//
// public void delete(int nodeNumber){
//  System.out.println("Deleting the node at position " + nodeNumber); 
//  int i = 1;
//  
//  curr = root;
//  
//  if(nodeNumber==1){
//   
//   root = curr.next;
//   curr.next = null;
//   curr.previous = null;
//   
//  }else{
//   
//   while(i != nodeNumber){
//    
//    curr = curr.next;
//    
//    i++;
//    
//   }
//   
//   if(curr.next == null){ 
//    
//    curr.previous.next = null;
//    curr.previous = null;
//    
//   }else{
//    
//    curr.previous.next = curr.next;
//    curr.next.previous = curr.previous;
//    
//   }
//   
//  }
//  
// }
// 
// public void forward(){
//  System.out.println("Printing forward"); 
//  curr = root;
//  boolean a = true;
//  
//  do{
//   
//   System.out.print((a) ? "" + curr.data + "" : " --> " + "" + curr.data + "" );
//   
//   a = false; 
//   
//   curr = curr.next;
//   
//  }while(curr!=null);
//  
// }
// 
// public void backwards(){
//  System.out.println("Printing backwards"); 
//  curr = root;
//  boolean a = true;
//  
//  while(curr.next!=null){
//   
//   curr = curr.next;
//  
//  }
//  
//  do{
//   
//   System.out.print((a) ? "" + curr.data + "" : " -> " + "" + curr.data + "" );
//   
//   a = false; 
//   
//   curr = curr.previous;
//   
//  }
//  while(curr.previous!=null);
//  
//  System.out.print(" -> " + "" + curr.data + "" );
//  
// }
// 
// public String findString(String str){
//   System.out.println("finding string ... "); 
// 
//    DNode curr = root;
//    while(curr!=null){
//      if(curr.getData() ==str) {
//           System.out.println("Found");
//           return str;}
//         else 
//           curr = curr.next;
//    }
//    return null; //element not found
//}
//  
//   public void deleteList() 
//    {
//        root = null;
//        System.out.println("gone."); 
//    }
// 
// 
// public static void main(String[] args){
//  
//  DoublyLinkedList list = new DoublyLinkedList();
//  
//list.add("hi"); 
//list.add("Anva");  
//list.add("Outside"); 
//list.forward(); 
//System.out.println();
//                
//  list.deleteList();  
//  
//  System.out.println(); 
//list.add("Easy"); 
//list.add("Breezy"); 
// list.add("Beautiful"); 
// list.add("Covergirl"); 
// 
// list.forward();
//  System.out.println();
//  list.backwards();
//  System.out.println(); 
// System.out.println( list.findString("Breezy"));
//
//  System.out.println();
//  System.out.println(); 
//   list.forward();
//   list.insert("haha", 1); 
//   list.forward(); 
//  
// }
// 
//}