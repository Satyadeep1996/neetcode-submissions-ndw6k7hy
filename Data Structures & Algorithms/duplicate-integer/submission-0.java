class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> counts = new HashMap<Integer,Integer>();
        for(int i : nums){
            if(counts.containsKey(i)){
                return true;
            }else{
                counts.put(i, 1);
            }
        }
        return false;
    }
}