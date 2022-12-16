import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ab = new ArrayList<>();
        List<List<Integer>> bb = new ArrayList<>();
        Set<List<Integer>> cd = new HashSet<>();
        if(nums.length == 3 && nums[0]+nums[1]+nums[2] == 0){
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[0]);
            temp.add(nums[1]);
            temp.add(nums[2]);
            ab.add(temp);
            return ab;
        }
        int i=0, j = 0;
        while(i<nums.length-2){
          j= i+1;
         int k = nums.length - 1;
            while(j<k){
                System.out.println(i+"-"+j+"-"+k);
                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ab.add(temp);
                    j++;
                    k--;
                    System.out.println("If 1");
                } else if(nums[i]+ nums[j]+nums[k] > 0 ){
                    k--;
                    System.out.println("If 2");
                } else {
                    j++;
                    System.out.println("If 3");
                }
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
     public static void main(String[] agrs){
        Solution c = new Solution();
        System.out.println(c.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}