
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxCharFrequency {

  public static char getMaxFreq(String str){

    HashMap<Character, Integer> map = new HashMap<>();
    for(int i=0; i<str.length(); i++){
      char cc = str.charAt(i);
      map.put(cc, map.getOrDefault(cc, 0) + 1);
    }

     char maxch = '\0';
    int max = 0;
    Set<Map.Entry<Character,Integer>> entries = map.entrySet();
    for(Map.Entry<Character,Integer> entry : entries){
      if(entry.getValue() > max){

      max = entry.getValue();
      System.out.println(max);
      maxch = entry.getKey();

    }
  }
  return maxch;
  }

  //========================================================================================================

  public static void duplicateWords(String str){
    String []ans = str.split(" ");
    HashMap<String, Integer> map = new HashMap<>();

    //check each word
    for(String s : ans){

      map.put(s.toLowerCase(), map.getOrDefault(s.toLowerCase(), 0) + 1);
      // if(map.containsKey(s.toLowerCase())){
      //   map.put(s.toLowerCase(), map.get(s.toLowerCase()) + 1);
      // }
      // else{
      //   map.put(s.toLowerCase(), 1);
      // }
    }

    //extract all key of word counts
    Set<String> set = map.keySet();
    for(String s : set){
      if(map.get(s) > 1){
        System.out.println(s + " " + map.get(s));
      }
    }
  }


  public static void main(String[] args) {
    
    System.out.println(getMaxFreq("aaabbbccbbaaaabceddaa"));
    // duplicateWords("Bread butter and bread");
    // duplicateWords("Java is java again java");
    // duplicateWords("Super Man Bat Man Spider Man");

  }

}