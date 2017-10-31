
package graphs;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
 class CycleinDgraph {
private LinkedList<Integer>[]adj;
int c;
int v;
int e;
public CycleinDgraph(int v){
	int i;
	this.v=v;
	adj=new LinkedList[v];
	for(i=0;i<v;i++){
		this.adj[i]=new LinkedList<Integer>();
	}
	this.e++;
}
public void addedge(int v,int w){
	this.adj[v].add(w);
}
public  Iterable<Integer>adj(int v){
	return this.adj[v];
}
public void edge(int v){
	System.out.println(this.adj[v].size());
}
}
public class DFSCYCLE{
	Integer edgeto[];
	boolean marked[];
	boolean currentpath[];
	Stack<Integer>st=new Stack<>();
	boolean cycle=false;
	DFSCYCLE(CycleinDgraph g){
		int f=0;
		edgeto=new Integer[g.v];
		marked=new boolean[g.v];
		currentpath=new boolean[g.v];
		for(int i=0;i<g.v;i++){
		dfs(g,i);
		
	}
		if(cycle==true){
			while(!st.isEmpty()){
			System.out.println(st.pop());
			}
		}
		else{
			System.out.println("no cycle");
		}
	}
	public void dfs(CycleinDgraph g,int s){
		marked[s]=true;
		currentpath[s]=true;
		for(Integer i:g.adj(s)){
			if(!marked[i]){
				edgeto[i]=s;
				dfs(g,i);
			}
			else{
				if(currentpath[i]){
				cycle=true;
				//st.push(i);
				for(int w=s;w!=i;w=edgeto[w]){
				st.push(w);	
				}
				st.push(i);
				}
			}
			
		}
		for(int k=0;k<g.v;k++)
		currentpath[k]=false;
		
	}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  CycleinDgraph g=new CycleinDgraph(n);
    int  e=sc.nextInt();
	  for(int i=0;i<e;i++){
		  g.addedge(sc.nextInt(),sc.nextInt());
	  }
	  DFSCYCLE d= new DFSCYCLE(g);
	   
	}

}
