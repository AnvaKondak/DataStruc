//import java.io.BufferedReader; 
//import java.io.FileReader; 
//import java.io.IOException; 
//
//public class BinaryTreeDemo {
//
//	@SuppressWarnings("resource")
//	public static void main(String[] args) throws IOException { 
//		BinaryTree tree = new BinaryTree(); 
//		
//		
//		BufferedReader buff = new BufferedReader(new FileReader("hw6")); 
//		String line; 
//		String[] data; 
//		
//		while ((line=buff.readLine())!=null){
//			line=line.replace('.',' ');
//			line=line.toLowerCase();
//			data=line.split(" "); 
//			for(String str: data){
//				if(!tree.search(str))
//					tree.insert(str);
//			}
//			
////			for(int i=0; i<=data.length-1; i++) {
////				String val = data[i]; 
////				if(!tree.search(val))
////					tree.insert(val);
////			}
//		}
//		tree.inorder();
//		
//	}
//}
