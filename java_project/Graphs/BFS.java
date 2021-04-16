package Graphs;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;

public class BFS {
  private class Vertex{

    HashMap<String, Integer> nbrs = new HashMap<>();
  }

  HashMap<String, Vertex> V = new HashMap<>();

  public int numVertex(){
    return this.V.size();
  }

  
  private class Pair{

    String vname;
    String psf;

  }

  public boolean bfs01(String src, String dest){
    LinkedList<Pair> queue = new LinkedList<>();
    Pair sp = new Pair();
    HashMap<String, Boolean> processed = new HashMap<>();
    
    //create new pair
    sp.vname = src;
    sp.psf = src;
    
    //put the new pair in queue
    queue.addLast(sp);
    while(!queue.isEmpty()){

      //remove a pair from queue
      Pair rp = queue.removeFirst();

      if(processed.containsKey(rp.vname)){
        continue;
      }
      
      processed.put(rp.vname, true);

      //direct edge
      if(containEdge(rp.vname, dest)){

        System.out.println(rp.psf + dest);
        return true;
      }

      //get on work neighbours

      Vertex rpvtx = V.get(rp.vname);
      ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());


      //loop on neighbours
      for(String nbr : nbrs){

        //processed only unprocessed neighbours
        if(!processed.containsKey(nbr)){

          //make a pair of neighbour and put it in queue
          Pair np = new Pair();
          np.vname = nbr;
          np.psf = rp.psf + nbr;
          queue.addLast(np);

        }
      }
    }
    return false;
  }
  public boolean containEdge(String vname1, String vname2){
    Vertex vtx1 = V.get(vname1);
    Vertex vtx2 = V.get(vname2);

    if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
      return false;
    }

    return true;
  
  }

  public void  display(){

    ArrayList<String> keys = new ArrayList<>(V.keySet());
    for(String key : keys){

      Vertex vtx = V.get(key);
      System.out.println(key + " -> " + vtx.nbrs);
    }
  }
public void addVertex(String vname) {

  Vertex vtx = new Vertex();
  V.put(vname, vtx);
}

public void addEdge(String vname1, String vname2, int cost){
  Vertex vtx1 = V.get(vname1);
  Vertex vtx2 = V.get(vname2);
  
  if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)){
    return;

  }

  vtx1.nbrs.put(vname2, cost);
  vtx2.nbrs.put(vname1, cost);

}
//************************************************************************************************
  public boolean dfs(String src, String dest){

    LinkedList<Pair> stack = new LinkedList<>();
    Pair sp = new Pair();
    HashMap<String, Boolean> processed = new HashMap<>();
    
    //create new pair
    sp.vname = src;
    sp.psf = src;
    
    // put the new pair in queue
    stack.addFirst(sp);
    while(!stack.isEmpty()){

      //remove a pair from queue
      Pair rp = stack.removeFirst();

      if(processed.containsKey(rp.vname)){
        continue;
      }
      processed.put(rp.vname, true);

      //direct edge
      if(containEdge(rp.vname, dest)){

        System.out.println(rp.psf + dest);
        return true;
      }

      //get on work neighbours

      Vertex rpvtx = V.get(rp.vname);
      ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());


      //loop on neighbours
      for(String nbr : nbrs){

        //processed only unprocessed neighbours
        if(!processed.containsKey(nbr)){

          //make a pair of neighbour and put it in queue
          Pair np = new Pair();
          np.vname = nbr;
          np.psf = rp.psf + nbr;

          stack.addFirst(np);

        }
      }
    }
    return false;
  }

}

