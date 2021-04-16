package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;

public class UnionFind {
  public static class Edge{
    int v = 0;
    int w = 0;
    Edge(int v, int w){
      this.v = v;
      this.w = w;
    }
  }  

  public static void  addEdge(ArrayList<Edge>[] graph, int u, int v, int w){
    graph[u].add(new Edge(v, w));
    graph[v].add(new Edge(u, w));
  }

  public static void display(ArrayList<Edge>[] graph, int N){
    for(int i=0; i<N; i++){
      System.out.println(i + " -> ");
      for(Edge e : graph[i]){
        System.out.println("(" + e.v + "," + e.w + ")");
      }
      System.out.println();
    }
  }

  // Union-Find : =====================================================================================

  static int []par, size;
  public static int findParent(int u){
    if(par[u] == u){
      return u;
    }
    return par[u] = findParent(u);
  }

  public static void merge(int p1, int p2){
    if(size[p1] < size[p2]){
      par[p1] = p2;
      size[p2] += size[p2];
    }else{
      par[p2] = p1;
      size[p1] += size[p2];
    }
  }

  @SuppressWarnings("unchecked")
  public static void unionFind(int N, ArrayList<Edge>[] graph){
    ArrayList<Edge>[] ngraph = new ArrayList[N];
    
    for(int i=0; i<N; i++){
      par[i] = i;
      size[i] = 1;
    }

    for(int i=0; i<N; i++){
      graph[i] = new ArrayList<>();
      for(a : graph[i]){

        int gp1 = findPar(a[0]);  // par of u
        int gp2 = findPar(a[1]);  // par of v
      }
    }
  }
}
