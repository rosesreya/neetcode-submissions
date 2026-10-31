
class Solution {
    int count = 0;
    HashSet<Integer> set = new HashSet<>();
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                count = 1;
            }
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
    }
}