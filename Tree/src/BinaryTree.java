
public class BinaryTree {
	Node root;
	public void insert(int key){
	root=insert(root,key);
	//System.out.println(root.key);
	}
	private Node insert(Node n,int key)
	{
		if (n==null)
				return new Node(key);
		if(n.key==key){}
		if(key<n.key)
			n.left=insert(n.left,key);
		else
			n.right=insert(n.right,key);
		return n;	
	}
	private int Getmin(Node n)
	{
		if (n.left==null)
			return n.key;
			return Getmin(n.left);			
	}
	public int Min(){
		if (root==null)
			return -1;
		return Getmin(root);
		}
	private int Getmax(Node n)
	{
		if (n.right==null)
			return n.key;
			return Getmin(n.right);			
	}
	public int Max(){
		if (root==null)
			return -1;
		return Getmax(root);
		}
	private int delMin(Node n)
	{
	if(n.left==null)
		return n.right;
	return delMin(n.left);
	}
	private int dMin()
	{
		if(root==null)
			return -1;
		return delMin(root);
	}
	public static void main(String args[])
	{
		int r=0,j=0;
		BinaryTree b= new BinaryTree();
		b.insert(5);
		b.insert(4);
		b.insert(3);
		b.insert(2);
		b.insert(1);
		b.insert(9);
		r=b.Min();
		j=b.Max();
		System.out.println(r);
		System.out.println(j);
	}
}

