class Cycles{
int v;
int e;
Cycles(int v){
	int i;
this.v=v;
adj=new LinkedList[v];
for(i=0;i<v;i++){
	this.adj[i]=new LinkedList<Integer>() ;
}
}
void addEdge(int a,int b){
	adj[a].add(b);
}
public Iterable<Integer>adj(int i)
return this.adj(i);
}
