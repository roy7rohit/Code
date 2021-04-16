package Graphs;

public class BFsClient {
 public static void main(String[] args) {
  BFS graph1 = new BFS();
  
  graph1.addVertex("A");
  graph1.addVertex("H");
  graph1.addVertex("C");
  graph1.addVertex("D");
  graph1.addVertex("E");
  graph1.addVertex("F");
  graph1.addVertex("G");

  graph1.addEdge("A", "H", 2);
  graph1.addEdge("A", "D", 3);
  graph1.addEdge("H", "C", 1);
  graph1.addEdge("C", "D", 8);
  graph1.addEdge("D", "E", 10);
  graph1.addEdge("E", "F", 45);
  graph1.addEdge("E", "G", 7);
  graph1.addEdge("F", "G", 8);

  graph1.display();

  // System.out.println(graph1.bfs("A", "F"));
  System.out.println(graph1.dfs("A", "F"));
 } 
}