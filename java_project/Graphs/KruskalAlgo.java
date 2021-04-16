package Graphs;
import java.util.ArrayList;

public class KruskalAlgo {
  public static class Edge{
    int v = 0;
    int w = 0;

    Edge(int v, int w){
      this.v = v;
      this.w = w;
    }
  }

  static int N = 7;
  @SuppressWarnings("unchecked")
  static ArrayList<Edge>[] graph = new ArrayList[N];

  public static void addEdge(int u, int v, int w){
    graph[u].add(new Edge(v, w));
    graph[v].add(new Edge(u, w));
  }

  public static void display(){
    for(int i=0;i<N;i++){
        System.out.print(i + " -> ");
        for(Edge e: graph[i]){
            System.out.print("(" + e.v + ", " + e.w + "), ");
        }

        System.out.println();
    }
  }

  // Kruskal Algo : ==========================================================================================

  static int []par, size;
  public static int findPar(int u){
    if(par[u] == u){
      return u;
    }
    return par[u] = findPar(par[u]);
  }

  public static void merge(int p1, int p2){
    if(size[p1] < size[p2]){
      par[p1] = p2;
      size[p2] += size[p1];
    }else{
      par[p2] = p1;
      size[p1] += size[p2];
    }
  }

  public static void unionFind(int noOfVertex, int [][]edges){
    int n = noOfVertex;
    for(int i=0; i<n; i++){
      par[i] = i;
      size[i] = 1;
    }

    for(int[] e : edges){
      int gp1 = findPar(e[0]); // global par of u
      int gp2 = findPar(e[1]); // global par of v

      if(gp1 != gp2){
        merge(gp1, gp2);
        addEdge(e[0], e[1], e[2]);
      }
    }
  }

  public static void kruskalAlgo(int noOfVertex, int [][]edges){
    int n = noOfVertex;
    graph = new ArrayList[n];
  }

}
