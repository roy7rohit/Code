package Graphs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GCC {

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


  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for(int i=0; i<N; i++){
      graph[i] = new ArrayList<>();
    }

    for(int i=0; i<N; i++){
      String []parts = br.readLine().split("");
    }


  }
}
