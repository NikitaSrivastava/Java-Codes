package graphs;
import java.util.LinkedList;
import java.util.Queue;
public class Graph {
public LinkedList<Integer>adj[];
int v;
int c;
Graph(int v)
{
int i;
this.v=v;
adj=new LinkedList[v];
for(i=0;i<v;i++)
{
	this.adj[i]=new LinkedList<Integer>();
}
}
void addedge(int i,int j){
this.adj[i].add(j);
this.adj[j].add(i);
}
public Iterable<Integer>adj(int v){
	return this.adj[v];
}
}
class Bfs{
	public boolean[] marked;
	public int[] edgeto;
	Bfs(Graph g,int s){
		marked=new boolean[g.v];
		edgeto=new int[g.v];
		for(int i=0;i<g.v;i++)
		{
			edgeto[i]=Integer.MAX_VALUE;
		}
	route(g,s);
	}
    private void route(Graph g,int s){
    	Queue<Integer> q = new LinkedList<Integer>();
    	q.add(s);
		//q.enqueue(s);
		while(!q.isEmpty())
			{int h=q.peek();
			q.poll();
			//int h=q.dequeue();
			for(int y:g.adj(h)){
				if(marked[y]==false)
				{
					marked[y]=true;
					edgeto[y]=h;
					q.enqueue(y);
				}
			}
	}
    }
    public static void main(String []args){
		Graph g=new Graph(6);
		g.addedge(1, 4);
		g.addedge(1, 3);
		
		g.addedge(4, 5);
		g.addedge(3, 5);
		Bfs b=new Bfs(g,1);
	}

	
}

