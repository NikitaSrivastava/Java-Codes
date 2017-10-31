
public class bstvalis {

}
/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node n) {
        if(n==null)
            return true;
        if(n.left!=null || n.right!=null)
        {
            if((n.left.data>=n.data) || (n.right.data<=n.data))
            {
                return false;
                //break;
            } 
        }
        else if(n.left!=null )
        {
            if((n.left.data>=n.data) )
            {
                return false;
                //break;
             } 
         }
         else if( n.right!=null)
         {
            if((n.right.data<=n.data))
            {
                return false;
                //break;
            }
         }
         else
         {
             return checkBST(n.left) && checkBST(n.right);
            //return true;
         }  
    
        return true;
    }
        //else{return true;}
       // return true;
    

