package graphbfs;
import java.util.LinkedList;
import java.util.Queue;
class bfs1 {

	public LinkedList<Integer>adj[];
	int v;
	int c;
	bfs1(int v)
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
	public class bfs{
		public boolean[] marked;
		public int[] edgeto;
		bfs(bfs1 g,int s){
			marked=new boolean[g.v];
			edgeto=new int[g.v];
			for(int i=0;i<g.v;i++)
			{
				edgeto[i]=Integer.MAX_VALUE;
			}
		route(g,s);
		}
	    private void route(bfs1 g,int s){
	    	Queue<Integer> q = new LinkedList<Integer>();
	    	q.add(s);
	    	marked[s]=true;
			while(!q.isEmpty())
				{
				int h=q.peek();
				System.out.println(h);
				q.poll();
				for(int y:g.adj(h)){
					if(marked[y]==false)
					{
						marked[y]=true;
						edgeto[y]=h;
						q.add(y);
					}
				}
		}
	    }
	    public static void main(String []args){
			bfs1 g=new bfs1(6);
			g.addedge(1, 4);
			g.addedge(1, 3);
			g.addedge(4, 5);
			g.addedge(3, 5);
			bfs b=new bfs(g,1);
			
		}

		
	}




