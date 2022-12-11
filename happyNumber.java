import java.util.*;
class Solution {
    List<Integer> inLoop = new ArrayList<Integer>();
    public boolean isHappy(int n) {
      if(n == 1)
        return true;
      else {
        int k = n;
        n = createArray(n);
        inLoop.add(k);
        if(inLoop.contains(n))
            return false;
        else {
            return isHappy(n);
        }
      }
     
    }

    public int createArray(int n){
        int d;
        int total = 0;
        while(n>0){
            d = n%10;
            n=n/10;
            total = total + d*d;
        }
        return total ;
    }

    public static void main(String[] agrs){
        Solution cd = new Solution();
        System.out.println(cd.isHappy(4));
    }
}