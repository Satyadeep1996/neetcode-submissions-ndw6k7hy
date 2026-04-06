class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numSet = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            numSet.put(nums[i], i);
            System.out.println(nums[i] + " : " + i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            System.out.println("diff : " + target + " - " + nums[i] + " = " + diff);
            if(numSet.containsKey(diff) && numSet.get(diff) != i){
                System.out.println("diff Contains: ");
                return new int[]{i, numSet.get(diff)};
            }
        }
        return new int[]{0,0};
    }
}
