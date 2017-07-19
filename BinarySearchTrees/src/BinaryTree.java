import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 

public class BinaryTree {
 static BSTNode root; 
 
 public static void inorder() {
  inorder(root);
 }
  public static void inorder(BSTNode btree) { 
  if (btree!= null){ 
   inorder(btree.left); 
   System.out.println(btree.val + " " + btree.freq + " "); 
   inorder(btree.right); 
  }
 }
 

public static boolean search(String val){
  return search(val, root); 
}

 
 public static boolean search(String val, BSTNode r) { 
 //  BSTNode r = root; 
   while (r!=null) {
    int repeat = val.compareToIgnoreCase(r.val); 
    if (repeat==0) {
      r.incrementFreq(); 
      return true; 
   }
    else if (repeat>0) 
      r = r.right; 
    else 
      r=r.left; 
   }
   return false; 
 }
 
 public static void insert(String val) {
  if (root!= null)
   insert(root, val); 
 }
  
 public static void insert(BSTNode node, String val) { 
   
  if (val.compareToIgnoreCase(node.val)<=0){
   if (node.left != null) 
    insert(node.left, val); 
   else if (node.left ==null && !search(val)) { 
    node.left = new BSTNode(val); 
   }  
  }
  else if (val.compareToIgnoreCase(node.val)>0){
   if (node.right != null)
    insert(node.right, val); 
   else if (node.right==null && !search(val)){ 
    node.right = new BSTNode(val); 
   }
  
   }
  }
 
 public static BSTNode findMin(BSTNode root) { 
  if (root.left == null) 
   return root;
   else 
   return findMin(root.left);
 }
 
 public static BSTNode remove(BSTNode node, String val) { 
  //CHECK IF THERE IS A TREE
  if (node == null)
   return null; 
  //IF THE NODES ROOT VALUE IS GREATER THAN PARAM 
  //VALUE THEN RECURSIVELY MOVE IT TO THE LEFT NODE 
  if (node.val.compareToIgnoreCase(val)<0) { 
   node.left = remove(node.left, val); 
  }//VICE VERSA FOR THE RIGHT SIDE OF THE NODE TREE
  else 
   node.right = remove(node.right,val); 
  //if no de has both children 
  if (node.left!=null && node.right!=null){ 
   BSTNode temp = node; 
   //find min element from right 
   BSTNode minFromRight = findMin(temp.right); 
   //REPLACE W/ MIN NODE FROM RIGHT 
   node.val = minFromRight.val; 
   //delete min node from right 
   remove(node.right, minFromRight.val);
  }
  //if node has one child 
  else if (node.left!= null)
   node= node.left; 
  else if (node.right != null)
   node=node.right; 
  //no kids 
  else 
   node=null;
  return node; } 
 
 public static void main(String[] args) throws IOException{ 
 new BinaryTree();  
 root = new BSTNode("This"); 
 String data[]= {"sentence","repeats","words",
   "because","a","sentence", "that","repeats","words","makes","a","good","example","sentence"};
   for (String s: data) {
     if (!search(s))
      insert(s); 
           }
 
     
 inorder(); 
  
// This was the code for the last part of the assignment where we add
// the text file into the binary tree but it would not allow my code to compile 
// so i have commented it out and used an alternative way of implementing the 
// binary tree. 
// 
// 
// 
//  BufferedReader buff = new BufferedReader(new FileReader("Homework.txt")); 
//  String line; 
//  String[] data;  
//  
//  while ((line=buff.readLine())!=null){
//   data=line.split(" "); 
//   for(String s: data){
//    if(!search(s))
//     insert(s);
//   }
//     inorder();
//
// }
// 
//    if (buff!= null)
//   buff.close(); 
 }
}
 




























//import java.io.BufferedReader; 
//import java.io.FileReader; 
//import java.io.IOException; 
//
//public class BinaryTree {
//	static BSTNode root; 
//	
//	public static void inorder() {
//		inorder(root);
//	}
//	 public static void inorder(BSTNode btree) { 
//		if (btree!= null){ 
//			inorder(btree.left); 
//			System.out.print(btree.val + " " + btree.freq); 
//			inorder(btree.right); 
//		}
//	}
//	
//	
////	public boolean add(String val) {  
////		root = add(val, root); 
////		return true; 
////	}
////	
////	public BSTNode add(String val, BSTNode bstree) { 
////		if (bstree == null) { 
////			return new BSTNode(val); 
////		}
////		else if (val.compareToIgnoreCase(bstree.val)<0){ 
////			bstree.left = add(val, bstree.left);
////		}
////		else if (val.compareToIgnoreCase(bstree.val)>0) {  
////			bstree.right = add(val, bstree.right); 
////		}
////		return bstree; 
////	}
////	
//	public static boolean search(String val){
//		return search(val, root); 
//	}
//	
//	public static boolean search(String val, BSTNode btree) { 
//		if (btree == null) { 
//			return false; 
//		}
//		int repeat = val.compareToIgnoreCase(btree.val); 
//		if (repeat==0){
//			btree.incrementFreq();
//			return true;}
//			
//		if (val.compareTo(btree.val)<0){ 
//			return search(val, btree.left); 
//		}
//		else 
//			return search(val, btree.right); 
//	}
//	
//	public static void insert(String val) {
//		if (root!= null)
//			insert(root, val); 
//	}
//	 
//	public static void insert(BSTNode node, String val) { 
//		if (val.compareTo(node.val)<=0){
//			if (node.left != null) 
//				insert(node.left, val); 
//			else{ 
//				System.out.println("++Inserted " + val + " to the left of " +
//			node.val);
//				node.left = new BSTNode(val); 
//			}
//		}
//		else if (val.compareTo(node.val)>0){
//			if (node.right != null)
//				insert(node.right, val); 
//			else { 
//				System.out.println("--Inserted " + val + " to the right of " +
//			node.val);
//				node.right = new BSTNode(val); 
//			}
//			}
//		}
//	
//	public static BSTNode findMin(BSTNode root) { 
//		if (root.left == null) 
//			return root;
//			else 
//			return findMin(root.left);
//	}
//	
//	public static BSTNode remove(BSTNode node, String val) { 
//		//CHECK IF THERE IS A TREE
//		if (node == null)
//			return null; 
//		//IF THE NODES ROOT VALUE IS GREATER THAN PARAM 
//		//VALUE THEN RECURSIVELY MOVE IT TO THE LEFT NODE 
//		if (node.val.compareToIgnoreCase(val)<0) { 
//			node.left = remove(node.left, val); 
//		}//VICE VERSA FOR THE RIGHT SIDE OF THE NODE TREE
//		else 
//			node.right = remove(node.right,val); 
//		//if node has both children 
//		if (node.left!=null && node.right!=null){ 
//			BSTNode temp = node; 
//			//find min element from right 
//			BSTNode minFromRight = findMin(temp.right); 
//			//REPLACE W/ MIN NODE FROM RIGHT 
//			node.val = minFromRight.val; 
//			//delete min node from right 
//			remove(node.right, minFromRight.val);
//		}
//		//if node has one child 
//		else if (node.left!= null)
//			node= node.left; 
//		else if (node.right != null)
//			node=node.right; 
//		//no kids 
//		else 
//			node=null;
//		return node; }	
//	
//	public static void main(String[] args) throws IOException { 
//	new BinaryTree(); 
//		
//	
//		BufferedReader buff = new BufferedReader(new FileReader("homeworkBST.txt")); 
//		String line; 
//		String[] data;  
//		
//		while ((line=buff.readLine())!=null){
//			line=line.replace('.',' ');
//			line=line.toLowerCase();
//			data=line.split(" ");   
//			for(String str: data){
//				if(!BinaryTree.search(str))
//					insert(str);
//			}
//			
////			for(int i=0; i<=data.length-1; i++) {
////				String val = data[i]; 
////				if(!tree.search(val))
////					tree.insert(val);
////			}
//		}
//	    inorder();
//		if (buff!= null)
//			buff.close(); 
//	}
//		
//	}
//	
//	
