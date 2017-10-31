import java.util.Scanner;

public class Rankprac {
	public class Node{
		int data;
		Node left;
		Node right;
		Node(int val){
			this.data=data;
			this.right=this.left=null;
		}
		
	}
	
	Node root;
	public void insert(int val){
		root=insert(root,val);
	}
	public Node insert(Node root,int val){
		if(root==null)return new Node(val);
		else if(val<root.data)
			root.left=insert(root.left,val);
		else if(val>root.data)
			root.right=insert(root.right,val);
		return root;
	}
	public void rank(int v){
		int c=rank(root,v);
		System.out.println(c);
	}
	public int sizeof(Node n){
		if(n==null)return 0;
		return 1+sizeof(n.left)+sizeof(n.right);
	}
	
	
	public int rank(Node n,int v){
		int p=0;
		if(n==null)return -1;
		if(n.data==v)
			return sizeof(n.left);
		else if(n.data>v)return rank(n.left,v);
		else {
			p=rank(n.right,v);
			if(p==-1)return -1;
			return 1+sizeof(n.left)+p;
		}
	}
	public static void main(String args[]) {
		Rankprac r=new Rankprac();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			r.insert(s.nextInt());
		}
		int v=s.nextInt();
		r.rank(v);
	}
}
