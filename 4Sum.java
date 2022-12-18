import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
        List<List<Integer>> ab = new ArrayList<>();
        List<List<Integer>> bb = new ArrayList<>();
        Set<List<Integer>> cd = new HashSet<>();
        if(nums.length == 4 && (long)nums[0]+(long)nums[1]+(long)nums[2]+(long)nums[3] == target){
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[0]);
            temp.add(nums[1]);
            temp.add(nums[2]);
            temp.add(nums[3]);
            ab.add(temp);
            return ab;
        }
        else if(nums.length == 4 && (long)nums[0]+(long)nums[1]+(long)nums[2]+(long)nums[3] != target)
        return ab; 
        else {
        int i=0, j = 0;
        int k = 0;
       while(i<nums.length-3){
            j = i+1;
            while(j<nums.length-2) {
              long subTotal = (long)nums[i]+(long)nums[j];
                k= j+1;
                int l = nums.length - 1;
                while(k<l){
                if(subTotal+(long)nums[k]+(long)nums[l] == target){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);
                    ab.add(temp);
                    k++;
                    l--;
                } else if(subTotal+nums[k]+nums[l] > target ){
                    l--;
                } else {
                    k++;
                }
            }
            j++;
            }
            i++;
        }
        for(List list : ab){
            cd.add(list);
        }
        for(List set : cd){
            bb.add(set);
        }
        return bb;
    }
    }
     public static void main(String[] agrs){
        Solution c = new Solution();
        System.out.println(c.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296));
    }
}