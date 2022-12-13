import java.util.Arrays;  
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[] = new int[2];
        int start = 0;
        int end = numbers.length-1;
        if(numbers == null && numbers.length < 2){
            return a;
        }
        int v =0;
        while(start < end){
            v = numbers[start]+numbers[end];
            if( v == target){
               a[0] = start;
               a[1] = end;
               break;
            }
            else if(v > target){
                end--;
            } else {
                start++;
            }
        }
    return a;
}
        public static void main(String[] agrs){
            Solution cd = new Solution();
            System.out.println(Arrays.toString(cd.twoSum(new int[]{1,3,5},4)));
        }
}