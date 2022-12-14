class Solution {
    public boolean judgeSquareSum(int c) {
        int end = (int)Math.sqrt(c);
        long start = 0;
        Boolean flag = false;
        long v;
        while(start<=end){
            v = start*start+end*end;
            if( v == c){
                return true;
            } else if (v > c){
               end--;
            } else {
                start++;
            }
        }
        return false;
    }
    public static void main(String[] agrs){
        Solution c = new Solution();
        System.out.println(c.judgeSquareSum(37));
    }
}