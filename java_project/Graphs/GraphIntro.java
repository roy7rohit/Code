package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphIntro {
  private class Vertex{
    
    HashMap<String, Integer> nbrs = new HashMap<>();

  }

  HashMap<String, Vertex> vtces = new HashMap<>();

  // public Graph(){
  //   vtces = new HashMap<>();
  // }

  //the number of vertex in a graph
  public int numVertex(){
    return this.vtces.size();
  }

  //check whether the vertex contains in the graph or not using hashMAp().
  public boolean containsVertex(String vname){
  return this.vtces.containsKey(vname);
}

  //firstly we create a independent vertex then connect with the graph's vertices.
  public void addVertex(String vname){
    Vertex vtx = new Vertex();
    vtces.put(vname, vtx);
  } 

  public void removeVertex(String vname){

    Vertex vtx = vtces.get(vname);//vtx main vname ka address get kar liyaa
    ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());

    for(String key : keys){

      Vertex nbrVtx = vtces.get(key);
      nbrVtx.nbrs.remove(vname);
    }

      vtces.remove(vname);

  }

  //the no of edges in a graph contained in an ArrayList<>(). 

  public int numEdges(){

    int count = 0;

    ArrayList<String> keys = new ArrayList<>(vtces.keySet());
    for(String key : keys){

      Vertex vtx = vtces.get(key);
      count += vtx.nbrs.size();
    }

    return count/2;

  }

  public boolean containsEdge(String vname1, String vname2){

    Vertex vtx1 = vtces.get(vname1);
    Vertex vtx2 = vtces.get(vname2);

    //if my verteces contains null and my vertex can't find it's neighbours this mean that there is null in my nodes value then it will return false. 
    if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){

      return false;
    }
    //else return true if it finds the neighbours.
    return true;
  }

  public void addEdge(String vname1, String vname2, int cost){


    Vertex vtx1 = vtces.get(vname1);//2k
    Vertex vtx2 = vtces.get(vname2);//4k

    //if my verteces contains null and my vertex can find it's neighbours this mean that there is no neighbour present in my nodes value then it will return and not execute further.
    
    //vtx1 == null || vtx2 == null means that these vertices are not present in HashMAp<>().
    if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)){

      return;
    }

    vtx1.nbrs.put(vname2, cost);//2k neighbours put C with a given cost
    vtx2.nbrs.put(vname1, cost);//4k neighbours put A with a given cost

  }

  public void removeEdge(String vname1, String vname2){

    Vertex vtx1 = vtces.get(vname1);
    Vertex vtx2 = vtces.get(vname2);

    if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
      return;
    }

    vtx1.nbrs.remove(vname2);//2k neighbours remove C.
    vtx1.nbrs.remove(vname1);//4k neighbours remove A.
  }

  public boolean hasPath(String src, String dest, HashMap<String, Boolean> processed){
    processed.put(src, true);

    //direct edge

    if(containsEdge(src, dest)){
      return true;
    }

    Vertex vtx = vtces.get(src);
    ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
    for(String nbr : nbrs){
      if(!processed.containsKey(nbr) && hasPath(nbr, dest, processed)){

        return true;
      }
    }

    return false;
  }

  public void display(){

    System.out.println("==============================================================");
    ArrayList<String> keys = new ArrayList<>(vtces.keySet());
    for(String key : keys){

      Vertex vtx = vtces.get(key);
      System.out.println(key + " : " + vtx.nbrs);
    }
    
    System.out.println("=================================================================");
  }
}