// ANCESTOR HACKER RANK
public class Solution {
    public class Node{
        int key;
        Node left;
        Node right;
        Node(int key)
            {
            this.key=key;
            this.left=null;
            this.right=null;
        }
    } 
    Node root;
  
    public void insert(int a)
        {
        root=insert(root,a);
    }
    public Node insert(Node n,int a)
        {
        if(n==null)
            return new Node(a);
        else if(a<n.key)
            n.left=insert(n.left,a);
        else if(a>n.key )
            n.right=insert(n.right,a);
         return n;
    }
    public void  ancestor(int a, int b)
    {     
        int i=root.key;
        root=ancestor(root, a,b,i);
       // System.out.println(root.key);
    }
     public Node ancestor(Node n,int a, int b,int i)
         {
         
         if((a>n.key && b<n.key)||(b>n.key && a<n.key))
             {
              System.out.println(n.key);
             return n;
         }
         if(a==n.left.key||b==n.left.key)
             {System.out.println(n.key);
                  return n;
         }
          if(i==a||i==b){   
                 System.out.println("-1");
                 return n;
             }
         else if((a<n.key && b<n.key))
             {
             n.left=ancestor(n.left, a,b,i);
         }
         else if(a>n.key && b>n.key)
             {
           n.right=ancestor(n.right, a,b,i);
     }
    
         return n;
     }
    public static void main(String args[] ) throws Exception {
        Solution b=new Solution();
        int n2=0,n1=0,i=0,no;
        Scanner s=new Scanner(System.in);
         no=s.nextInt();
        for(i=0;i<no;i++)
            {
            n2=s.nextInt();
            b.insert(n2);
        }
         no=s.nextInt();
        for(i=0;i<no;i++)
            {
            n2=s.nextInt();
            n1=s.nextInt();
            b.ancestor(n2,n1);
        }
    }
}
