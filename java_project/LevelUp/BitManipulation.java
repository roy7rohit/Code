package LevelUp;

public class BitManipulation {
  
  public static int offonBits(int x, int k){ //if that bit is off than on else leave as it is
    int mask = (1 << k);
    return (x | mask);
  }

  public static int onoffBits(int x, int k){
    int mask = (~(1 << k));
    return (x & mask);
  }

  public static int noOfOneBits_01(int x){
    int count = 0;
    for(int i=0; i<32; i++){
      int mask = (1 << i);
      if((x & mask) != 0){
        count++;
      }
    }
    return count;
  }

  public static int noOfOneBits_02(int x){
    int count = 0;
    int target = 0;
    while(x != 0 && target < 32){
      if((x & 1) != 0){
        count++;
      }
      x >>>= 1; // >>> is a logical right shift which just shifts the nos 
      // >> is an airthmatic logical right shift which shits the bits as well as it copies the msb
    }
    return count;
  }

  public static int noOfOneBits_03(int x){
    int count = 0;
    while(x != 0){
      count++;
      x = (x & (x - 1)); // this formula will always off the least/last bit
    }
    return count;
  } 
  
  public static int singleNumber(int []nums){
    int ans = 0;
    for(int ele : nums){
      ans ^= ele;
    }

    return ans;
  }

  public static boolean powerOfTwo(int x) {
    if(x < 0){
      return false;
    }
    return x != 0 && (x & (x - 1)) == 0;
  }

  public static void getBit(int x, int k){
    for(int i=0; i <= k - 1; i++){
      k = (1 << k);
    }
    x = (x & k);
    System.out.println(x);
  }

  public static int setBit(int x, int k){
    int mask = 1;
    mask = (1 << k - 1);
    x = x | mask;
    return x;
  }

  public static int resetBit(int x, int k){
    int mask = 1;
    mask = (~(1 << (k - 1)));
    x = (x & mask);

    return x;
  }

  public static int setRightMostBit(int x, int k){
    int pos = 1;
    int mask = 1;
    while((x & mask) == 0){
      pos++;
      mask  = (1 << mask);
    }

    return pos;
  }

  public static int addOne(int x){
    int mask = 1;
    while((x & mask) != 0){
      x ^= mask;
      mask = (1 << (mask));
    }
    // x ^= mask;
    return x;
  }

  public static int reverseBits(int n) {
    int i=0;
    int j=31;
    int num=0;
    while(i<=j)
    {   
        int bit_i= (n & (1<<i))==0?0:1; //finding if ith bit from right is 1 or 0
        int bit_j=( n & (1<<j))==0?0:1; //finding if jth bit from right is 1 or 0
 
        num |= bit_i << j; // setting jth bit from left to bi < swapping ith and   jth bits >
        num |= bit_j << i;  
        i++;
        j--;
    }
    
    return num;
}

  public static void solve(){
    // System.out.println(offonBits(8, 6));
    // System.out.println(onoffBits(8, 3));
    // System.out.println(noOfOneBits_01(16));
    // System.out.println(noOfOneBits_02(15));
    // getBit(31, 7);
    // System.out.println(setBit(15, 4));
    // System.out.println(resetBit(15, 4));
    // System.out.println(setRightMostBit(15, 7));
    System.out.println(addOne(15));

  
  }
  public static void main(String[] args) {
    solve();
  }
}