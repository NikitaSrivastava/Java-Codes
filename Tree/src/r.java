import java.util.Scanner;
//RANK
public class r {
	class Node {
		Node left;
		Node right;
		int data;
		int N;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	public void insert(int val) {
		root = insert(root, val);
	}

	private Node insert(Node n, int val) {
		if (n == null)
			return new Node(val);
		if (val < n.data)
			n.left = insert(n.left, val);
		else if (val > n.data)
			n.right = insert(n.right, val);
		return n;
	}

public void rank(int val)
{	
	int c;
	c=rank(root,val);
	System.out.println(c);
}
public int sizeof(Node n){
	if(n==null)
        return 0;
	n.N=1+sizeof(n.left)+sizeof(n.right);
	return n.N;
}
public int rank(Node n,int val){
	int p=0;
	  if(n==null)return -1;
	 if(val==n.data){
			return sizeof(n.left);
		    }
	 else if(val<n.data)
	    return rank(n.left,val);
	  
	 else 
	   {
		 p=rank(n.right, val);
		 if(p==-1)
			 return -1;
		return 1+sizeof(n.left)+p;
	   }
	
}

	public static void main(String a[]) {
		r b = new r();
		int val, i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			val = sc.nextInt();
			b.insert(val);
		}
		val = sc.nextInt();
		b.rank(val);
	}
}
