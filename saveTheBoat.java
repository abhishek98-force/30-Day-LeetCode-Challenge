import java.util.*;
class Solution {
       public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length-1;
        int noOfBoats= 0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            } else {
                j--;
            }
            noOfBoats++;
        }
        return noOfBoats;
    }
    public static void main(String[] agrs){
        Solution c = new Solution();
        System.out.println(c.numRescueBoats(new int[]{1,2},3));
    }
}