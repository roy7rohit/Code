package Graphs;

public class GraphCloneClient {
  
  public static void main(String[] args) {
    
    GraphClone graph1 = new GraphClone();
    graph1.addVertex("A");
    graph1.addVertex("B");
    graph1.addVertex("C");
    graph1.addVertex("D");
    graph1.addVertex("E");
    graph1.addVertex("F");
    graph1.addVertex("G");

    graph1.addEdge("A", "B", 2);
    graph1.addEdge("A", "D", 3);
    graph1.addEdge("B", "C", 1);
    graph1.addEdge("C", "D", 8);
    graph1.addEdge("D", "E", 10);
    graph1.addEdge("E", "F", 45);
    graph1.addEdge("E", "G", 7);
    graph1.addEdge("F", "G", 8);

    graph1.display();
  }
}