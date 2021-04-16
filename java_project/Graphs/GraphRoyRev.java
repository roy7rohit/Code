package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;

public class GraphRoyRev {
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

  public static int searchVtx(int u, int v){
    for(int i=0; i<graph[u].size(); i++){
      Edge e = graph[u].get(i);
      if(e.v == v){
        return i;
      }
    }
    return -1;
  }

  public static void removeEdge(int u, int v){
    int idx1 = searchVtx(u, v);
    graph[u].remove(idx1);

    int idx2 = searchVtx(v, u);
    graph[v].remove(idx2);
  }
  

  public static void removeVertex(int u, int v){
    for(int i=graph[u].size() - 1; i>=0; i--){
      Edge e = graph[u].get(i);
      
      removeEdge(u, e.v);
    }
  }

  public static boolean hasPath(int src, int dest, boolean []vis, String path){
    if(src == dest){
      System.out.println(path + src);
      return true;
    }
    vis[src] = true;
    boolean res = false;
    for(Edge e : graph[src]){
      if(!vis[e.v]){
        res = res || hasPath(e.v, dest, vis, path + src);
      }
    }
    return res;
  }

  public static int allPath(int src,int dest,boolean[] vis,String psf,int wsf){
    if(src == dest){
      System.out.println(psf + src + "@" + wsf);
      return 1;
    }
    int count = 0;
    vis[src] = true;
    for(Edge e : graph[src]){
      if(!vis[e.v]){
        count += allPath(e.v, dest, vis, psf + src + " ", wsf + e.w);
      }
    }
    vis[src] = false;
    return count;
  }

  public static class pair{
    String path = "";
    int weight = 0;
    boolean isDestiHit = false;

    pair(String path,int weight,boolean isDestiHit){
        this.path = path;
        this.weight = weight;
        this.isDestiHit = isDestiHit;
    }
}

public static pair maxWeightPath(int src,int dest,boolean[] vis){
  if(src == dest){
    return new pair("" + src , 0, true);
  }

  pair myPair = new pair("", 0, false);
  vis[src] = true;
  for(Edge e : graph[src]){
    if(!vis[e.v]){
      pair recPair = maxWeightPath(e.v, dest, vis);
      if(recPair.isDestiHit && recPair.weight + e.w > myPair.weight){
        myPair.weight = recPair.weight + e.w;
        myPair.path = recPair.path + src;
        recPair.isDestiHit = true;
      }
    }
  }
  vis[src] = false;
  return myPair;
}

public static int hamiltonionPath(int src, int osrc, int edgeCount, boolean[] vis, String psf){
  if(edgeCount == N - 1){
    psf += src;
    int idx = searchVtx(src, osrc);
    if(idx != -1){
      System.out.println("Cycle -> " + psf);
    }else{
      System.out.println("No-Cycle -> " + psf);
    }
    return 1;
  }

  vis[src] = true;
  int count = 0;
  for(Edge e : graph[src]){
    if(!vis[e.v]){
      count += hamiltonionPath(e.v, osrc, edgeCount + 1, vis, psf + src + " ");
    }
  }
  vis[src] = false;
  return count;
}

public static void GCC(int src, boolean []vis){
  vis[src] = true;
  for(Edge e : graph[src]){
    if(!vis[e.v]){
      GCC(e.v, vis);
    }
  }
}

public static int GCC_(int src, int dest, boolean[] vis){
  int count = 0;
  for(int i=0; i<N; i++){
    if(!vis[i]){
      GCC(i, vis);
      count++;
    }
  }

  return count;
}

// BFS : ========================================================================================================

public static void BFS_01(int src, boolean[] vis){
  LinkedList<Integer> que = new LinkedList<>();
  que.addLast(src);

  boolean cycle = false;
  while(que.size() != 0){
    int vtx = que.removeFirst();

    if(vis[vtx]){
      cycle = true;
      continue;
    }

    vis[vtx] = true;

    for(Edge e : graph[vtx]){
      if(!vis[e.v]){
        que.addLast(e.v);
      }
    }
  }
}

public static void BFS_02(int src, boolean []vis){
  LinkedList<Integer> que = new LinkedList<>();
  que.addLast(src);
  que.addLast(null);

  boolean cycle = false;
  int level = 0;
  int dest = 6;

  while(que.size() != 1){
    int vtx = que.removeFirst();
    
    if(vis[vtx]){
      cycle = true;
      continue;
    }

    if(vtx == dest){
      System.out.println(level);
    }

    vis[vtx] = true;

    for(Edge e : graph[vtx]){
      if(!vis[e.v]){
        que.addLast(e.v);
      }
    }
    if(que.getFirst() == null){
      level++;
      que.addLast(que.removeFirst());
    }
  }
}

public static void BFS_03(int src, boolean []vis){
  LinkedList<Integer> que = new LinkedList<>();
  que.addLast(src);
  
  boolean cycle = false;
  int level = 0;
        
  int[] dis = new int[N];
  while(que.size() != 0){
    int size = que.size();
    while(size-- > 0){
      int vtx = que.removeFirst();

      if(vis[vtx]){
        cycle = true;
        continue;
      }

      dis[vtx] = level;
      vis[vtx] = true;
      for(Edge e : graph[vtx]){
        if(!vis[e.v]){
          que.addLast(e.v);
        }
      }
    }
    level++;
  }
}

public static void BFS_04(int src, boolean []vis){
  LinkedList<Integer> que = new LinkedList<>();
  
  que.addLast(src);
  vis[src] = true;

  int level = 0;
  int []dist = new int[N];

  while(que.size() != 0){
    int size = que.size();
    while(size-- > 0){
      int vtx = que.removeFirst();
      
      dist[vtx] = level;

      for(Edge e : graph[vtx]){
        if(!vis[e.v]){

          vis[e.v] = true;
          que.addLast(e.v);

        }
      }
    }
    level++;
  }

}

//================================================================================================================

  public static void display(){
    for(int i=0;i<N;i++){
        System.out.print(i + " -> ");
        for(Edge e: graph[i]){
            System.out.print("(" + e.v + ", " + e.w + "), ");
        }

        System.out.println();
    }
}

public static void constructGraph(){
  for(int i = 0;i<N;i++) graph[i] = new ArrayList<Edge>();

  addEdge(0,1,10);
  addEdge(0,3,10);
  addEdge(1,2,10);
  addEdge(2,3,40);
  addEdge(3,4,2);
  addEdge(4,5,2);
  addEdge(4,6,8);
  addEdge(5,6,3);

  // removeVtx(3);
  // addEdge(2,5,1);
  // addEdge(2,7,1);
  // addEdge(2,8,1);
  // addEdge(7,8,1);

  display();
  boolean []vis = new boolean[N];
  System.out.println(hasPath(0, 6, vis, ""));
}
  public static void main(String[] args) {
    constructGraph();
  }
}
