//RANK
public void insert(int key) {
    root=insert(root,key);

   }
  public Node insert(Node n, int key)
      {
      if(n==null)
          return new Node(key);
      else if(key>n.key)
          n.right=insert(n.right,key);
       else if(key<n.key)
          n.left=insert(n.left,key);
          return n;
  }
     public int sizeof(Node n)
       {
         if(n==null)
             return 0;
       if(n!=null)
       n.N=1+sizeof(n.left)+sizeof(n.right);
       return n.N;
   }
   int f=0;
   public Integer getRank(int key){
      
         int i=getRank(root,key); 
       return i;
       
   } 
   public int getRank(Node n, int key){
       int p=0;
      if(n==null)
                {
          
                return -1;} 
       if(n.key==key)
           {
            
    return sizeof(n.left);
       }
       else if(n.key>key)
           {
           return getRank(n.left,key);
       }else
           {
          p=getRank(n.right,key);
              if(p==-1)
              return -1;
       return 1+sizeof(n.left)+p;
       
   }
   }