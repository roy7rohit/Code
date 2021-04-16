package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;

public class TopologicalGraph {
 
  static int N = 7;
  
  @SuppressWarnings("unchecked")
  static ArrayList<Integer>[] graph = new ArrayList[N];

  public static void addEdge(int u, int v){
    graph[u].add(v);
  }

  public static void display(){
    for(int i=0;i<N;i++){
        System.out.print(i + " -> ");
        for(Integer e: graph[i]){
            System.out.print(e + ", ");
        }

        System.out.println();
    }
  }

  //Topological Order using DFS : =============================================================================

  public static void TopoDFS(int src, ArrayList<Integer> ans, boolean[] vis){

    vis[src] = true;
    for(int e : graph[src]){
      if(!vis[e]){
        TopoDFS(e, ans, vis);
      }
    }

    ans.add(src);
  }

  public static void TopoDFS(){
    ArrayList<Integer> ans = new ArrayList<>();
    boolean []vis = new boolean[N];

    for(int i=0; i<N; i++){
      if(!vis[i]){
        TopoDFS(i, ans, vis);
      }
    }
  }

  // Topological Order using BFS : ===========================================================================

  public static void TopoBFS(){
    ArrayList<Integer> ans = new ArrayList<>();
    LinkedList<Integer> que = new LinkedList<>();
    int []indegree = new int[N];

    for(int i=0; i<N; i++){
      for(int e : graph[N]){
        indegree[e]++;
      }
    }

    for(int i=0;i<N; i++){
      if(indegree[i] == 0){
        que.addLast(i);
      }
    }

    while(que.size() != 0){
      int vtx = que.removeFirst();
      ans.add(vtx);

      for(int e : graph[vtx]){
        if(--indegree[e] == 0){
          que.addLast(e);
        }
      }
    }

    if(ans.size() != N){
      System.out.println("Cycle");
    }else{
      System.out.println(ans);
    }
  }

  //Topological detect cycle using DFS : ======================================================================

  // 0 -> not visited, 1 -> part of path, 2 -> visited and not a part of path.
  public static boolean TopoDFS_Cycle(int src, int []vis, ArrayList<Integer> ans){
    vis[src] = 1;
    for(Integer e : graph[src]){
      if(vis[e] == 0){
          if(TopoDFS_Cycle(e, vis, ans)){
            return true;
          }
      }else if(vis[e] == 1){
          return true;
      }
    }
    ans.add(src);
    vis[src] = 2;
    return false;
  }

  public static void TopoDFS_Cycle(){
    ArrayList<Integer> ans = new ArrayList<>();
    int[] vis = new int[N];
    
    boolean cycleFound = false;
    for(int i=0; i<N; i++){
      if(vis[i] == 0){
        if(TopoDFS_Cycle(i, vis, ans)){
          cycleFound = true;
          break;
        }
      }
    }

    if(!cycleFound){
      System.out.println(ans);
    }else{
      System.out.println("Cycle");
    }
  }
}


