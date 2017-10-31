package graphs;
import java.util.LinkedList;
import java.util.Scanner;
class dfspractice {
    int v;
    int e;
     private LinkedList <Integer>adj[];
     dfspractice(int v){
    	this.v=v; 
    	adj=new LinkedList[v];
    	for(int i=0;i<v;i++){
    		adj[i]=new LinkedList<>();
    	}
    }
    public void addEdge(int v,int w)
    {
    	this.adj[w].add(v);
    	this.adj[w].add(w);
    }
    public Iterable<Integer>adj(int v){
    	return this.adj[v];
    }
}
public class df{
	boolean marked[];
	Integer edgeto[];
	df(dfspractice d,int s){
		marked=new boolean[d.v];
		edgeto=new Integer[d.v];
		for(int i=0;i<d.v;i++)
		{
			edgeto[i]=Integer.MAX_VALUE;
		}
		source(d,s);
	}
	public void source(dfspractice g,int s)
	{
		marked[s]=true;
		for(int i:g.adj[s]){
			edgeto[i]=s;
			source(g,i);
		}
	}
	public void destination(int v,dfspractice g){
		if(edgeto[v]==Integer.MAX_VALUE)return;
		if(marked[v]==false)
			else return destination(edgeto[v],dfspractice g);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		dfspractice d=new dfspractice(6);
		for(int i=0;i<5;i++)
			d.addEdge(sc.nextInt(),sc.nextInt());
		d.destination();

	}

}
