import Alternate.Node;

public class Deleterandom {
	public class Node {
		Node(int key)
		{
			this.key=key;
			this.left=null;
			this.right=null;
		}
		int key;
		Node right;
		Node left;
	}	
	Node root;
	public void insert(int val){
		root=insert(root,val);	
		}
	public Node insert(Node n,int key){
		if (n==null)
			return new Node(key);
	if(n.key==key){}
	if(key<n.key)
		n.left=insert(n.left,key);
	else
		n.right=insert(n.right,key);
	return n;
	}
}
