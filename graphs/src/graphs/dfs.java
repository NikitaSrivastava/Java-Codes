/*package graphs;

import java.util.LinkedList;
import java.util.*;
 class Graph
{
	private LinkedList<Integer>[] adj;
	int v;
	int e;
	public Graph(int v)
	{
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			this.adj[i]=new LinkedList<Integer>();
		}
		this.e=0;
	}
	public void addEdge(int v,int w)
	{
		this.adj[v].add(w);
		this.adj[w].add(v);
	}
	public int v()
	{
		return this.v;
	}
	public int e()
	{
		return this.e;
	}
	public Iterable<Integer> adj(int v)
	{
		return this.adj[v];
	}
}

class dfs
{
	boolean[] marked;
	Integer[] edgeTo;
	dfs(Graph G,int s)
	{
		marked=new boolean[G.v];
		edgeTo=new Integer[G.v];
		for(int i=0;i<G.v;i++)
		{
			edgeTo[i]=Integer.MAX_VALUE;	
		}
	DFS(G,s);		
	}
	

	void  DFS(Graph G,int v)
	{
		marked[v]=true;
		for(Integer i: G.adj(v))
		{
			if(!marked[i])
			{
				edgeTo[i]=v;
				DFS(G,i);
			}
		}
	}
	
	void path(int destination)
	{
		if(marked[destination] == false)
		{
			System.out.println("path not exit");
		}
		else if(edgeTo[destination] == Integer.MAX_VALUE)
		{
			System.out.println(destination);
			return;
		}
		else
		{
			System.out.println(destination+" ");
			path(edgeTo[destination]);
		}
	}
	public static void main(String[] args)
	{
		Graph G=new Graph(6);
		G.addEdge(1,3);
		G.addEdge(1,4);
		G.addEdge(3,5);
		G.addEdge(0,2);
		
	   dfs d1=new dfs(G,1);
		d1.path(5);
	}
}
*/

