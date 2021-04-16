package Graphs;
import java.util.ArrayList;

public class GraphNew {
  public static void main(String[] args) {
    
    solve();
  }

  public static class Edge{

    int v;
    int w;

    Edge(int v, int w){
      this.v = v;
      this.w = w;
    }
  }
  static int size = 7;
  static ArrayList<Edge>[] graph = new ArrayList[size]; 


  public static void display(){
    for(int i=0; i<size; i++){
      System.out.print(i + " -> ");
      for(Edge e : graph[i]){
        System.out.print("(" + e.v + ", " + e.w + ") ");
      }
      System.out.println();
    }
  }

  public static void constructor() {
    // Arrays.fill(graph, new ArrayList<Edge>());

    for (int i = 0; i < size; i++) {
        ArrayList<Edge> ar = new ArrayList<>();
        graph[i] = ar;
    }

    addEdge(0, 1, 10);
    addEdge(0, 3, 10);
    addEdge(1, 2, 10);
    addEdge(2, 3, 40);
    addEdge(3, 4, 2);
    addEdge(4, 5, 2);
    addEdge(4, 6, 8);
    addEdge(5, 6, 3);

    display();
}


  public static void addEdge(int u, int v, int w){
    graph[u].add(new Edge(v, w));
    graph[v].add(new Edge(u, w));
  }

public static int findVtx(int u, int v){
  int idx = -1;
  for(int i=0; i<graph[u].size(); i++){
    Edge e = graph[u].get(i);

    if(e.v == v){

      idx = i;
      break;
    }
  }
  return idx;
}

public static void removeEdge(int u, int v){
  int idx1 = findVtx(u, v);
  int idx2 = findVtx(v, u);

  graph[u].remove(idx1);
  graph[v].remove(idx2);
}

public static void removeVtx(int u, int v){

  while(graph[u].size() != 0){
    v = graph[u].get(graph[u].size() - 1).v;
    removeEdge(u, v);
  }
}

public static boolean hasPath(int src, int dest, boolean[] path){
  if(src == dest){
    return true;
  }

  path[src] = true; //mark
  boolean res = false;
  for(Edge e : graph[src]){
    if(!path[e.v]){

      res = res || hasPath(e.v, dest, path);
    }
  }
  return res;
}
public static int hasAllPath(int src, int dest, int wsf, boolean []vis, String path){
  if(src == dest){
    System.out.println(path + dest + " $ " + wsf);
    return 1;
  }

  vis[src] = true;
  int count = 0;
  for(Edge e : graph[src]){
    if(!vis[e.v]){
      count += hasAllPath(e.v, dest, wsf + e.w, vis, path + src + " ");
    }
}

vis[src] = false;
return count; 
}

public static void solve() {
  constructor();
  // System.out.println(hasPath(0, 6, new boolean [size]));
//   // AllPath(0, 6, 0, vis, "");
//   // System.out.println(hwp + " @ " + hw);
//   // System.out.println(lwp + " @ " + lw);
System.out.println(hasAllPath(0, 6, 0, new boolean [size], " "));
// }
}
}