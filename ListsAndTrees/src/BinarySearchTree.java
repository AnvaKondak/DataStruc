
public class BinarySearchTree {
	private class Node{ 
		String val; 
		Node left, right; 
		
		public Node(String val) {
			this.val = val; 
			left = null; 
			right = null; 
		}
		
		public Node(String val, Node left, Node right){ 
			this.val = val; 
			this.left = left; 
			this.right = right; 
		}
	}

//create variable root node 
Node root; 
	//isempty mehtod, return if root is null 
	public boolean isEmpty(){ 
		return root == null; 
	}
	//two add methods. 
//	first one accepts just one parameter(int value) 
//	it sets root equal to the add method(val, root) 
//	returns true 
	public boolean add(String val){  
	  root = add(val, root);
	  return true;
	}
//	second add method accepts two params (val, node tree) 
	public Node add(String val, Node tree){
//	returns node, returning root of resulting binary search tree  
	 
//	if tree equals null, 
//	return new node with value as parameter 
		if (tree == null){
			return new Node(val); 
		}
//   while its not null: 
//	   if value is less than tree.value
//		   add value to left subtree and replace current left subtree with that result 
		if(val.compareToIgnoreCase(tree.val)<0){
			tree.left = add(val, tree.left); 
		}
//	   or else if value is greater than tree.val 
//	   you add val to the right subtree 
//	  tree.right = add(val, tree.right) 
		else 
			tree.right = add(val,tree.right);	  
//	  return the tree 
		return tree;  
	}		  
//search method: two of em 
//FIRST ONE is boolean returning, takes in parameter value 
//calls recursive method(val, root) 
public boolean search(String val) { 
	return search(val, root); 
	
}
	
//	search method: params value and node tree
public boolean search(String val, Node tree){ 
	
//	if tree is null, return false 
// 
	if (tree==null) 
		return false;
//			while its not null follow these instructions: 
//				
//	if value equals tree.value (root value im guessing), return true 
	if (val.equalsIgnoreCase(tree.val))
		return true;
//	if value is less than the nodes value, 
//	recursively search left subtree. 
//	return search method w value and tree.left as params. 
	if (val.compareToIgnoreCase(tree.val)<0){
		return search(val, tree.left);
	}
//			if value is greater than  that(else) recurseively
//			search right subtree. 
	else 
		return search(val, tree.right); 
//			
}

//remove method: param:val (one of 2 methods) 
public String remove(String val){
//boolean variable starts out false, 
	boolean found = false; 
//if, search(val), boolean = true 
	if (search(val)){
		found=true;
//set root equal to remove(root, val) as the new and 
	//improved tree 
	root =remove(root, val); }  
//if (Boolean is true) return the data
	if (found)
		return val; 
	//return null otherwise (no else method) 
	return null; 
}


public Node findMin(Node tree){ 
	if (tree.left==null)
		return tree; 
	else  
		return findMin(tree.left); 
	
}
	//remove method returns a node. param(node, val) 
public Node remove(Node tree, String val){
	//check if there is a tree: 
	//if node is null, return null 
	if (tree == null) 
		return null; 
	//IF NODES ROOT VALUE IS GREATER THAN PARAM VALUE 
	//RECURSIVELY MOVE IT TO THE LEFT NODE 
	//node.left is equal to remove(node.left, val); 
	if (tree.val.compareToIgnoreCase(val)>0){ 
		tree.left = remove(tree.left, val); 
	}
	//vice versa for right 
	if (tree.val.compareToIgnoreCase(val)<0){ 
		tree.right = remove(tree.right,val);
	}
	//if node has both children: 
	//if (node.left & node.right!=null) 
	if (tree.left!=null && tree.right != null){
	//set temp node equal to param node 
		Node temp = tree; 
	//find min element from right by creating Node minFromRight  
		//and setting it equal to method findMin(temp.right) as params 
		Node foundMin = findMin(temp.right); 
	
	//replace with the minimum node from right 
	//node.val=minFromRight.val 
		tree.val = foundMin.val; 
	//now delete the minimum node from the right that we replaced this with 
	//remove(node.right, minFromRight.val)} 
		remove(tree.right, foundMin.val); }
	//if node has one child aka else if (node.left != null) 
	else if (tree.left!=null)
		tree = tree.left; 
	//set node equal to node.left 
	
	//vice versa for right 
	else if (tree.right != null)
		tree=tree.right; 
	//if it has no kids, last else 
	//node is null 
	//return the node 
	else 
		tree = null; 
	return tree; 
}

public void inorder(){
	inorder(root);
}

	public void inorder(Node tree){ 
		if (tree!= null){
		inorder(tree.left); 
		System.out.print(tree.val + " ");
		inorder(tree.right); }
	} 
	
	public void preorder(){
		preorder(root);
	}

	public void preorder(Node tree) { 
		if (tree!= null){
		System.out.print(tree.val + " "); 
		preorder(tree.left); 
		preorder(tree.right); }
	}
	
	public void postorder(){
		postorder(root);
	}

	
	public void postorder(Node tree){
		if (tree!= null){
		postorder(tree.left); 
		postorder(tree.right); 
		System.out.print(tree.val + " "); }
	}
	
	public static void main(String[] args){
	  BinarySearchTree tree = new BinarySearchTree();  
	  tree.add("Claudius"); 
	  tree.add("Was");  
	  tree.add("a"); 
	  tree.add("brave"); 
	  tree.add("emperor"); 
	  tree.add("even though his own family viewed him as a public embarrassment"); 
	  tree.add("anomoly");  
	  tree.inorder(); 
	  System.out.println(); 
	  tree.postorder(); 
	  System.out.println(); 
	  tree.preorder(); 
	  tree.remove("Claudius");
	  System.out.println();
	  tree.inorder(); 
	}
	
	
	

	
	
	
	
	
	
	
	
	

}
