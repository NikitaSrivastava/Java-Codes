import java.util.Scanner;
//ALTERNATE NODES
public class Alternate {
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
public int height(Node n)
{
	if(n==null)return 0;
	return 1+Math.max(height(n.left), height(n.right));
}
public void printAlternate(){
	printAlternate(root);}
public void printAlternate(Node n){
	int h,f=0;
	h=height(n);
	//System.out.println(h);
	int i=0;
	while(i<h){
		if(f==0){
	    printRight(n,0,i);
		f=1;
		}
		else{
	  printLeft(n,0,i);
		f=0;
	}
		i++;
	}
}
public  void printLeft(Node n,int curr,int i){
	if(n==null)
		return ;
	if(i==curr)
	{
	System.out.println(n.key+" ");
	return ;
	}
	printLeft( n.left,++curr, i);
		
}
public  void printRight(Node n,int curr,int i){
	if(n==null)
		return ;
	if(i==curr)
	{
	System.out.println(n.key+" ");
	return ;
	}
	printRight( n.right,++curr, i);
		
}
public static void main(String a[]) {
	Alternate b = new Alternate();
	int val, i;
	Scanner sc = new Scanner(System.in);
	for (i = 0; i < 10; i++) {
		val = sc.nextInt();
		b.insert(val);
	}
	b.printAlternate();
}
}

