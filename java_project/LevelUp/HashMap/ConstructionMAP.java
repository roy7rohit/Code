package LevelUp.HashMap;

import java.util.LinkedList;

public class ConstructionMAP {
  public class HashTable<K, V>{
    private class HTPair{
      K key;
      V value;

      HTPair(K key, V value){
        this.key = key;
        this.value = value;
      }

      public boolean equal(Object other){  //compare two HTPairs in the basis of their key
        HTPair otherPair = (HTPair) other;
        return this.key.equals(otherPair.key); // if two keys are equal in HTPair then return true elae false
      }

      public String toString(){
        return "{" + this.key + "->" + this.value + "}";
      }
    }

    public static final int DEFAULT_CAPACITY = 10;
    private LinkedList<HTPair>[] bucketArray;
    private int size;
    
    public HashTable(){
      this(DEFAULT_CAPACITY);
    }

    public HashTable(int defaultCapacity) {
      this.bucketArray = (LinkedList<HTPair>[])new LinkedList[DEFAULT_CAPACITY];//typecast it to make likedlist of type LL<HTPair>[]
      this.size = 0;
    }

    public void put(K key, V Value){
      int bestIdx = hashFunction(key);
      LinkedList<HTPair> bucket = this.bucketArray[bestIdx];
      HTPair pta = new HTPair(key, value);//new pairt to be added : pta
      
      if(bucket == null){
        bucket = new LinkedList<>();
        bucket.addLast(pta);
        this.bucketArray[bestIdx] = bucket;
        this.size++;
      }
      else{
        int findAt = bucket.find(pta);
      }
    }



    private int hashFunction(K key) {
      int hashCode = key.hashCode();
      hashCode = Math.abs(hashCode);
      int bestIdx = hashCode % this.bucketArray.length;
      return bestIdx;
    }
  }
}