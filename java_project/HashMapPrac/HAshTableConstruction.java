package HashMap;

import java.util.LinkedList;

public class HAshTableConstruction {

  private class HTPair<k, v> {
    k key;
    v value;

    HTPair(k key, v value){

      this.key = key;
      this.value = value;
    }

    private LinkedList<HTPair>[] bucketArray;

  }
  
}