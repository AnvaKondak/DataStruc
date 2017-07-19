/** Node class */ 
public class BSTNode {
String val; 
BSTNode left, right; 
int freq; 
//constructor for leaf nodes 
public BSTNode (String val) {
	this.val = val; 
}

public BSTNode (String val, BSTNode left, BSTNode right){ 
	this.val = val; 
	this.left = left; 
	this.right = right; 
}

public void incrementFreq() {
	this.freq++; 
 }
}
