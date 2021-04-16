package Graphs;

import java.util.HashMap;
import java.util.ArrayList;

public class GraphClone {
    private class Vertex{

      HashMap<String, Integer> nbrs = new HashMap<>();
    }

    HashMap<String, Vertex> V = new HashMap<>();

    public int numVertex(){
      return this.V.size();
    }

    public boolean containVertex(String vname){
      return this.V.containsKey(vname);
    }

    public void addVertex(String vname){
      Vertex vtx = new Vertex();
      V.put(vname, vtx);

    }

      public void removeVertex(String vname){

        Vertex vtx = V.get(vname);
        ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());

        for(String key : keys){

          Vertex nbrVertex = V.get(key);
          nbrVertex.nbrs.remove(vname);
        }

        V.remove(vname);
      }

      public int numEdges(){

        int count = 0;
        ArrayList<String> keys = new ArrayList<>(V.keySet());
        for(String key : keys){

          Vertex vtx = V.get(key);
          count += vtx.nbrs.size();

        }

        return count / 2;
      }

      public boolean containEdge(String vname1, String vname2){
        Vertex vtx1 = V.get(vname1);
        Vertex vtx2 = V.get(vname2);

        if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){
          return false;
        }

        return true;
      
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

      public void removeEdge(String vname1, String vname2){
        Vertex vtx1 = V.get(vname1);
        Vertex vtx2 = V.get(vname2);

        if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)){

          return;
        }

        vtx1.nbrs.remove(vname2);
        vtx2.nbrs.remove(vname1);
      }

      public boolean hasPath(String src, String dest, HashMap<String, Boolean> processed){
        processed.put(src, true);

        if(containEdge(src, dest)){
          return true;
        }
        Vertex vtx = V.get(src);
        ArrayList<String> nbrs = new ArrayList<>(vtx.nbrs.keySet());
        for(String nbr : nbrs){

          if(!processed.containsKey(nbr) && hasPath(src, dest, processed)){

            return false;
          }
        }
        return true;

      }

      public void display(){

        System.out.println("*******************************************************************");
        ArrayList<String> keys = new ArrayList<>(V.keySet());
        for(String key : keys){

          Vertex vtx = V.get(key);
          System.out.println(key + " -> " + vtx.nbrs);

        }
      System.out.println("*****************************************************************");
      }
    }
