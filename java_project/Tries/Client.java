package Tries;

public class Client {
  public static void main(String[] args) {
    Tries trie = new Tries();
    trie.addWord("arts");
    trie.addWord("art");
    trie.addWord("bug");
    trie.addWord("sea");
    trie.addWord("seen");
    trie.addWord("see");
    trie.addWord("amit");

    trie.display();

    // System.out.println(trie.searchWord("arts"));
    // System.out.println(trie.searchWord("art"));
    // System.out.println(trie.searchWord("roy"));

    System.out.println("*****************************************************************");

    trie.removeWord("arts");
    trie.removeWord("art");
    trie.removeWord("see");
    trie.removeWord("seen");
    // trie.display();

    System.out.println(trie.numWords());


  }
}
