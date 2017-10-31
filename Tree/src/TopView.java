import java.util.Scanner;

public class TopView {
public class Node {
	Node(int key,int curr)
	{
		this.key=key;
		this.left=null;
		this.right=null;
		this.width=curr;
	}
	int key;
	Node right;
	Node left;
	int width;
}	
Node root;
int c;
public void insert(int val){
	
	root=insert(root,val,0);	
	}
public Node insert(Node n,int key,int curr){
	if (n==null)
		return new Node(key,curr);
if(n.key==key){}
if(key<n.key)
{ c=curr-1;
	n.left=insert(n.left,key,--curr);}
else
	n.right=insert(n.right,key,++curr);
return n;
}
public void topview(){
	int w=c;
	topview(root,w);
}
int f=1;
public void topview(Node n,int w){
	int arr[]=new int[100];
	int j=0,f=1;
	for(int i=0;i<j;i++)
	{
    if(arr[i]==n.width)
    f=1;
    break;
	}
	if(f==1)
	arr[i]=n.w;
	
}
public static void main(String a[]) {
	TopView b = new TopView();
	int val, i;
	Scanner sc = new Scanner(System.in);
	for (i = 0; i < 8; i++) {
		val = sc.nextInt();
		b.insert(val);
	}
	b.topview();
}
}