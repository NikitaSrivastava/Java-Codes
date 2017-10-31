package graphs;
import java.util.LinkedList;

class graph{
private LinkedList<Integer>[]adj;
int c;
int v;
int e;
public graph(int v){
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
	this.adj[w].add(v);
	
}
public  Iterable<Integer>adj(int v){
	return this.adj[v];
}
public void edge(int v){
	System.out.println(this.adj[v].size());
}
}
public class DFS1 {
	int i;
	boolean marked[];
	Integer edgeto[];
	DFS1(graph g,int s){
		marked=new boolean [g.v];
		edgeto=new Integer[g.v];
		for(i=0;i<g.v;i++)
		{
			edgeto[i]=Integer.MAX_VALUE;
		}
	source(g,s);
	}
	public void source(graph g,int s){
		marked[s]=true;
		for(Integer i: g.adj(s))
		{
			if(!marked[i]){
				edgeto[i]=s;
				source(g,i);
			}
		}
	}
	public void destination( int d){
		if(marked[d]==false){
			System.out.println("does not exist");
		}
		else if(edgeto[d]==Integer.MAX_VALUE){
			System.out.println(d);
			return ;
		}
		else {
			
			destination(edgeto[d]);
			System.out.println(d);
		}
	}
	
	public static void main(String []args){
		graph g=new graph(6);
		g.addedge(1, 4);
		g.addedge(1, 3);
		
		g.addedge(4, 5);
		g.addedge(3, 5);
		DFS1 d1=new DFS1(g,1);
		d1.destination(5);
		g.edge(5);
	}

}
