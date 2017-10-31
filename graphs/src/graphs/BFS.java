package graphs;
import java.util.LinkedList;
import java.util.Queue;
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
	public class BFS {
		public boolean[] marked;
		public int[] edgeTo;
		private graph g;

		public BFS(graph g, int s) {
			this.g = g;
			marked = new boolean[g.v];
			edgeTo = new int[g.v];
			bfs(s);
		}

		private void bfs(int s) {
			Queue<Integer> q = new LinkedList<>();
			q.add(s);
			while (!q.isEmpty()) {
				int x = q.poll();
				marked[x] = true;
				for (int y : g.adj(x)) {
					if (marked[y] == false) {
						marked[y] = true;
						edgeTo[y] = x;
						q.add(y);
					}
				}
			}
		}
	}



