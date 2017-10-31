import TopView.Node;

public class circumference {
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
		int N;
	}	
	Node root;
	int c;
	private int sizeof(Node n){
		if(n==null)return 0;
		return 1+sizeof(n.left)+sizeof(n.right);
	}
	public void insert(int val){
		root=insert(root,val);	
		}
	public Node insert(Node n,int key){
		if (n==null){
			n.N=1+sizeof(n.left)+sizeof(n.right);
			return new Node(key);}
	if(n.key==key){}
	if(key<n.key)
		n.left=insert(n.left,key);
	else
		n.right=insert(n.right,key);
	return n;
	}
	public void cir(Node n){
		left( n);
     	mid(n);
		right(n);
	}
	public void left(Node n){
		
	}
}
