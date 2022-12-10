class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int num : nums ){
            if(!count.containsKey(num)){
                count.put(num, 1);
            } else {
                int countInt = count.get(num);
                countInt++;
                count.put(num,countInt);
            }
        }
        Set<Integer> intList = count.keySet();
        for(int a : intList){
            if(count.get(a) == 1){
                return a;
            }
        }
        return 0;
    }
}